package co.com.consultorio.infraestructura.persistencia.antecedentes;

import com.google.inject.Inject;
import org.skife.jdbi.v2.DBI;
import play.db.Database;
import play.libs.Json;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class AntecedenteRepository implements IAntecedenteRepository {

    private AntecedenteTransaccion antecedenteTransaccion;

    private final Database db;

    @Inject
    public AntecedenteRepository(Database db) {
        this.db = db;
        this.antecedenteTransaccion = new DBI(db.getDataSource()).onDemand(AntecedenteTransaccion.class);
    }

    @Override
    public Map<String, Object> antecedentePorIdPaciente(String id, String init, String limit) {
        Map<String, Object> stringMap = new HashMap<>();
        Collection<AntecedenteDTO> antecedenteDTOS = new DBI(db.getDataSource()).onDemand(AntecedenteDAO.class).antecedentePorIdPacientePaginado(id, new BigDecimal(init), new BigDecimal(limit));
        BigDecimal totalRegistros = new DBI(db.getDataSource()).onDemand(AntecedenteDAO.class).contarRegistrosPorPaciente(id);

        stringMap.put("antecedentes", antecedenteDTOS);
        stringMap.put("totalRegistros", totalRegistros);

        return stringMap;
    }


    @Override
    public long add(AntecedenteDTO antecedenteDTO) {
        return antecedenteTransaccion.add(antecedenteDTO);
    }

    @Override
    public long update(AntecedenteDTO antecedenteDTO) {
        return antecedenteTransaccion.update(antecedenteDTO);
    }

}

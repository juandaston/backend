package co.com.consultorio.infraestructura.persistencia.antecedentes;

import com.google.inject.Inject;
import org.skife.jdbi.v2.DBI;
import play.db.Database;

import java.util.Collection;

public class AntecedenteRepository implements IAntecedenteRepository {

    private AntecedenteTransaccion antecedenteTransaccion;

    private final Database db;

    @Inject
    public AntecedenteRepository(Database db) {
        this.db = db;
        this.antecedenteTransaccion = new DBI(db.getDataSource()).onDemand(AntecedenteTransaccion.class);
    }

    @Override
    public Collection<AntecedenteDTO> antecedentePorIdPaciente(String id) {
        return new DBI(db.getDataSource()).onDemand(AntecedenteDAO.class).antecedentePorIdPaciente(id);
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

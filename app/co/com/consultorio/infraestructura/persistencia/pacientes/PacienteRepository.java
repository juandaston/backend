package co.com.consultorio.infraestructura.persistencia.pacientes;

import com.google.inject.Inject;
import org.skife.jdbi.v2.DBI;
import play.db.Database;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PacienteRepository implements IPacienteRepository {

    private PacienteTransaccion pacienteTransaccion;

    private final Database db;

    @Inject
    public PacienteRepository(Database db) {
        this.db = db;
        this.pacienteTransaccion = new DBI(db.getDataSource()).onDemand(PacienteTransaccion.class);
    }

    @Override
    public Map<String, Object> listarPacientes(int init, int limit) {
        Map<String, Object> stringObjectMap = new HashMap<>();
        Collection<PacienteDTO> pacienteDTOS = new DBI(db.getDataSource()).onDemand(PacienteDAO.class).listarPacientes(init, limit);

        BigDecimal totalRegistros = new DBI(db.getDataSource()).onDemand(PacienteDAO.class).contarPacientes();

        stringObjectMap.put("pacientes", pacienteDTOS);
        stringObjectMap.put("totalRegistros", totalRegistros);

        return stringObjectMap;
    }

    @Override
    public Collection<PacienteDTO> pacientePorCedula(String tipoId, String numId) {
        return new DBI(db.getDataSource()).onDemand(PacienteDAO.class).pacientePorCedula(tipoId, numId);
    }

    @Override
    public Collection<PacienteDTO> pacientePorId(String id) {
        return new DBI(db.getDataSource()).onDemand(PacienteDAO.class).pacientePorId(id);
    }


    @Override
    public long add(PacienteDTO pacienteDTO) {
        return pacienteTransaccion.add(pacienteDTO);
    }

    @Override
    public long update(PacienteDTO pacienteDTO) {
        return pacienteTransaccion.update(pacienteDTO);
    }

}

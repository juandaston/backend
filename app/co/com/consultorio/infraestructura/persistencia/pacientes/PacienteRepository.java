package co.com.consultorio.infraestructura.persistencia.pacientes;

import co.com.consultorio.domain.pacientes.Paciente;
import com.google.inject.Inject;
import org.skife.jdbi.v2.DBI;
import play.Logger;
import play.db.Database;
import play.libs.Json;

import java.util.Collection;

public class PacienteRepository implements IPacienteRepository {

    private PacienteTransaccion pacienteTransaccion;

    private final Database db;

    @Inject
    public PacienteRepository(Database db) {
        this.db = db;
        this.pacienteTransaccion = new DBI(db.getDataSource()).onDemand(PacienteTransaccion.class);
    }

    @Override
    public Collection<PacienteDTO> listarPacientes(int init, int limit) {
        return new DBI(db.getDataSource()).onDemand(PacienteDAO.class).listarPacientes(init, limit);
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

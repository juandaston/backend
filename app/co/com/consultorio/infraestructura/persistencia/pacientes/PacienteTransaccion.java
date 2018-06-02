package co.com.consultorio.infraestructura.persistencia.pacientes;

import org.skife.jdbi.v2.sqlobject.CreateSqlObject;
import org.skife.jdbi.v2.sqlobject.Transaction;
import play.Logger;

import java.sql.Date;

public abstract class PacienteTransaccion {

    @CreateSqlObject
    abstract PacienteDAO pacienteDAO();

    @Transaction
    public long add(PacienteDTO pacienteDTO) {
        long id = pacienteDAO().agregarPaciente(
                pacienteDTO.getTipoIdentificacion(),
                pacienteDTO.getNumeroIdentificacion(),
                pacienteDTO.getPrimerNombre(),
                pacienteDTO.getSegundoNombre(),
                pacienteDTO.getPrimerApellido(),
                pacienteDTO.getSegundoApellido(),
                pacienteDTO.getCelular(),
                pacienteDTO.getTelefono(),
                pacienteDTO.getDireccion(),
                null,
                pacienteDTO.getProfesion(),
                pacienteDTO.getObservaciones(),
                pacienteDTO.getSexo(),
                pacienteDTO.getEstadoCivil());

        Logger.info(String.format("Paciente %s registrado con exito", id));
        return id;
    }

    @Transaction
    public long update(PacienteDTO pacienteDTO) {
        long id = pacienteDAO().updatePaciente(
                pacienteDTO.getIdPaciente(),
                pacienteDTO.getTipoIdentificacion(),
                pacienteDTO.getNumeroIdentificacion(),
                pacienteDTO.getPrimerNombre(),
                pacienteDTO.getSegundoNombre(),
                pacienteDTO.getPrimerApellido(),
                pacienteDTO.getSegundoApellido(),
                pacienteDTO.getCelular(),
                pacienteDTO.getTelefono(),
                pacienteDTO.getDireccion(),
                pacienteDTO.getFechaNacimiento(),
                pacienteDTO.getProfesion(),
                pacienteDTO.getObservaciones(),
                pacienteDTO.getSexo(),
                pacienteDTO.getEstadoCivil());

        Logger.info(String.format("Paciente %s registrado con exito", id));
        return id;
    }
}

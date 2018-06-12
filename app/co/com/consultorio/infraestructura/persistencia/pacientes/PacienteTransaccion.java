package co.com.consultorio.infraestructura.persistencia.pacientes;

import org.skife.jdbi.v2.sqlobject.CreateSqlObject;
import org.skife.jdbi.v2.sqlobject.Transaction;
import play.Logger;

import java.sql.Date;
import java.sql.SQLException;

public abstract class PacienteTransaccion {

    @CreateSqlObject
    abstract PacienteDAO pacienteDAO();

    @Transaction
    public long add(PacienteDTO pacienteDTO) {
        long id = 0;
        try {
            id = pacienteDAO().agregarPaciente(
                pacienteDTO.getTipoIdentificacion().trim(),
                pacienteDTO.getNumeroIdentificacion(),
                pacienteDTO.getPrimerNombre() != null ? pacienteDTO.getPrimerNombre().trim().toUpperCase() : "",
                pacienteDTO.getSegundoNombre() != null ? pacienteDTO.getSegundoNombre().trim().toUpperCase() : "",
                pacienteDTO.getPrimerApellido() != null ? pacienteDTO.getPrimerApellido().trim().toUpperCase() : "",
                pacienteDTO.getSegundoApellido() != null ? pacienteDTO.getSegundoApellido().trim().toUpperCase() : "",
                pacienteDTO.getCelular(),
                pacienteDTO.getTelefono(),
                pacienteDTO.getDireccion(),
                pacienteDTO.getFechaNacimiento(),
                pacienteDTO.getProfesion() != null ? pacienteDTO.getProfesion().trim().toUpperCase() : "",
                pacienteDTO.getObservaciones() != null ? pacienteDTO.getObservaciones().trim().toUpperCase() : "",
                pacienteDTO.getSexo() != null ? pacienteDTO.getSexo().trim().toUpperCase() : "",
                pacienteDTO.getEstadoCivil() != null ? pacienteDTO.getEstadoCivil().trim().toUpperCase() : "");

            Logger.info(String.format("Paciente %s registrado con exito", id));

        }catch (Exception e){
            e.printStackTrace();
            Logger.error("Error al ingresar paciente: " + e.getMessage().toString());
        }
        return id;
    }

    @Transaction
    public long update(PacienteDTO pacienteDTO) {
        long id = pacienteDAO().updatePaciente(
                pacienteDTO.getIdPaciente(),
                pacienteDTO.getTipoIdentificacion().trim(),
                pacienteDTO.getNumeroIdentificacion(),
                pacienteDTO.getPrimerNombre() != null ? pacienteDTO.getPrimerNombre().trim().toUpperCase() : "",
                pacienteDTO.getSegundoNombre() != null ? pacienteDTO.getSegundoNombre().trim().toUpperCase(): "",
                pacienteDTO.getPrimerApellido() != null ? pacienteDTO.getPrimerApellido().trim().toUpperCase() : "",
                pacienteDTO.getSegundoApellido() != null ? pacienteDTO.getSegundoApellido().trim().toUpperCase() : "",
                pacienteDTO.getCelular(),
                pacienteDTO.getTelefono(),
                pacienteDTO.getDireccion(),
                pacienteDTO.getFechaNacimiento(),
                pacienteDTO.getProfesion() != null ? pacienteDTO.getProfesion().trim().toUpperCase() : "",
                pacienteDTO.getObservaciones() != null ? pacienteDTO.getObservaciones().trim().toUpperCase() : "",
                pacienteDTO.getSexo() != null ? pacienteDTO.getSexo().trim().toUpperCase() : "",
                pacienteDTO.getEstadoCivil() != null ? pacienteDTO.getEstadoCivil().trim().toUpperCase() : "");

        Logger.info(String.format("Paciente %s registrado con exito", id));
        return id;
    }
}

package co.com.consultorio.domain.pacientes;

import co.com.consultorio.aplicacion.comandos.actualizarPaciente.ActualizarPacienteRequest;
import co.com.consultorio.aplicacion.comandos.ingresarpaciente.IngresarPacienteRequest;
import co.com.consultorio.infraestructura.persistencia.pacientes.PacienteDTO;
import com.google.inject.Singleton;

@Singleton
public class PacienteFactory {

    public PacienteDTO crearPacienteDTODesdeRequest(IngresarPacienteRequest request){
        return new PacienteDTO(request.getIdPaciente(),
                request.getTipoIdentificacion(),
                request.getNumeroIdentificacion(),
                request.getPrimerNombre(),
                request.getSegundoNombre(),
                request.getPrimerApellido(),
                request.getSegundoApellido(),
                request.getCelular(),
                request.getTelefono(),
                request.getDireccion(),
                request.getFechaNacimiento(),
                request.getProfesion(),
                request.getObservaciones(),
                request.getSexo(),
                request.getEstadoCivil()
        );

    }

    public PacienteDTO crearPacienteDTODesdeRequest(ActualizarPacienteRequest request){
        return new PacienteDTO(request.getIdPaciente(),
                request.getTipoIdentificacion(),
                request.getNumeroIdentificacion(),
                request.getPrimerNombre(),
                request.getSegundoNombre(),
                request.getPrimerApellido(),
                request.getSegundoApellido(),
                request.getCelular(),
                request.getTelefono(),
                request.getDireccion(),
                request.getFechaNacimiento(),
                request.getProfesion(),
                request.getObservaciones(),
                request.getSexo(),
                request.getEstadoCivil()
        );

    }
}

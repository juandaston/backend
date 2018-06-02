package co.com.consultorio.aplicacion.comandos.actualizarPaciente;

import co.com.consultorio.aplicacion.api.queries.modelo.Usuario;
import co.com.consultorio.aplicacion.comandos.Command;
import co.com.consultorio.domain.pacientes.PacienteFactory;
import co.com.consultorio.infraestructura.persistencia.pacientes.PacienteDTO;
import co.com.consultorio.infraestructura.persistencia.pacientes.PacienteRepository;
import com.google.inject.Inject;
import play.Logger;
import play.libs.Json;

import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class ActualizarPacienteCommand implements Command<ActualizarPacienteRequest> {

    @Inject
    private PacienteRepository pacienteRepository;
    @Inject
    private PacienteFactory pacienteFactory;

    @Override
    public CompletableFuture<Collection<String>> execute(ActualizarPacienteRequest request, Usuario user) throws InterruptedException {

        Logger.debug("Entro a procesar comando Actualizar paciente");

        PacienteDTO pacienteDTO = pacienteFactory.crearPacienteDTODesdeRequest(request);
        Logger.debug("Paciente DTO " + Json.toJson(pacienteDTO));

        try{
            pacienteRepository.update(pacienteDTO);
        }catch (Exception e){
            Logger.debug("Error ingresando paciente " + e.getMessage());
        }

        return null;
    }
}

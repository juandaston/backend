package co.com.consultorio.aplicacion.comandos.ingresarpaciente;

import co.com.consultorio.aplicacion.api.queries.modelo.Usuario;
import co.com.consultorio.aplicacion.comandos.Command;
import co.com.consultorio.domain.paciente.PacienteFactory;
import co.com.consultorio.infraestructura.persistencia.pacientes.PacienteDTO;
import co.com.consultorio.infraestructura.persistencia.pacientes.PacienteRepository;
import com.google.inject.Inject;
import play.Logger;
import play.libs.Json;

import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class IngresarPacienteCommand implements Command<IngresarPacienteRequest> {

    @Inject
    private PacienteRepository pacienteRepository;
    @Inject
    private PacienteFactory pacienteFactory;

    @Override
    public CompletableFuture<Collection<String>> execute(IngresarPacienteRequest request, Usuario user) throws InterruptedException {

        Logger.debug("Entro a procesar comando Ingresar paciente");

        PacienteDTO pacienteDTO = pacienteFactory.crearPacienteDTODesdeRequest(request);
        Logger.debug("Paciente DTO " + Json.toJson(pacienteDTO));

        try{
            pacienteRepository.add(pacienteDTO);
        }catch (Exception e){
            Logger.debug("Error ingresando paciente " + e.getMessage());
        }

        return null;
    }
}

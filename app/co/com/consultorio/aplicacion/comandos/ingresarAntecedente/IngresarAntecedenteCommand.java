package co.com.consultorio.aplicacion.comandos.ingresarAntecedente;

import co.com.consultorio.aplicacion.api.queries.modelo.Usuario;
import co.com.consultorio.aplicacion.comandos.Command;
import co.com.consultorio.domain.antecedente.AntecedenteFactory;
import co.com.consultorio.domain.paciente.PacienteFactory;
import co.com.consultorio.infraestructura.persistencia.antecedentes.AntecedenteDTO;
import co.com.consultorio.infraestructura.persistencia.antecedentes.AntecedenteRepository;
import co.com.consultorio.infraestructura.persistencia.pacientes.PacienteDTO;
import co.com.consultorio.infraestructura.persistencia.pacientes.PacienteRepository;
import com.google.inject.Inject;
import play.Logger;
import play.libs.Json;

import java.util.Collection;
import java.util.concurrent.CompletableFuture;


public class IngresarAntecedenteCommand implements Command<IngresarAntecedenteRequest> {

    @Inject
    private AntecedenteRepository antecedenteRepository;
    @Inject
    private AntecedenteFactory antecedenteFactory;


    @Override
    public CompletableFuture<Collection<String>> execute(IngresarAntecedenteRequest request, Usuario user) throws InterruptedException {
        Logger.debug("Entro a procesar comando Ingresar antecedentes");

        AntecedenteDTO antecedenteDTO = antecedenteFactory.crearAntecedenteDTODesdeRequest(request);
        Logger.debug("Antecedente DTO " + Json.toJson(antecedenteDTO));

        try{
            antecedenteRepository.add(antecedenteDTO);
        }catch (Exception e){
            Logger.debug("Error ingresando antecedente " + e.getMessage());
        }

        return null;
    }
}

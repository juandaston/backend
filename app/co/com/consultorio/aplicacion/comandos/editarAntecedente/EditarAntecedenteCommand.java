package co.com.consultorio.aplicacion.comandos.editarAntecedente;

import co.com.consultorio.aplicacion.api.queries.modelo.Usuario;
import co.com.consultorio.aplicacion.comandos.Command;
import co.com.consultorio.domain.antecedente.AntecedenteFactory;
import co.com.consultorio.infraestructura.persistencia.antecedentes.AntecedenteDTO;
import co.com.consultorio.infraestructura.persistencia.antecedentes.AntecedenteRepository;
import com.google.inject.Inject;
import play.Logger;
import play.libs.Json;

import java.util.Collection;
import java.util.concurrent.CompletableFuture;


public class EditarAntecedenteCommand implements Command<EditarAntecedenteRequest> {

    @Inject
    private AntecedenteRepository antecedenteRepository;
    @Inject
    private AntecedenteFactory antecedenteFactory;


    @Override
    public CompletableFuture<Collection<String>> execute(EditarAntecedenteRequest request, Usuario user) throws InterruptedException {
        Logger.debug("Entro a procesar comando Editar antecedentes");

        AntecedenteDTO antecedenteDTO = antecedenteFactory.crearAntecedenteDTODesdeRequest(request);
        Logger.debug("Antecedente DTO " + Json.toJson(antecedenteDTO));

        try{
            antecedenteRepository.update(antecedenteDTO);
        }catch (Exception e){
            Logger.debug("Error editando antecedente " + e.getMessage());
        }

        return null;
    }
}

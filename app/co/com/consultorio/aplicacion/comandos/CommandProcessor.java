package co.com.consultorio.aplicacion.comandos;

import co.com.consultorio.aplicacion.api.queries.modelo.Usuario;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import javaslang.Tuple2;
import javaslang.control.Try;
import play.Logger;
import play.mvc.Result;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import static play.mvc.Controller.request;
import static play.mvc.Results.badRequest;
import static play.mvc.Results.ok;

public class CommandProcessor{
    @Inject
    private CommandProvider commandProvider;

    @Inject
    public CommandProcessor(CommandProvider commandProvider) {
        this.commandProvider = commandProvider;
    }

    public CompletionStage<Result> procesarComando() {
        Logger.debug("Entro a procesar comando ");
        JsonNode comandoJson = request().body().asJson();
        String nombreComando = comandoJson.get("comando").asText();
        Tuple2 infraestructuraComando = commandProvider.provide(nombreComando);
        if(infraestructuraComando == null ) {
            return CompletableFuture.completedFuture(badRequest("Comando no reconocido: " + nombreComando));
        }
        CommandDeserializer deserializador = (CommandDeserializer) infraestructuraComando._1;
        Command ejecutor = (Command) infraestructuraComando._2;
        Try.of(() -> ejecutor.execute(deserializador.deserializar(comandoJson), new Usuario("", "","")));

        return CompletableFuture.completedFuture(ok("Comando Recibido"));
    }

}

package co.com.consultorio.aplicacion.comandos;

import co.com.consultorio.aplicacion.api.queries.modelo.Usuario;

import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public interface Command<T extends CommandRequest> {
    CompletableFuture<Collection<String>> execute(T request, Usuario user) throws InterruptedException;
}

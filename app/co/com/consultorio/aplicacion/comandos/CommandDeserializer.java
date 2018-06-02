package co.com.consultorio.aplicacion.comandos;

import com.fasterxml.jackson.databind.JsonNode;

public abstract class CommandDeserializer<T extends CommandRequest> {
    public abstract T deserializar(JsonNode requestJson);
}
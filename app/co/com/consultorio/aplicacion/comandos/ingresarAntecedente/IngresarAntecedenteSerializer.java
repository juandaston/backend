package co.com.consultorio.aplicacion.comandos.ingresarAntecedente;

import co.com.consultorio.aplicacion.comandos.CommandDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import javaslang.control.Try;
import play.Logger;
import play.libs.Json;

public class IngresarAntecedenteSerializer extends CommandDeserializer<IngresarAntecedenteRequest> {
    @Override
    public IngresarAntecedenteRequest deserializar(JsonNode requestJson) {
        Try<IngresarAntecedenteRequest> resultado = Try.of(() -> Json.fromJson(requestJson, IngresarAntecedenteRequest.class));
        if (resultado.isSuccess()) {
            return resultado.get();
        } else {
            Logger.of("errores").error("No fue posible mapear json del comando " + requestJson.get("comando").asText() + "\n", resultado.getCause());
            return null;
        }
    }
}

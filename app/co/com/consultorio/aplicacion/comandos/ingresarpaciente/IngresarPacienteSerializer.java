package co.com.consultorio.aplicacion.comandos.ingresarpaciente;

import co.com.consultorio.aplicacion.comandos.CommandDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import javaslang.control.Try;
import play.Logger;
import play.libs.Json;

public class IngresarPacienteSerializer extends CommandDeserializer<IngresarPacienteRequest> {
    @Override
    public IngresarPacienteRequest deserializar(JsonNode requestJson) {
        Try<IngresarPacienteRequest> resultado = Try.of(() -> Json.fromJson(requestJson, IngresarPacienteRequest.class));
        if (resultado.isSuccess()) {
            return resultado.get();
        } else {
            Logger.of("errores").error("No fue posible mapear json del comando " + requestJson.get("comando").asText() + "\n", resultado.getCause());
            return null;
        }
    }
}

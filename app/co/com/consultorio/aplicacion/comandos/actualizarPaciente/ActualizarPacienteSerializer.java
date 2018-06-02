package co.com.consultorio.aplicacion.comandos.actualizarPaciente;

import co.com.consultorio.aplicacion.comandos.CommandDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import javaslang.control.Try;
import play.Logger;
import play.libs.Json;

public class ActualizarPacienteSerializer extends CommandDeserializer<ActualizarPacienteRequest> {
    @Override
    public ActualizarPacienteRequest deserializar(JsonNode requestJson) {
        Try<ActualizarPacienteRequest> resultado = Try.of(() -> Json.fromJson(requestJson, ActualizarPacienteRequest.class));
        if (resultado.isSuccess()) {
            return resultado.get();
        } else {
            Logger.of("errores").error("No fue posible mapear json del comando " + requestJson.get("comando").asText() + "\n", resultado.getCause());
            return null;
        }
    }
}

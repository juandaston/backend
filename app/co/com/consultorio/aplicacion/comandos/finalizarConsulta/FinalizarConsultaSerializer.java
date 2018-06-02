package co.com.consultorio.aplicacion.comandos.finalizarConsulta;

import co.com.consultorio.aplicacion.comandos.CommandDeserializer;
import co.com.consultorio.aplicacion.comandos.actualizarPaciente.ActualizarPacienteRequest;
import com.fasterxml.jackson.databind.JsonNode;
import javaslang.control.Try;
import play.Logger;
import play.libs.Json;

public class FinalizarConsultaSerializer extends CommandDeserializer<FinalizarConsultaRequest> {

    @Override
    public FinalizarConsultaRequest deserializar(JsonNode requestJson) {
        Try<FinalizarConsultaRequest> resultado = Try.of(() -> Json.fromJson(requestJson, FinalizarConsultaRequest.class));
        if (resultado.isSuccess()) {
            return resultado.get();
        } else {
            Logger.of("errores").error("No fue posible mapear json del comando " + requestJson.get("comando").asText() + "\n", resultado.getCause());
            return null;
        }
    }
}

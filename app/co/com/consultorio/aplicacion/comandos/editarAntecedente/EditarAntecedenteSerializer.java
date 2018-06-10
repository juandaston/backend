package co.com.consultorio.aplicacion.comandos.editarAntecedente;

import co.com.consultorio.aplicacion.comandos.CommandDeserializer;
import co.com.consultorio.aplicacion.comandos.ingresarAntecedente.IngresarAntecedenteRequest;
import com.fasterxml.jackson.databind.JsonNode;
import javaslang.control.Try;
import play.Logger;
import play.libs.Json;

public class EditarAntecedenteSerializer extends CommandDeserializer<EditarAntecedenteRequest> {
    @Override
    public EditarAntecedenteRequest deserializar(JsonNode requestJson) {
        Try<EditarAntecedenteRequest> resultado = Try.of(() -> Json.fromJson(requestJson, EditarAntecedenteRequest.class));
        if (resultado.isSuccess()) {
            return resultado.get();
        } else {
            Logger.of("errores").error("No fue posible mapear json del comando " + requestJson.get("comando").asText() + "\n", resultado.getCause());
            return null;
        }
    }
}

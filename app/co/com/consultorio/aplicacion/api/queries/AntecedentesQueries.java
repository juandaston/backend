package co.com.consultorio.aplicacion.api.queries;

import co.com.consultorio.infraestructura.persistencia.antecedentes.AntecedenteDTO;
import co.com.consultorio.infraestructura.persistencia.antecedentes.AntecedenteRepository;
import com.google.inject.Inject;
import play.libs.Json;
import play.mvc.Result;

import java.util.Collection;
import java.util.Map;

import static play.mvc.Results.ok;

public class AntecedentesQueries {

    @Inject
    private AntecedenteRepository antecedenteRepository;

    public Result antecedentesPorIdPaciente(String id, String init, String limit){
        Map<String, Object> antecedentesPorIdPaciente =
                antecedenteRepository.antecedentePorIdPaciente(id, init, limit);
        return ok(Json.toJson(antecedentesPorIdPaciente));
    }
}

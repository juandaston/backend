package co.com.consultorio.aplicacion.api.queries;

import co.com.consultorio.infraestructura.persistencia.antecedentes.AntecedenteDTO;
import co.com.consultorio.infraestructura.persistencia.antecedentes.AntecedenteRepository;
import com.google.inject.Inject;
import play.libs.Json;
import play.mvc.Result;

import java.util.Collection;

import static play.mvc.Results.ok;

public class AntecedentesQueries {

    @Inject
    private AntecedenteRepository antecedenteRepository;

    public Result antecedentesPorIdPaciente(String id){
        System.out.println("sdfsdfds");
        Collection<AntecedenteDTO> antecedentesPorIdPaciente =
                antecedenteRepository.antecedentePorIdPaciente(id);
        return ok(Json.toJson(antecedentesPorIdPaciente));
    }
}

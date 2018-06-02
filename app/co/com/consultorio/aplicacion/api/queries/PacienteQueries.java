package co.com.consultorio.aplicacion.api.queries;

import co.com.consultorio.infraestructura.persistencia.pacientes.PacienteDTO;
import co.com.consultorio.infraestructura.persistencia.pacientes.PacienteRepository;
import com.google.inject.Inject;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.Collection;

public class PacienteQueries extends Controller {

    @Inject
    private PacienteRepository pacienteRepository;

    public Result listarPacientes(String init, String limit) {
        Collection<PacienteDTO> listaPacientes =
                pacienteRepository.listarPacientes(new Integer(init), new Integer(limit));
        return ok(Json.toJson(listaPacientes));
    }

    public Result pacientePorCedula(String tipoId, String numId) {
        Collection<PacienteDTO> pacientePorCedula =
                pacienteRepository.pacientePorCedula(tipoId, numId);
        return ok(Json.toJson(pacientePorCedula.stream().findFirst()));
    }

    public Result pacientePorId(String id){
        System.out.println("sdfsdfds");
        Collection<PacienteDTO> pacientePorId =
                pacienteRepository.pacientePorId(id);
        return ok(Json.toJson(pacientePorId.stream().findFirst()));
    }
}

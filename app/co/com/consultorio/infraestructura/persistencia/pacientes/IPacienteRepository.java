package co.com.consultorio.infraestructura.persistencia.pacientes;

import java.util.Collection;
import java.util.Map;

public interface IPacienteRepository {

    Map<String, Object> listarPacientes(int init, int limit);
    Collection<PacienteDTO> pacientePorCedula(String tipoId, String numId);
    Collection<PacienteDTO> pacientePorId(String id);
    long add(PacienteDTO pacienteDTO);
    long update(PacienteDTO pacienteDTO);
}

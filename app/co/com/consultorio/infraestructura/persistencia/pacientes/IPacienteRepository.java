package co.com.consultorio.infraestructura.persistencia.pacientes;

import java.util.Collection;

public interface IPacienteRepository {

    Collection<PacienteDTO> listarPacientes(int init, int limit);
    Collection<PacienteDTO> pacientePorCedula(String tipoId, String numId);
    Collection<PacienteDTO> pacientePorId(String id);
    long add(PacienteDTO pacienteDTO);
    long update(PacienteDTO pacienteDTO);
}

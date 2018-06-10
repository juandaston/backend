package co.com.consultorio.infraestructura.persistencia.antecedentes;

import java.util.Map;

public interface IAntecedenteRepository {

    Map<String, Object> antecedentePorIdPaciente(String id, String init, String limit);
    long add(AntecedenteDTO antecedenteDTO);
    long update(AntecedenteDTO antecedenteDTO);
}

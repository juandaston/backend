package co.com.consultorio.infraestructura.persistencia.antecedentes;

import java.util.Collection;

public interface IAntecedenteRepository {

    Collection<AntecedenteDTO> antecedentePorIdPaciente(String id);
    long add(AntecedenteDTO antecedenteDTO);
    long update(AntecedenteDTO antecedenteDTO);
}

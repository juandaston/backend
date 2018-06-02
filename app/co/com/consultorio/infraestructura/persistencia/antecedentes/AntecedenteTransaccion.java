package co.com.consultorio.infraestructura.persistencia.antecedentes;

import co.com.consultorio.infraestructura.persistencia.pacientes.PacienteDTO;
import org.skife.jdbi.v2.sqlobject.CreateSqlObject;
import org.skife.jdbi.v2.sqlobject.Transaction;
import play.Logger;

public abstract class AntecedenteTransaccion {

    @CreateSqlObject
    abstract AntecedenteDAO antecedenteDAO();

    @Transaction
    public long add(AntecedenteDTO antecedenteDTO) {
        long id = antecedenteDAO().agregarAntecedente(
                antecedenteDTO.getIdPaciente());

        Logger.info(String.format("Paciente %s registrado con exito", id));
        return id;
    }

    @Transaction
    public long update(AntecedenteDTO antecedenteDTO) {
        long id = antecedenteDAO().agregarAntecedente(
                antecedenteDTO.getIdPaciente());

        Logger.info(String.format("Paciente %s registrado con exito", id));
        return id;
    }
}

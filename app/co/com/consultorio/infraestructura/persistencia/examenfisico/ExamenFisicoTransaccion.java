package co.com.consultorio.infraestructura.persistencia.examenfisico;

import co.com.consultorio.infraestructura.persistencia.pacientes.PacienteDAO;
import co.com.consultorio.infraestructura.persistencia.pacientes.PacienteDTO;
import org.joda.time.DateTime;
import org.skife.jdbi.v2.sqlobject.CreateSqlObject;
import org.skife.jdbi.v2.sqlobject.Transaction;
import play.Logger;

import java.sql.Date;

public abstract class ExamenFisicoTransaccion {

    @CreateSqlObject
    abstract ExamenFisicoDAO examenFisicoDAO();

    @Transaction
    public long add(ExamenFisicoDTO examenFisicoDTO) {
        long id = examenFisicoDAO().agregarExamenFisico(
                examenFisicoDTO.getIdExamen(),
                examenFisicoDTO.getIdPaciente(),
                examenFisicoDTO.getPresionArterial(),
                examenFisicoDTO.getFc(),
                examenFisicoDTO.getFr(),
                examenFisicoDTO.getPeso(),
                examenFisicoDTO.getTalla(),
                examenFisicoDTO.getPerimetroAbdominal(),
                examenFisicoDTO.getCabeza(),
                examenFisicoDTO.getCuello(),
                examenFisicoDTO.getTorax(),
                examenFisicoDTO.getAbdomen(),
                examenFisicoDTO.getExtremidades(),
                examenFisicoDTO.getNeurologico(),
                examenFisicoDTO.getOsteomuscular(),
                examenFisicoDTO.getMental(),
                new Date(DateTime.now().getMillis()));

        Logger.info(String.format("Paciente %s registrado con exito", id));
        return id;
    }
}

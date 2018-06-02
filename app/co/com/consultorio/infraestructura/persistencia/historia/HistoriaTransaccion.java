package co.com.consultorio.infraestructura.persistencia.historia;

import co.com.consultorio.infraestructura.persistencia.examenfisico.ExamenFisicoDAO;
import co.com.consultorio.infraestructura.persistencia.examenfisico.ExamenFisicoDTO;
import org.joda.time.DateTime;
import org.skife.jdbi.v2.sqlobject.CreateSqlObject;
import org.skife.jdbi.v2.sqlobject.Transaction;
import play.Logger;
import play.libs.Json;
import sun.security.timestamp.Timestamper;

import java.sql.Date;
import java.sql.Timestamp;

public abstract class HistoriaTransaccion {
    @CreateSqlObject
    abstract HistoriaDAO historiaDAO();

    @Transaction
    public long add(HistoriaDTO historiaDTO) {
        long id = historiaDAO().agregarHistoria(
                historiaDTO.getIdHistoria(),
                historiaDTO.getIdExamen(),
                historiaDTO.getIdMedico(),
                historiaDTO.getIdPaciente(),
                historiaDTO.getMotivoConsulta(),
                historiaDTO.getEnfermedadActual(),
                historiaDTO.getRevisionPorSistemas(),
                historiaDTO.getDiagnostico(),
                historiaDTO.getConducta(),
                new Date(DateTime.now().getMillis()));

        Logger.info(String.format("Historia %s registrado con exito", id));
        return id;
    }
}

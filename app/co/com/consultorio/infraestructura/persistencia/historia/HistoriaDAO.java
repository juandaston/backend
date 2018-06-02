package co.com.consultorio.infraestructura.persistencia.historia;

import org.joda.time.DateTime;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;

import java.math.BigDecimal;
import java.sql.Date;

public interface HistoriaDAO {
    @SqlUpdate("INSERT INTO TBL_HISTORIA_CLINICA (ID_EXAMEN," +
            "ID_MEDICO," +
            "ID_PACIENTE," +
            "MOTIVO_CONSULTA," +
            "ENFERMEDAD_ACTUAL," +
            "REVISION_X_SISTEMAS," +
            "DIAGNOSTICO," +
            "CONDUCTA, " +
            "FECHA_CREACION)" +
            "VALUES (" +
            ":idExamen," +
            ":idMedico," +
            ":idPaciente," +
            ":motivoConsulta," +
            ":enfermedadActual," +
            ":revisionPorSistemas," +
            ":diagnostico," +
            ":conducta," +
            ":fechaCreacion);")

    long agregarHistoria(@Bind("idHistoria") BigDecimal idHistoria,
                             @Bind("idExamen") BigDecimal idExamen,
                             @Bind("idMedico") BigDecimal idMedico,
                             @Bind("idPaciente") BigDecimal idPaciente,
                             @Bind("motivoConsulta") String motivoConsulta,
                             @Bind("enfermedadActual") String enfermedadActual,
                             @Bind("revisionPorSistemas") String revisionPorSistemas,
                             @Bind("diagnostico") String diagnostico,
                             @Bind("conducta") String conducta,
                             @Bind("fechaCreacion") Date fechaCreacion);


}

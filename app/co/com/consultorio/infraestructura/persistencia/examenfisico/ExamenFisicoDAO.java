package co.com.consultorio.infraestructura.persistencia.examenfisico;

import org.joda.time.DateTime;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Collection;

public interface ExamenFisicoDAO {

    @SqlUpdate("INSERT INTO TBL_EXAMEN_FISICO (ID_PACIENTE," +
            "PRESION_ARTERIAL," +
            "FC," +
            "FR," +
            "PESO," +
            "TALLA," +
            "PERIMETRO_ABDOMINAL," +
            "CABEZA," +
            "CUELLO," +
            "TORAX," +
            "ABDOMEN," +
            "EXTREMIDADES," +
            "NEUROLOGICO," +
            "OSTEOMUSCULAR," +
            "MENTAL, " +
            "FECHA_CREACION)" +
            "VALUES (" +
            ":idPaciente," +
            ":presionArterial," +
            ":fc," +
            ":fr," +
            ":peso," +
            ":talla," +
            ":perimetroAbdominal," +
            ":cabeza," +
            ":cuello," +
            ":torax," +
            ":abdomen," +
            ":extremidades," +
            ":neurologico," +
            ":osteomuscular," +
            ":mental," +
            ":fechaCreacion);")

    long agregarExamenFisico(@Bind("idExamen") BigDecimal idExamen,
                             @Bind("idPaciente") BigDecimal idPaciente,
                         @Bind("presionArterial") String presionArterial,
                         @Bind("fc") String fc,
                         @Bind("fr") String fr,
                         @Bind("peso") String peso,
                         @Bind("talla") String talla,
                         @Bind("perimetroAbdominal") String perimetroAbdominal,
                         @Bind("cabeza") String cabeza,
                         @Bind("cuello") String cuello,
                         @Bind("torax") String torax,
                         @Bind("abdomen") String abdomen,
                         @Bind("extremidades") String extremidades,
                         @Bind("neurologico") String neurologico,
                         @Bind("osteomuscular") String osteomuscular,
                         @Bind("mental") String mental,
                         @Bind("fechaCreacion") Date fechaCreacion);


    @SqlQuery("SELECT MAX(ID_EXAMEN)+1 FROM TBL_EXAMEN_FISICO")
    long obtenerUltimoRegistro();
}

package co.com.consultorio.infraestructura.persistencia.historia;

import org.joda.time.DateTime;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class HistoriaMapperJdbi implements ResultSetMapper<HistoriaDTO> {
    @Override
    public HistoriaDTO map(int index, ResultSet r, StatementContext ctx) throws SQLException {
        return new HistoriaDTO(
                r.getBigDecimal("ID_HC"),
                r.getBigDecimal("ID_EXAMEN"),
                r.getBigDecimal("ID_MEDICO"),
                r.getBigDecimal("ID_PACIENTE"),
                r.getString("MOTIVO_CONSULTA"),
                r.getString("ENFERMEDAD_ACTUAL"),
                r.getString("REVISION_X_SISTEMAS"),
                r.getString("DIAGNOSTICO"),
                r.getString("CONDUCTA"),
                new DateTime(r.getDate("FECHA_CREACION"))
        );
    }
}

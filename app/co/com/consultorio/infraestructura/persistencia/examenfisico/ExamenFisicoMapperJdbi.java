package co.com.consultorio.infraestructura.persistencia.examenfisico;

import co.com.consultorio.infraestructura.persistencia.pacientes.PacienteDTO;
import org.joda.time.DateTime;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ExamenFisicoMapperJdbi implements ResultSetMapper<ExamenFisicoDTO> {
    @Override
    public ExamenFisicoDTO map(int index, ResultSet r, StatementContext ctx) throws SQLException {
        return new ExamenFisicoDTO(
                r.getBigDecimal("ID_EXAMEN"),
                r.getBigDecimal("ID_PACIENTE"),
                r.getString("PRESION_ARTERIAL"),
                r.getString("FC"),
                r.getString("FR"),
                r.getString("PESO"),
                r.getString("TALLA"),
                r.getString("PERIMETRO_ABDOMINAL"),
                r.getString("CABEZA"),
                r.getString("CUELLO"),
                r.getString("TORAX"),
                r.getString("ABDOMEN"),
                r.getString("EXTREMIDADES"),
                r.getString("NEUROLOGICO"),
                r.getString("OSTEOMUSCULAR"),
                r.getString("MENTAL"),
                new DateTime(r.getDate("FECHA_CREACION"))
        );
    }
}

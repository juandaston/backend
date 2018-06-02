package co.com.consultorio.infraestructura.persistencia.pacientes;

import co.com.consultorio.infraestructura.persistencia.pacientes.PacienteDTO;
import org.joda.time.DateTime;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PacienteMapperJdbi implements ResultSetMapper<PacienteDTO> {
    @Override
    public PacienteDTO map(int index, ResultSet r, StatementContext ctx) throws SQLException {
        return new PacienteDTO(
                r.getBigDecimal("ID_PACIENTE"),
                r.getString("TIPO_IDENTIFICACION"),
                r.getString("NUMERO_INDENTIFICACION"),
                r.getString("PRIMER_NOMBRE"),
                r.getString("SEGUNDO_NOMBRE"),
                r.getString("PRIMER_APELLIDO"),
                r.getString("SEGUNDO_APELLIDO"),
                r.getString("CELULAR"),
                r.getString("TELEFONO"),
                r.getString("DIRECCION"),
                r.getTimestamp("FECHA_NACIMIENTO"),
                r.getString("PROFESION"),
                r.getString("OBSERVACIONES"),
                r.getString("SEXO"),
                r.getString("ESTADO_CIVIL")
        );
    }
}

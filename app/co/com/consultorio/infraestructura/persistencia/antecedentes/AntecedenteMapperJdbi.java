package co.com.consultorio.infraestructura.persistencia.antecedentes;

import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AntecedenteMapperJdbi implements ResultSetMapper<AntecedenteDTO> {
    @Override
    public AntecedenteDTO map(int index, ResultSet r, StatementContext ctx) throws SQLException {
        return new AntecedenteDTO(
                r.getBigDecimal("ID_ANTECEDENTES"),
                r.getString("ID_PACIENTE"),
                r.getString("TIPO"),
                r.getString("DESCRIPCION"),
                r.getTimestamp("FECHA_CREACION")
        );
    }
}

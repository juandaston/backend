package co.com.consultorio.infraestructura.persistencia.autenticacion;

import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AutenticacionMapperJdbi implements ResultSetMapper<AutenticacionDTO> {
    @Override
    public AutenticacionDTO map(int index, ResultSet r, StatementContext ctx) throws SQLException {
        return new AutenticacionDTO(
                r.getBigDecimal("USUARIO_ID"),
                r.getString("NOMBRE_USUARIO"),
                r.getString("PASSWORD_USUARIO")
        );
    }
}

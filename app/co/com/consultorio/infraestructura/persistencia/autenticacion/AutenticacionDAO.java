package co.com.consultorio.infraestructura.persistencia.autenticacion;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import java.util.Collection;

@RegisterMapper(AutenticacionMapperJdbi.class)
public interface AutenticacionDAO {

    @SqlQuery("SELECT * FROM TBL_USERS WHERE NOMBRE_USUARIO = :usuario AND PASSWORD_USUARIO = :password")
    Collection<AutenticacionDTO> consultarUsuario(@Bind("usuario") String usuario, @Bind("password") String password);
}

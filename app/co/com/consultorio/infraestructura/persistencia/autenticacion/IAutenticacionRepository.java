package co.com.consultorio.infraestructura.persistencia.autenticacion;

import java.util.Collection;
import java.util.Optional;

public interface IAutenticacionRepository {

    Collection<AutenticacionDTO> consultarUsuario(String usuario, String password);
}

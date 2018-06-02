package co.com.consultorio.infraestructura.persistencia.autenticacion;

import com.google.inject.Inject;
import org.skife.jdbi.v2.DBI;
import play.db.Database;

import java.util.Collection;

public class AutenticacionRepository implements IAutenticacionRepository {

    private final Database db;

    @Inject
    public AutenticacionRepository(Database db) {
        this.db = db;
    }

    @Override
    public Collection<AutenticacionDTO> consultarUsuario(String usuario, String password) {
        return new DBI(db.getDataSource()).onDemand(AutenticacionDAO.class).consultarUsuario(usuario, password);
    }
}

package co.com.consultorio.infraestructura.persistencia.examenfisico;

import com.google.inject.Inject;
import org.skife.jdbi.v2.DBI;
import play.Logger;
import play.db.Database;

import java.math.BigDecimal;

public class ExamenFisicoRepository implements IExamenFisicoRepository {

    private ExamenFisicoTransaccion examenFisicoTransaccion;

    private final Database db;

    @Inject
    public ExamenFisicoRepository(Database db) {
        this.db = db;
        this.examenFisicoTransaccion = new DBI(db.getDataSource()).onDemand(ExamenFisicoTransaccion.class);
    }

    @Override
    public BigDecimal obtenerUltimoRegistro () {
        long idExamen = 0;
        try {
            idExamen = new DBI(db.getDataSource()).onDemand(ExamenFisicoDAO.class).obtenerUltimoRegistro();
        }catch (Exception e){
            e.printStackTrace();
        }
        return idExamen == 0 ? new BigDecimal(1) : new BigDecimal(idExamen);
    }

    @Override
    public long add(ExamenFisicoDTO examenFisicoDTO) {
        return examenFisicoTransaccion.add(examenFisicoDTO);
    }

    @Override
    public long update(ExamenFisicoDTO examenFisicoDTO) {
        return 0;
    }
}

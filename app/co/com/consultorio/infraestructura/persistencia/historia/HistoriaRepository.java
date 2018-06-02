package co.com.consultorio.infraestructura.persistencia.historia;

import com.google.inject.Inject;
import org.skife.jdbi.v2.DBI;
import play.db.Database;

public class HistoriaRepository implements IHistoriaRepository{

    private HistoriaTransaccion historiaTransaccion;

    private final Database db;

    @Inject
    public HistoriaRepository(Database db) {
        this.db = db;
        this.historiaTransaccion = new DBI(db.getDataSource()).onDemand(HistoriaTransaccion.class);
    }

    @Override
    public long add(HistoriaDTO historiaDTO) {
        return historiaTransaccion.add(historiaDTO);
    }
}

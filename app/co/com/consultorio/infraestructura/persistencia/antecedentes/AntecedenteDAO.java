package co.com.consultorio.infraestructura.persistencia.antecedentes;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Collection;

@RegisterMapper(AntecedenteMapperJdbi.class)
public interface AntecedenteDAO {

    @SqlQuery("SELECT * FROM TBL_ANTECEDENTES " +
            "WHERE ID_PACIENTE = :idPaciente LIMIT :init,:limit")
    Collection<AntecedenteDTO> antecedentePorIdPacientePaginado(@Bind("idPaciente") String idPaciente,
                                                        @Bind("init") BigDecimal init,
                                                        @Bind("limit") BigDecimal limit);

    @SqlQuery("SELECT COUNT(*) FROM TBL_ANTECEDENTES " +
            "WHERE ID_PACIENTE = :idPaciente")
    BigDecimal contarRegistrosPorPaciente(@Bind("idPaciente") String idPaciente);

    @SqlUpdate("INSERT INTO TBL_ANTECEDENTES (ID_PACIENTE," +
            "TIPO," +
            "DESCRIPCION," +
            "FECHA_CREACION)" +
            "VALUES (" +
            ":idPaciente," +
            ":tipo," +
            ":descripcion," +
            "NOW());")

    long agregarAntecedente(@Bind("idPaciente") String idPaciente,
                            @Bind("tipo") String tipo,
                            @Bind("descripcion") String descripcion);

    @SqlUpdate("UPDATE TBL_ANTECEDENTES SET " +
            "TIPO =:tipo," +
            "DESCRIPCION =:descripcion " +
            "WHERE ID_ANTECEDENTES =:idAntecedente;")

    long updateAntecedente(@Bind("idAntecedente") BigDecimal idAntecedente,
                           @Bind("tipo") String tipo,
                           @Bind("descripcion") String descripcion);
}

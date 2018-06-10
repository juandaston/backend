package co.com.consultorio.infraestructura.persistencia.pacientes;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;


import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Date;

@RegisterMapper(PacienteMapperJdbi.class)
public interface PacienteDAO {

    @SqlQuery("SELECT * FROM TBL_PACIENTES LIMIT :limit OFFSET :init")
    Collection<PacienteDTO> listarPacientes(@Bind("init") int init, @Bind("limit") int limit);

    @SqlQuery("SELECT COUNT(*) FROM TBL_PACIENTES")
    BigDecimal contarPacientes();

    @SqlQuery("SELECT * FROM TBL_PACIENTES " +
            "WHERE TIPO_IDENTIFICACION = :tipoId " +
            "AND NUMERO_INDENTIFICACION = :numId")
    Collection<PacienteDTO> pacientePorCedula(@Bind("tipoId") String tipoId,
                                              @Bind("numId") String numId);

    @SqlQuery("SELECT * FROM TBL_PACIENTES " +
            "WHERE ID_PACIENTE =:id")
    Collection<PacienteDTO> pacientePorId(@Bind("id") String id);

    @SqlUpdate("INSERT INTO TBL_PACIENTES (PRIMER_NOMBRE," +
            "SEGUNDO_NOMBRE," +
            "PRIMER_APELLIDO," +
            "SEGUNDO_APELLIDO," +
            "TIPO_IDENTIFICACION," +
            "NUMERO_INDENTIFICACION," +
            "CELULAR," +
            "DIRECCION," +
            "TELEFONO," +
            "ESTADO_CIVIL," +
            "FECHA_NACIMIENTO," +
            "PROFESION," +
            "OBSERVACIONES," +
            "SEXO)" +
            "VALUES (" +
            ":primerNombre," +
            ":segundoNombre," +
            ":primerApellido," +
            ":segundoApellido," +
            ":tipoIdentificacion," +
            ":numeroIdentificacion," +
            ":celular," +
            ":direccion," +
            ":telefono," +
            ":estadoCivil," +
            ":fechaNacimiento," +
            ":profesion," +
            ":observaciones," +
            ":sexo);")

    long agregarPaciente(@Bind("tipoIdentificacion") String tipoIdentificacion,
                                            @Bind("numeroIdentificacion") String numeroIdentificacion,
                                            @Bind("primerNombre") String primerNombre,
                                            @Bind("segundoNombre") String segundoNombre,
                                            @Bind("primerApellido") String primerApellido,
                                            @Bind("segundoApellido") String segundoApellido,
                                            @Bind("celular") String celular,
                                            @Bind("telefono") String telefono,
                                            @Bind("direccion") String direccion,
                                            @Bind("fechaNacimiento") java.sql.Date fechaNacimiento,
                                            @Bind("profesion") String profesion,
                                            @Bind("observaciones") String observaciones,
                                            @Bind("sexo") String sexo,
                                            @Bind("estadoCivil") String estadoCivil);

    @SqlUpdate("UPDATE TBL_PACIENTES SET " +
            "PRIMER_NOMBRE =:primerNombre," +
            "SEGUNDO_NOMBRE =:segundoNombre," +
            "PRIMER_APELLIDO =:primerApellido," +
            "SEGUNDO_APELLIDO =:segundoApellido," +
            "TIPO_IDENTIFICACION =:tipoIdentificacion," +
            "NUMERO_INDENTIFICACION =:numeroIdentificacion," +
            "CELULAR =:celular," +
            "DIRECCION =:direccion," +
            "TELEFONO =:telefono," +
            "ESTADO_CIVIL =:estadoCivil," +
            "FECHA_NACIMIENTO =:fechaNacimiento," +
            "PROFESION =:profesion," +
            "OBSERVACIONES =:observaciones," +
            "SEXO =:sexo " +
            "WHERE ID_PACIENTE =:idPaciente")

    long updatePaciente(@Bind("idPaciente") BigDecimal idPaciente,
                        @Bind("tipoIdentificacion") String tipoIdentificacion,
                         @Bind("numeroIdentificacion") String numeroIdentificacion,
                         @Bind("primerNombre") String primerNombre,
                         @Bind("segundoNombre") String segundoNombre,
                         @Bind("primerApellido") String primerApellido,
                         @Bind("segundoApellido") String segundoApellido,
                         @Bind("celular") String celular,
                         @Bind("telefono") String telefono,
                         @Bind("direccion") String direccion,
                         @Bind("fechaNacimiento") Timestamp fechaNacimiento,
                         @Bind("profesion") String profesion,
                         @Bind("observaciones") String observaciones,
                         @Bind("sexo") String sexo,
                         @Bind("estadoCivil") String estadoCivil);
}

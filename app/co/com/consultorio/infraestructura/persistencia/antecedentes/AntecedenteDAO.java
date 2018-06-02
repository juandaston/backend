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
            "WHERE ID_PACIENTE = :idPaciente ")
    Collection<AntecedenteDTO> antecedentePorIdPaciente(@Bind("idPaciente") String idPaciente);

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

    long agregarAntecedente(@Bind("idAntecedente") String idAntecedente);

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

    long updateAntecedente(@Bind("idAntecedente") BigDecimal idAntecedente);
}

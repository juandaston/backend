package co.com.consultorio.infraestructura.persistencia.examenfisico;

import co.com.consultorio.infraestructura.persistencia.pacientes.PacienteDTO;

import java.math.BigDecimal;

public interface IExamenFisicoRepository {

    BigDecimal obtenerUltimoRegistro();
    long add(ExamenFisicoDTO examenFisicoDTO);
    long update(ExamenFisicoDTO examenFisicoDTO);
}

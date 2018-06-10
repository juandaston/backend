package co.com.consultorio.domain.antecedente;

import co.com.consultorio.aplicacion.comandos.editarAntecedente.EditarAntecedenteRequest;
import co.com.consultorio.aplicacion.comandos.ingresarAntecedente.IngresarAntecedenteRequest;
import co.com.consultorio.aplicacion.comandos.ingresarpaciente.IngresarPacienteRequest;
import co.com.consultorio.infraestructura.persistencia.antecedentes.AntecedenteDTO;
import co.com.consultorio.infraestructura.persistencia.pacientes.PacienteDTO;
import com.google.inject.Singleton;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@Singleton
public class AntecedenteFactory {

    public AntecedenteDTO crearAntecedenteDTODesdeRequest(IngresarAntecedenteRequest request){
        return new AntecedenteDTO(null,
                request.getIdPaciente(),
                request.getTipo(),
                request.getDescripcion(),
                new Timestamp(System.currentTimeMillis())
        );

    }

    public AntecedenteDTO crearAntecedenteDTODesdeRequest(EditarAntecedenteRequest request){
        return new AntecedenteDTO(new BigDecimal(request.getIdAntecedente()),
                request.getIdPaciente(),
                request.getTipo(),
                request.getDescripcion()
        );

    }
}

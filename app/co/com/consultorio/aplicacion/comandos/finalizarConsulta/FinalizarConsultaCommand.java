package co.com.consultorio.aplicacion.comandos.finalizarConsulta;

import co.com.consultorio.aplicacion.api.queries.modelo.Usuario;
import co.com.consultorio.aplicacion.comandos.Command;
import co.com.consultorio.infraestructura.persistencia.examenfisico.ExamenFisicoDTO;
import co.com.consultorio.infraestructura.persistencia.examenfisico.ExamenFisicoRepository;
import co.com.consultorio.infraestructura.persistencia.historia.HistoriaDTO;
import co.com.consultorio.infraestructura.persistencia.historia.HistoriaRepository;
import com.google.inject.Inject;
import org.joda.time.DateTime;
import play.Logger;
import play.libs.Json;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class FinalizarConsultaCommand implements Command<FinalizarConsultaRequest> {

    @Inject
    ExamenFisicoRepository examenFisicoRepository;

    @Inject
    HistoriaRepository historiaRepository;

    @Override
    public CompletableFuture<Collection<String>> execute(FinalizarConsultaRequest request, Usuario user) throws InterruptedException {

        BigDecimal idExamen = examenFisicoRepository.obtenerUltimoRegistro();
        historiaRepository.add(new HistoriaDTO(
                null,
                idExamen,
                null,
                request.getIdPaciente(),
                request.getMotivoConsulta(),
                request.getEnfermedadActual(),
                request.getRevisionPorSistemas(),
                request.getDiagnostico(),
                request.getConducta(),
                DateTime.now()
        ));

        examenFisicoRepository.add(new ExamenFisicoDTO(null,
                request.getIdPaciente(),
                request.getPresionArterial(),
                request.getFc(),
                request.getFr(),
                request.getPeso(),
                request.getTalla(),
                request.getPerimetroAbdominal(),
                request.getCabeza(),
                request.getCuello(),
                request.getTorax(),
                request.getAbdomen(),
                request.getExtremidades(),
                request.getNeurologico(),
                request.getOsteomuscular(),
                request.getMental(),
                DateTime.now()
        ));

        return null;
    }
}

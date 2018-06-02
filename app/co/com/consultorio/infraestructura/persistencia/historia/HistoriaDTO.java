package co.com.consultorio.infraestructura.persistencia.historia;

import org.joda.time.DateTime;

import java.math.BigDecimal;

public class HistoriaDTO {

    private BigDecimal idHistoria;
    private BigDecimal idExamen;
    private BigDecimal idMedico;
    private BigDecimal idPaciente;
    private String motivoConsulta;
    private String enfermedadActual;
    private String revisionPorSistemas;
    private String diagnostico;
    private String conducta;
    private DateTime fechaCreacion;

    public HistoriaDTO() {
    }

    public HistoriaDTO(BigDecimal idHistoria, BigDecimal idExamen, BigDecimal idMedico, BigDecimal idPaciente, String motivoConsulta, String enfermedadActual, String revisionPorSistemas, String diagnostico, String conducta, DateTime fechaCreacion) {
        this.idHistoria = idHistoria;
        this.idExamen = idExamen;
        this.idMedico = idMedico;
        this.idPaciente = idPaciente;
        this.motivoConsulta = motivoConsulta;
        this.enfermedadActual = enfermedadActual;
        this.revisionPorSistemas = revisionPorSistemas;
        this.diagnostico = diagnostico;
        this.conducta = conducta;
        this.fechaCreacion = fechaCreacion;
    }

    public BigDecimal getIdHistoria() {
        return idHistoria;
    }

    public void setIdHistoria(BigDecimal idHistoria) {
        this.idHistoria = idHistoria;
    }

    public BigDecimal getIdExamen() {
        return idExamen;
    }

    public void setIdExamen(BigDecimal idExamen) {
        this.idExamen = idExamen;
    }

    public BigDecimal getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(BigDecimal idMedico) {
        this.idMedico = idMedico;
    }

    public BigDecimal getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(BigDecimal idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    public String getEnfermedadActual() {
        return enfermedadActual;
    }

    public void setEnfermedadActual(String enfermedadActual) {
        this.enfermedadActual = enfermedadActual;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getConducta() {
        return conducta;
    }

    public void setConducta(String conducta) {
        this.conducta = conducta;
    }

    public String getRevisionPorSistemas() {
        return revisionPorSistemas;
    }

    public void setRevisionPorSistemas(String revisionPorSistemas) {
        this.revisionPorSistemas = revisionPorSistemas;
    }

    public DateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(DateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
}

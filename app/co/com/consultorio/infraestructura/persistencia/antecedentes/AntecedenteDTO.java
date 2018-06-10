package co.com.consultorio.infraestructura.persistencia.antecedentes;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class AntecedenteDTO {
    private BigDecimal idAntecedentes;
    private String idPaciente;
    private String tipo;
    private String descripcion;
    private Timestamp fechaCreacion;


    public AntecedenteDTO() {
        super();
    }

    public AntecedenteDTO(BigDecimal idAntecedentes, String idPaciente, String tipo, String descripcion, Timestamp fechaCreacion) {
        this.idAntecedentes = idAntecedentes;
        this.idPaciente = idPaciente;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
    }

    public AntecedenteDTO(BigDecimal idAntecedentes, String idPaciente, String tipo, String descripcion) {
        this.idAntecedentes = idAntecedentes;
        this.idPaciente = idPaciente;
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    public BigDecimal getIdAntecedentes() {
        return idAntecedentes;
    }

    public void setIdAntecedentes(BigDecimal idAntecedentes) {
        this.idAntecedentes = idAntecedentes;
    }

    public String getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(String idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Timestamp getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Timestamp fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
}
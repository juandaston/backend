package co.com.consultorio.infraestructura.persistencia.examenfisico;

import org.joda.time.DateTime;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class ExamenFisicoDTO {

    private BigDecimal idExamen;
    private BigDecimal idPaciente;
    private String presionArterial;
    private String fc;
    private String fr;
    private String peso;
    private String talla;
    private String perimetroAbdominal;
    private String cabeza;
    private String cuello;
    private String torax;
    private String abdomen;
    private String extremidades;
    private String neurologico;
    private String osteomuscular;
    private String mental;
    private DateTime fechaCreacion;

    public ExamenFisicoDTO() {
    }

    public ExamenFisicoDTO(BigDecimal idExamen, BigDecimal idPaciente, String presionArterial, String fc, String fr, String peso, String talla, String perimetroAbdominal, String cabeza, String cuello, String torax, String abdomen, String extremidades, String neurologico, String osteomuscular, String mental, DateTime fechaCreacion) {
        this.idExamen = idExamen;
        this.idPaciente = idPaciente;
        this.presionArterial = presionArterial;
        this.fc = fc;
        this.fr = fr;
        this.peso = peso;
        this.talla = talla;
        this.perimetroAbdominal = perimetroAbdominal;
        this.cabeza = cabeza;
        this.cuello = cuello;
        this.torax = torax;
        this.abdomen = abdomen;
        this.extremidades = extremidades;
        this.neurologico = neurologico;
        this.osteomuscular = osteomuscular;
        this.mental = mental;
        this.fechaCreacion = fechaCreacion;
    }

    public BigDecimal getIdExamen() {
        return idExamen;
    }

    public void setIdExamen(BigDecimal idExamen) {
        this.idExamen = idExamen;
    }

    public String getPresionArterial() {
        return presionArterial;
    }

    public void setPresionArterial(String presionArterial) {
        this.presionArterial = presionArterial;
    }

    public String getFc() {
        return fc;
    }

    public void setFc(String fc) {
        this.fc = fc;
    }

    public String getFr() {
        return fr;
    }

    public void setFr(String fr) {
        this.fr = fr;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getPerimetroAbdominal() {
        return perimetroAbdominal;
    }

    public void setPerimetroAbdominal(String perimetroAbdominal) {
        this.perimetroAbdominal = perimetroAbdominal;
    }

    public String getCabeza() {
        return cabeza;
    }

    public void setCabeza(String cabeza) {
        this.cabeza = cabeza;
    }

    public String getCuello() {
        return cuello;
    }

    public void setCuello(String cuello) {
        this.cuello = cuello;
    }

    public String getTorax() {
        return torax;
    }

    public void setTorax(String torax) {
        this.torax = torax;
    }

    public String getAbdomen() {
        return abdomen;
    }

    public void setAbdomen(String abdomen) {
        this.abdomen = abdomen;
    }

    public String getExtremidades() {
        return extremidades;
    }

    public void setExtremidades(String extremidades) {
        this.extremidades = extremidades;
    }

    public String getNeurologico() {
        return neurologico;
    }

    public void setNeurologico(String neurologico) {
        this.neurologico = neurologico;
    }

    public String getOsteomuscular() {
        return osteomuscular;
    }

    public void setOsteomuscular(String osteomuscular) {
        this.osteomuscular = osteomuscular;
    }

    public String getMental() {
        return mental;
    }

    public void setMental(String mental) {
        this.mental = mental;
    }

    public BigDecimal getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(BigDecimal idPaciente) {
        this.idPaciente = idPaciente;
    }

    public DateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(DateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
}

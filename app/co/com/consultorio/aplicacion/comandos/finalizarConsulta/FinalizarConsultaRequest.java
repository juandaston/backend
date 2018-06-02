package co.com.consultorio.aplicacion.comandos.finalizarConsulta;

import co.com.consultorio.aplicacion.comandos.CommandRequest;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class FinalizarConsultaRequest implements CommandRequest {

    private String comando;
    private BigDecimal idPaciente;
    private String motivoConsulta;
    private String enfermedadActual;
    private String revisionPorSistemas;
    private String diagnostico;
    private String conducta;
    private String presionArterial;
    private String fc;
    private String fr;
    private String peso;
    private String talla;
    private String cuello;
    private String torax;
    private String abdomen;
    private String extremidades;
    private String neurologico;
    private String osteomuscular;
    private String perimetroAbdominal;
    private String cabeza;
    private String mental;




    public FinalizarConsultaRequest() {
    }

    public FinalizarConsultaRequest(String comando, BigDecimal idPaciente, String motivoConsulta, String enfermedadActual, String revisionPorSistemas, String diagnostico, String conducta, String presionArterial, String fc, String fr, String peso, String talla, String cuello, String torax, String abdomen, String extremidades, String neurologico, String osteomuscular, String perimetroAbdominal, String cabeza, String mental) {
        this.comando = comando;
        this.idPaciente = idPaciente;
        this.motivoConsulta = motivoConsulta;
        this.enfermedadActual = enfermedadActual;
        this.revisionPorSistemas = revisionPorSistemas;
        this.diagnostico = diagnostico;
        this.conducta = conducta;
        this.presionArterial = presionArterial;
        this.fc = fc;
        this.fr = fr;
        this.peso = peso;
        this.talla = talla;
        this.cuello = cuello;
        this.torax = torax;
        this.abdomen = abdomen;
        this.extremidades = extremidades;
        this.neurologico = neurologico;
        this.osteomuscular = osteomuscular;
        this.perimetroAbdominal = perimetroAbdominal;
        this.cabeza = cabeza;
        this.mental = mental;
    }

    public String getComando() {
        return comando;
    }

    public void setComando(String comando) {
        this.comando = comando;
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

    public String getRevisionPorSistemas() {
        return revisionPorSistemas;
    }

    public void setRevisionPorSistemas(String revisionPorSistemas) {
        this.revisionPorSistemas = revisionPorSistemas;
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

    public String getMental() {
        return mental;
    }

    public void setMental(String mental) {
        this.mental = mental;
    }

    @Override
    public String toString() {
        return "FinalizarConsultaRequest{" +
                "comando='" + comando + '\'' +
                ", idPaciente=" + idPaciente +
                ", motivoConsulta='" + motivoConsulta + '\'' +
                ", enfermedadActual='" + enfermedadActual + '\'' +
                ", revisionPorSistemas='" + revisionPorSistemas + '\'' +
                ", diagnostico='" + diagnostico + '\'' +
                ", conducta='" + conducta + '\'' +
                ", presionArterial='" + presionArterial + '\'' +
                ", fc='" + fc + '\'' +
                ", fr='" + fr + '\'' +
                ", peso='" + peso + '\'' +
                ", talla='" + talla + '\'' +
                ", cuello='" + cuello + '\'' +
                ", torax='" + torax + '\'' +
                ", abdomen='" + abdomen + '\'' +
                ", extremidades='" + extremidades + '\'' +
                ", neurologico='" + neurologico + '\'' +
                ", osteomuscular='" + osteomuscular + '\'' +
                ", perimetroAbdominal='" + perimetroAbdominal + '\'' +
                ", cabeza='" + cabeza + '\'' +
                ", mental='" + mental + '\'' +
                '}';
    }
}

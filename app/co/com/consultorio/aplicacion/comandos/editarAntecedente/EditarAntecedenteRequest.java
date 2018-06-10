package co.com.consultorio.aplicacion.comandos.editarAntecedente;

import co.com.consultorio.aplicacion.comandos.CommandRequest;

public class EditarAntecedenteRequest implements CommandRequest{

    private String comando;
    private String idAntecedente;
    private String idPaciente;
    private String tipo;
    private String descripcion;

    public EditarAntecedenteRequest() {
    }

    public EditarAntecedenteRequest(String comando, String idAntecedente, String idPaciente, String tipo, String descripcion) {
        this.comando = comando;
        this.idAntecedente = idAntecedente;
        this.idPaciente = idPaciente;
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    public String getIdAntecedente() {
        return idAntecedente;
    }

    public void setIdAntecedente(String idAntecedente) {
        this.idAntecedente = idAntecedente;
    }

    public String getComando() {
            return comando;
        }

    public void setComando(String comando) {
        this.comando = comando;
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

    public String getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(String idPaciente) {
        this.idPaciente = idPaciente;
    }

    @Override
    public String toString() {
        return "EditarAntecedenteRequest{" +
                "comando='" + comando + '\'' +
                ", idAntecedente='" + idAntecedente + '\'' +
                ", idPaciente='" + idPaciente + '\'' +
                ", tipo='" + tipo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}

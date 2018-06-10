package co.com.consultorio.aplicacion.comandos.ingresarAntecedente;

import co.com.consultorio.aplicacion.comandos.CommandRequest;

public class IngresarAntecedenteRequest implements CommandRequest {

    private String comando;
    private String idPaciente;
    private String tipo;
    private String descripcion;

    public IngresarAntecedenteRequest() {
    }

    public IngresarAntecedenteRequest(String comando, String idPaciente, String tipo, String descripcion) {
        this.comando = comando;
        this.idPaciente = idPaciente;
        this.tipo = tipo;
        this.descripcion = descripcion;
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
        return "IngresarAntecedenteRequest{" +
                "comando='" + comando + '\'' +
                ", idPaciente='" + idPaciente + '\'' +
                ", tipo='" + tipo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}

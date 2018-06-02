package co.com.consultorio.aplicacion.comandos.ingresarpaciente;

import co.com.consultorio.aplicacion.comandos.CommandRequest;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

public class IngresarPacienteRequest implements CommandRequest {

    private String comando;
    private BigDecimal idPaciente;
    private String tipoIdentificacion;
    private String numeroIdentificacion;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String celular;
    private String telefono;
    private String direccion;
    private Timestamp fechaNacimiento;
    private String profesion;
    private String observaciones;
    private String sexo;
    private String estadoCivil;

    public IngresarPacienteRequest() {
    }

    public IngresarPacienteRequest(String comando, BigDecimal idPaciente, String tipoIdentificacion, String numeroIdentificacion, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String celular, String telefono, String direccion, Timestamp fechaNacimiento, String profesion, String observaciones, String sexo, String estadoCivil) {
        this.comando = comando;
        this.idPaciente = idPaciente;
        this.tipoIdentificacion = tipoIdentificacion;
        this.numeroIdentificacion = numeroIdentificacion;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.celular = celular;
        this.telefono = telefono;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.profesion = profesion;
        this.observaciones = observaciones;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
    }

    public String getComando() {
        return comando;
    }

    public BigDecimal getIdPaciente() {
        return idPaciente;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public String getCelular() {
        return celular;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public Timestamp getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getProfesion() {
        return profesion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public String getSexo() {
        return sexo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setComando(String comando) {
        this.comando = comando;
    }

    public void setIdPaciente(BigDecimal idPaciente) {
        this.idPaciente = idPaciente;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setFechaNacimiento(Timestamp fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return "ActualizarPacienteRequest{" +
                "comando='" + comando + '\'' +
                ", idPaciente=" + idPaciente +
                ", tipoIdentificacion='" + tipoIdentificacion + '\'' +
                ", numeroIdentificacion='" + numeroIdentificacion + '\'' +
                ", primerNombre='" + primerNombre + '\'' +
                ", segundoNombre='" + segundoNombre + '\'' +
                ", primerApellido='" + primerApellido + '\'' +
                ", segundoApellido='" + segundoApellido + '\'' +
                ", celular='" + celular + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", profesion='" + profesion + '\'' +
                ", observaciones='" + observaciones + '\'' +
                ", sexo='" + sexo + '\'' +
                ", estadoCivil='" + estadoCivil + '\'' +
                '}';
    }
}

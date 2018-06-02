package co.com.consultorio.infraestructura.persistencia.autenticacion;

import java.math.BigDecimal;

public class AutenticacionDTO {

    private BigDecimal usuarioId;
    private String nombre;
    private String password;

    public AutenticacionDTO(BigDecimal usuarioId, String nombre, String password) {
        this.usuarioId = usuarioId;
        this.nombre = nombre;
        this.password = password;
    }

    public BigDecimal getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(BigDecimal usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

package co.com.consultorio.aplicacion.api.queries.modelo;

public class Usuario {

    private String id;
    private String nombreUsuario;
    private String passwordUsuario;

    public Usuario(String id, String nombreUsuario, String passwordUsuario) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.passwordUsuario = passwordUsuario;
    }

    public String getId() {
        return id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getPasswordUsuario() {
        return passwordUsuario;
    }
}
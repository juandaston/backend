package co.com.consultorio.aplicacion.api.queries;

import co.com.consultorio.infraestructura.persistencia.autenticacion.AutenticacionDTO;
import co.com.consultorio.infraestructura.persistencia.autenticacion.AutenticacionRepository;
import com.google.inject.Inject;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.StringUtils;
import play.Logger;
import play.libs.Json;
import play.mvc.Result;

import java.util.Collection;

import static play.mvc.Controller.request;
import static play.mvc.Results.ok;
import static play.mvc.Results.unauthorized;

public class AutenticacionQueries {

    @Inject
    private AutenticacionRepository autenticacionRepository;

    public Result validarUsuario(){
        Logger.debug(request().getHeader("Authorization").split(" ")[1]);

        String valueDecoded = StringUtils.newStringUtf8(Base64.decodeBase64(request().getHeader("Authorization").split(" ")[1]));
        String[] parts = valueDecoded.split(":");

        String usuario = parts[0];
        String pass = parts[1];

        Logger.debug("Usuario ingresado: " + usuario);
        Logger.debug("Contraseña ingresada: " + pass);
        Collection<AutenticacionDTO> listaUsuario =
                autenticacionRepository.consultarUsuario(usuario, pass);

        if(validarUsuario(listaUsuario, usuario, pass)){
            return ok(Json.toJson("Bienvenido"));
        }else{
            return unauthorized(Json.toJson("Usuario o contraseña incorrectos"));
        }
    }

    private boolean validarUsuario(Collection<AutenticacionDTO> listaUsuario, String usuario, String pass){
        if(!listaUsuario.isEmpty()){
            AutenticacionDTO user = listaUsuario.stream().findFirst().get();

            if(user.getNombre().equals(usuario) && user.getPassword().equals(pass)) {
                return true;
            }
        }

        return false;
    }
}

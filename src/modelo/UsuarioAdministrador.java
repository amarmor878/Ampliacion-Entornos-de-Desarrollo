package modelo;

import modelo.Excepciones.ExceptionUsuario;
import modelo.POJO.Usuario;

import java.time.LocalDateTime;

public class UsuarioAdministrador extends Usuario {
    private LocalDateTime fechaUltimaConexion;

    /**
     * Constructor de la clase UsuarioAdministrador que hereda de la clase Usuario.
     * @param nombre String con el nombre del usuario.
     * @param apellido String con el apellido del usuario.
     * @param email String con el email del usuario.
     * @param password String con la contraseña del usuario.
     * @throws ExceptionUsuario Si el email o la contraseña no son validos.
     */
    public UsuarioAdministrador(String nombre, String apellido, String email, String password) throws ExceptionUsuario {
        super(nombre, apellido, email, password);
        this.fechaUltimaConexion = LocalDateTime.now();
    }

    public boolean morificarUsuario(Usuario usuario, String nuevoNombre, String nuevoApellido, String nuevoEmail, String nuevaPassword, Identificar nuevaIdentificacion) throws ExceptionUsuario {
        boolean morificado = false;
        if (usuario instanceof UsuarioRegistrado){
            usuario.setNombre(nuevoNombre);
            usuario.setApellido(nuevoApellido);
            usuario.setEmail(nuevoEmail);
            usuario.setPassword(nuevaPassword);
            ((UsuarioRegistrado) usuario).setIdentificacion(nuevaIdentificacion);
        }
        return morificado;
    }
}

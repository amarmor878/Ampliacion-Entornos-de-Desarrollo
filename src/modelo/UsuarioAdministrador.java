package modelo;

import modelo.Excepciones.ExceptionUsuario;
import modelo.POJO.Usuario;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class UsuarioAdministrador extends Usuario {
    private LocalDateTime fechaUltimaConexion;

    /**
     * Constructor de la clase UsuarioAdministrador que hereda de la clase Usuario.
     *
     * @param nombre   String con el nombre del usuario.
     * @param apellido String con el apellido del usuario.
     * @param email    String con el email del usuario.
     * @param password String con la contraseña del usuario.
     * @throws ExceptionUsuario Si el email o la contraseña no son validos.
     */
    public UsuarioAdministrador(String nombre, String apellido, String email, String password) throws ExceptionUsuario {
        super(nombre, apellido, email, password);
        this.fechaUltimaConexion = LocalDateTime.now();
    }

    /**
     * Método que devuelve la fecha de la última conexión del usuario.
     *
     * @return LocalDateTime con la fecha de la última conexión del usuario.
     */
    public LocalDateTime getFechaUltimaConexion() {
        return fechaUltimaConexion;
    }

    /**
     * Método que modifica la fecha de la última conexión del usuario.
     *
     * @param fechaUltimaConexion LocalDateTime con la fecha de la última conexión del usuario.
     */
    public void setFechaUltimaConexion(LocalDateTime fechaUltimaConexion) {
        this.fechaUltimaConexion = fechaUltimaConexion;
    }

    /**
     * Metodo que modifica los datos del usuario por datos nuevos.
     *
     * @param usuario             Usuario con los datos nuevos.
     * @param nuevoNombre         String con el nuevo nombre.
     * @param nuevoApellido       String con el nuevo apellido.
     * @param nuevoEmail          String con el nuevo email.
     * @param nuevaPassword       String con la nueva contraseña.
     * @param nuevaIdentificacion Identificar con la nueva identificación.
     * @return Usuario con los datos nuevos.
     * @throws ExceptionUsuario Si el email o la contraseña no son validos.
     */
    public boolean modificarUsuario(Usuario usuario, String nuevoNombre, String nuevoApellido, String nuevoEmail, String nuevaPassword, Identificar nuevaIdentificacion) throws ExceptionUsuario {
        boolean modificado = false;
        if (usuario instanceof UsuarioRegistrado) {
            usuario.setNombre(nuevoNombre);
            usuario.setApellido(nuevoApellido);
            usuario.setEmail(nuevoEmail);
            usuario.setPassword(nuevaPassword);
            ((UsuarioRegistrado) usuario).setIdentificacion(nuevaIdentificacion);
        }
        return modificado;
    }

    /**
     * Metodo que crea un nuevo usuario comprobando si el usuario es un UsuarioRegistrado o un UsuarioAdministrador.
     *
     * @param usuario            Usuario con los datos nuevos.
     * @param nuevoNombre        String con el nuevo nombre.
     * @param nuevoApellido      String con el nuevo apellido.
     * @param nuevoEmail         String con el nuevo email.
     * @param nuevaPassword      String con la nueva contraseña.
     * @param nuevoIdentificador Identificar con la nueva identificación.
     * @return true si se ha creado correctamente, false en caso contrario.
     * @throws ExceptionUsuario Si el usuario no es un UsuarioRegistrado o un UsuarioAdministrador.
     */
    public boolean crearUsuario(Usuario usuario, String nuevoNombre, String nuevoApellido, String nuevoEmail, String nuevaPassword, Identificar nuevoIdentificador) throws ExceptionUsuario {
        boolean crearUsuario = false;
        if (usuario instanceof UsuarioRegistrado) {
            usuario = new UsuarioRegistrado(nuevoNombre, nuevoApellido, nuevoEmail, nuevaPassword, nuevoIdentificador);
            crearUsuario = true;
        } else if (usuario instanceof UsuarioAdministrador) {
            usuario = new UsuarioAdministrador(nuevoNombre, nuevoApellido, nuevoEmail, nuevaPassword);
            crearUsuario = true;
        } else {
            throw new ExceptionUsuario("El usuario debe de ser un usuario registrado o un usuario administrador.");
        }
        return crearUsuario;
    }


}

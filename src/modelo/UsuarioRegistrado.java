package modelo;

import exceptions.ExceptionUsuario;
import modelo.POJO.Identificar;
import modelo.POJO.Usuario;

/**
 * Clase UsuarioRegistrado que hereda de Usuario y que implementa la interfaz FuncionesNotas y FuncionesContactos
 * para que el usuario registrado pueda gestionar sus notas, contactos y libreta de contactos.
 *
 * @author Alberto
 * @version 1.0
 * @created 06-jun-2022
 */
public class UsuarioRegistrado extends Usuario {
    private Identificar identificacion;

    /**
     * Constructor de la clase UsuarioRegistrado.
     *
     * @param nombre         String con el nombre del usuario registrado.
     * @param apellido       String con el apellido del usuario registrado.
     * @param email          String con el email del usuario registrado.
     * @param password       String con la contraseña del usuario registrado.
     * @param identificacion Identificar con la identificación del usuario registrado.
     * @throws ExceptionUsuario Si el usuario no cumple con los requisitos.
     */
    public UsuarioRegistrado(String nombre, String apellido, String email, String password, Identificar identificacion) throws ExceptionUsuario {
        super(nombre, apellido, email, password);
        if (identificacion != Identificar.NICK && identificacion != Identificar.APODO) {
            throw new ExceptionUsuario("Identificacion no valida");
        } else {
            this.identificacion = identificacion;
        }

    }

}

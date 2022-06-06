package modelo.Excepciones;

/**
 * ExceptionUsuario es una excepción que se lanza cuando se intenta crear un usuario con un email o password no válidos.
 *
 * @author Alberto
 * @version 1.0
 * @created 06-jun-2022
 */
public class ExceptionUsuario extends Exception {
    /**
     * Constructor de la clase ExceptionUsuario.
     *
     * @param mensaje String con el mensaje de error.
     */
    public ExceptionUsuario(String mensaje) {
        super(mensaje);
    }

    /**
     * Método que devuelve el mensaje de error.
     *
     * @return String con el mensaje de error.
     */
    @Override
    public String getMessage() {
        return super.getMessage();
    }
}

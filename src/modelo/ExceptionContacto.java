package modelo;

/**
 * Clase ExceptionContacto que gestiona las excepciones de la clase Contacto.
 *
 * @author Alberto
 * @version 1.0
 * @created 06-jun-2022
 */
public class ExceptionContacto extends Exception {
    /**
     * Constructor de la clase ExceptionContacto.
     *
     * @param mensaje String con el mensaje de error.
     */
    public ExceptionContacto(String mensaje) {
        super(mensaje);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}

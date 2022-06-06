package modelo.Excepciones;

/**
 * ExceptionNota es una excepción que se lanza cuando la descripción de la nota no es válida.
 *
 * @author Alberto
 * @version 1.0
 * @created 06-jun-2022
 */
public class ExceptionNota extends Exception {
    /**
     * Constructor de la clase ExceptionNota.
     *
     * @param mensaje String con el mensaje de error.
     */
    public ExceptionNota(String mensaje) {
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

import java.util.Date;

/**
 * Clase Notas que representa la gestión de anotaciones de la aplicación.
 *
 * @author Alberto
 * @version 1.0
 * @created 06-jun-2022
 */
public class Notas {
    private String descripcion;
    private Date fechaModificacion;

    /**
     * Constructor vacio de la clase Notas.
     */
    public Notas() {

    }

    /**
     * Constructor de la clase Notas.
     *
     * @param descripcion String con la descripción de la nota.
     */
    public Notas(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Método que devuelve la descripción de la nota.
     *
     * @return String con la descripción de la nota.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Método que modifica la descripción de la nota.
     *
     * @param descripcion String con la descripción de la nota.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Método que devuelve la fecha de modificación de la nota.
     *
     * @return Date con la fecha de modificación de la nota.
     */
    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    /**
     * Método que modifica la fecha de modificación de la nota.
     *
     * @param fechaModificacion Date con la fecha de modificación de la nota.
     */
    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    /**
     * Método que devuelve la representación en String de la nota.
     *
     * @return String con la representación en String de la nota.
     */
    public String toString() {
        return String.format("%s", descripcion);
    }
}

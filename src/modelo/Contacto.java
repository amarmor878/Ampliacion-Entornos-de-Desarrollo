package modelo;

import modelo.exceptions.ExceptionContacto;

/**
 * Clase Contacto que representa un contacto de la aplicacion.
 * Esta clase contiene los atributos y métodos necesarios para la
 * implementacion de un contacto, que posteriormente serán tipos de
 * contactos.
 *
 * @author Alberto
 * @version 1.0
 * @created 06-jun-2022
 */
public class Contacto {
    private String nombre;
    private String apellido;
    private String email;
    private String direccion;
    private String telefono;

    /**
     * Constructor vacio de la clase Contacto.
     */
    public Contacto() {
    }

    /**
     * Constructor de la clase Contacto.
     *
     * @param nombre    String con el nombre del contacto.
     * @param apellido  String con el apellido del contacto.
     * @param email     String con el email del contacto.
     * @param direccion String con la dirección del contacto.
     * @param telefono  String con el teléfono del contacto.
     */
    public Contacto(String nombre, String apellido, String email, String direccion, String telefono) throws ExceptionContacto {
        if (isEmailValido(email) && isTelefonoValido(telefono)) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.email = email;
            this.direccion = direccion;
            this.telefono = telefono;
        } else {
            throw new ExceptionContacto("Contacto no valido");
        }
    }

    private boolean isTelefonoValido(String telefono) {
        return telefono.matches("^\\d{9}$");
    }

    /**
     * Método que comprueba si el email es valido.
     *
     * @param email String con el email a comprobar.
     * @return boolean true si el email es válido, false si no lo es.
     */
    private boolean isEmailValido(String email) {
        return email.matches("^[_A-Za-z\\d+]+(\\.[_A-Za-z\\d-]+)*@" + "[A-Za-z\\d-]+(\\.[A-Za-z\\d]+)*(\\.[A-Za-z]{2,})$");
    }

    /**
     * Método que devuelve el nombre del contacto.
     *
     * @return String con el nombre del contacto.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que modifica el nombre del contacto.
     *
     * @param nombre String con el nombre del contacto.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que devuelve el apellido del contacto.
     *
     * @return String con el apellido del contacto.
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Método que modifica el apellido del contacto.
     *
     * @param apellido String con el apellido del contacto.
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Método que devuelve el email del contacto.
     *
     * @return String con el email del contacto.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Método que modifica el email del contacto comprobando que sea valido.
     *
     * @param email String con el email del contacto.
     */
    public void setEmail(String email) throws ExceptionContacto {
        if (isEmailValido(email)) {
            this.email = email;
        } else
            throw new ExceptionContacto("El email no es válido.");
    }

    /**
     * Método que devuelve la dirección del contacto.
     *
     * @return String con la dirección del contacto.
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Método que modifica la dirección del contacto.
     *
     * @param direccion String con la dirección del contacto.
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Método que devuelve el teléfono del contacto.
     *
     * @return String con el teléfono del contacto.
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Método que modifica el teléfono del contacto comprobando que sea valido.
     *
     * @param telefono String con el teléfono del contacto.
     */
    public void setTelefono(String telefono) throws ExceptionContacto {
        if (isTelefonoValido(telefono)) {
            this.telefono = telefono;
        } else {
            throw new ExceptionContacto("El teléfono no es válido.");
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s - %s - %s - %s", nombre, apellido, email, direccion, telefono);
    }
}


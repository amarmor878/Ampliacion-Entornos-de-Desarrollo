package modelo.POJO;

import modelo.Excepciones.ExceptionUsuario;

/**
 * Clase POJO de Usuario que representa un usuario de la aplicación.
 *
 * @author Alberto
 * @version 1.0
 * @created 06-jun-2022
 */
public class Usuario {
    private String nombre;
    private String apellido;
    private String email;
    private String password;


    public Usuario(String nombre, String apellido, String email, String password) throws ExceptionUsuario {
        if (isEmailValido(email) && isPasswordValido(password)) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.email = email;
            this.password = password;
        } else
            throw new ExceptionUsuario("El usuario no es válido.");
    }

    /**
     * Método que valida la contrasenia del usuario.
     *
     * @param password String contraseña del usuario.
     * @return boolean true si la contraseña es válida, false si no lo es.
     */
    private boolean isPasswordValido(String password) {
        //password que tendrá que tener una longitud minima de 8 caracteres, una letra mayuscula y un caracter especial.
        return password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$");
    }

    /**
     * Método que valida el email del usuario.
     *
     * @param email String email del usuario.
     * @return boolean true si el email es válido, false si no lo es.
     */
    private boolean isEmailValido(String email) {
        //email que para ser valido tendrá que tener el siguiente formato (buscado por internet).
        return email.matches("^[A-Za-z\\d+]+(\\.[_A-Za-z\\d-]+)*@" + "[A-Za-z\\d-]+(\\.[A-Za-z\\d]+)*(\\.[A-Za-z]{2,})$");
    }

    /**
     * Metodo que devuelve el nombre del usuario.
     *
     * @return String nombre del usuario.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo que devuelve el apellido del usuario.
     *
     * @return String apellido del usuario.
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Metodo que devuelve el email del usuario.
     *
     * @return String email del usuario.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Metodo que devuelve la contraseña del usuario.
     *
     * @return String contraseña del usuario.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Metodo que modifica el nombre del usuario.
     *
     * @param nombre String nombre del usuario.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo que modifica el apellido del usuario.
     *
     * @param apellido String apellido del usuario.
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Metodo que modifica el email del usuario comprobando si el mail
     * es valido.
     *
     * @param email String email del usuario.
     */
    public void setEmail(String email) throws ExceptionUsuario {
        if (isEmailValido(email)) {
            this.email = email;
        } else
            throw new ExceptionUsuario("El email no es válido.");
    }

    /**
     * Metodo que modifica la contraseña del usuario comprobando si la contrasenia
     * es valida.
     *
     * @param password String contraseña del usuario.
     */
    public void setPassword(String password) throws ExceptionUsuario {
        if (isPasswordValido(password)) {
            this.password = password;
        } else
            throw new ExceptionUsuario("La contraseña no es válida.");
    }
}


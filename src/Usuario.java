import java.util.List;

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
    private List<Contacto> listaContactos;
    private List<Notas> listaNotas;

    public Usuario(String nombre, String apellido, String email, String password) throws ExceptionUsuario {
        if (isEmailValido(email) && isPasswordValido(password)) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.email = email;
            this.password = password;
        } else
            throw new ExceptionUsuario("El usuario no es válido.");
    }

    private boolean isPasswordValido(String password) {
        //password que tendrá que tener una longitud minima de 8 caracteres, una letra mayuscula y un caracter especial.
        return password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$");
    }

    private boolean isEmailValido(String email) {
        //email que para ser valido tendrá que tener un formato valido.
        return email.matches("^[_A-Za-z\\d+]+(\\.[_A-Za-z\\d-]+)*@" + "[A-Za-z\\d-]+(\\.[A-Za-z\\d]+)*(\\.[A-Za-z]{2,})$");
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public List<Contacto> getListaContactos() {
        return listaContactos;
    }

    public List<Notas> getListaNotas() {
        return listaNotas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEmail(String email) throws ExceptionUsuario {
        if (isEmailValido(email)) {
            this.email = email;
        } else
            throw new ExceptionUsuario("El email no es válido.");
    }

    public void setPassword(String password) throws ExceptionUsuario {
        if (isPasswordValido(password)) {
            this.password = password;
        } else
            throw new ExceptionUsuario("La contraseña no es válida.");
    }

    public void setListaContactos(List<Contacto> listaContactos) {
        this.listaContactos = listaContactos;
    }

    public void setListaNotas(List<Notas> listaNotas) {
        this.listaNotas = listaNotas;
    }

    public void (Contacto contacto) {
        listaContactos.add(contacto);
    }

    public void addNota(Notas nota) {
        listaNotas.add(nota);
    }

    public void removeContacto(Contacto contacto) {
        listaContactos.remove(contacto);
    }

    public void removeNota(Notas nota) {
        listaNotas.remove(nota);
    }

    public void editContacto(Contacto contacto) {
        listaContactos.set(listaContactos.indexOf(contacto), contacto);
    }

    public void editNota(Notas nota) {
        listaNotas.set(listaNotas.indexOf(nota), nota);
    }

}

/**
 * ExceptionUsuario es una excepción que se lanza cuando se intenta crear un usuario con un email o password no válidos.
 */
class ExceptionUsuario extends Exception {
    public ExceptionUsuario(String mensaje) {
        super(mensaje);
    }
}

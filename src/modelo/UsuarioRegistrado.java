package modelo;

import modelo.Excepciones.ExceptionUsuario;
import modelo.Interfaces.FuncionesContacto;
import modelo.Interfaces.FuncionesNotas;
import modelo.POJO.Usuario;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase UsuarioRegistrado que hereda de Usuario y que implementa la interfaz FuncionesNotas y FuncionesContactos
 * para que el usuario registrado pueda gestionar sus notas, contactos y libreta de contactos.
 *
 * @author Alberto
 * @version 1.0
 * @created 06-jun-2022
 */
public class UsuarioRegistrado extends Usuario implements FuncionesNotas, FuncionesContacto {
    private Identificar identificacion;
    private List<Notas> listaNotas = new ArrayList<>();
    private List<Contacto> listaContactos = new ArrayList<>();

    /**
     * Constructor de la clase UsuarioRegistrado.
     *
     * @param nombre         String con el nombre del usuario registrado.
     * @param apellido       String con el apellido del usuario registrado.
     * @param email          String con el email del usuario registrado.
     * @param password       String con la contraseña del usuario registrado.
     * @param identificacion Identificar con la identificación del usuario registrado.
     */
    public UsuarioRegistrado(String nombre, String apellido, String email, String password, Identificar identificacion) throws ExceptionUsuario {
        super(nombre, apellido, email, password);
        if (identificacion != Identificar.NICK && identificacion != Identificar.APODO) {
            throw new ExceptionUsuario("Identificacion no valida, debe ser NICK o APODO");
        } else {
            this.identificacion = identificacion;
        }
    }

    /**
     * Método que devuelve la identificación del usuario registrado.
     *
     * @return Identificar con la identificación del usuario registrado.
     */
    public Identificar getIdentificacion() {
        return identificacion;
    }

    /**
     * Método que modifica la identificación del usuario registrado.
     *
     * @return Identificar con la identificación del usuario registrado.
     */
    public void setIdentificacion(Identificar identificacion) {
        this.identificacion = identificacion;
    }

    /**
     * Método que devuelve la lista de notas del usuario registrado.
     *
     * @return Lista de notas del usuario registrado.
     */
    public List<Notas> getListaNotas() {
        return listaNotas;
    }

    /**
     * Método que modifica la lista de notas del usuario registrado.
     *
     * @return Lista de notas del usuario registrado.
     */
    public void setListaNotas(List<Notas> listaNotas) {
        this.listaNotas = listaNotas;
    }

    /**
     * Método que devuelve la lista de contactos del usuario registrado.
     *
     * @return Lista de contactos del usuario registrado.
     */
    public List<Contacto> getListaContactos() {
        return listaContactos;
    }

    /**
     * Método que modifica la lista de contactos del usuario registrado.
     *
     * @return Lista de contactos del usuario registrado.
     */
    public void setListaContactos(List<Contacto> listaContactos) {
        this.listaContactos = listaContactos;
    }

    /**
     * Metodo de la interfaz FuncionesNotas que devuelve una lista de notas.
     *
     * @param _listarNotas Lista de notas.
     * @return Lista de notas.
     */
    @Override
    public List<Notas> listarNotas(List<Notas> _listarNotas) {
        for (Notas nota : _listarNotas) {
            listaNotas.add(nota);
        }
        return listaNotas;
    }

    /**
     * Metodo de la interfaz FuncionesNotas que agrega notas a una lista.
     *
     * @param nota Nota a agregar.
     */
    @Override
    public void agregarNotas(Notas nota) {
        listaNotas.add(nota);
    }

    /**
     * Metodo de la interfaz FuncionesNotas que devuelve una lista de contactos.
     *
     * @param nota Nota a agregar.
     */
    @Override
    public void borrarNotas(Notas nota) {
        listaNotas.remove(nota);
    }

    /**
     * Metodo de la interfaz FuncionesNotas que devuelve una lista de contactos.
     *
     * @param nota      Nota a agregar.
     * @param nuevaNota Nota a agregar.
     */
    @Override
    public void modificarNotas(Notas nota, Notas nuevaNota) {
        Notas notaModificada = listaNotas.get(listaNotas.indexOf(nota));
        for (Notas notaActual : listaNotas) {
            if (notaActual.equals(nota)) {
                notaModificada = nuevaNota;
                break;
            }
        }
        if (notaModificada != null) {
            listaNotas.set(listaNotas.indexOf(nota), notaModificada);
        }
    }

    /**
     * Metodo de la interfaz FuncionesContacto que devuelve una lista de contactos.
     *
     * @param contactos Lista de contactos.
     * @return Lista de contactos.
     */
    @Override
    public List<Contacto> listarContactos(List<Contacto> contactos) {
        for (Contacto contacto : contactos) {
            listaContactos.add(contacto);
        }
        return listaContactos;
    }

    /**
     * Metodo de la interfaz FuncionesContacto que agrega contactos a una lista.
     *
     * @param contacto Contacto a agregar.
     */
    @Override
    public void agregarContacto(Contacto contacto) {
        listaContactos.add(contacto);
    }

    /**
     * Metodo de la interfaz FuncionesContacto que devuelve una lista de contactos.
     *
     * @param contacto Contacto a agregar.
     */
    @Override
    public void borrarContacto(Contacto contacto) {
        listaContactos.remove(contacto);
    }

    /**
     * Metodo de la interfaz FuncionesContacto que devuelve una lista de contactos.
     *
     * @param contacto      Contacto a agregar.
     * @param nuevoContacto Contacto a agregar.
     */
    @Override
    public void modificarContacto(Contacto contacto, Contacto nuevoContacto) {
        Contacto contactoModificado = listaContactos.get(listaContactos.indexOf(contacto));
        for (Contacto contactoActual : listaContactos) {
            if (contactoActual.equals(contacto)) {
                contactoModificado = nuevoContacto;
                break;
            }
        }
        if (contactoModificado != null) {
            listaContactos.set(listaContactos.indexOf(contacto), contactoModificado);
        }
    }

    @Override
    public String toString() {
        return String.format("%s - %s", super.toString(), identificacion);
    }
}

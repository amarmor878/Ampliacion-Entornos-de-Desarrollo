package modelo;

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
public class UsuarioRegistrado extends Usuario implements FuncionesNotas {
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
     * Metodo de la interfaz FuncionesNotas que devuelve una lista de notas.
     *
     * @param _listarNotas Lista de notas.
     * @return Lista de notas.
     */
    @Override
    public List<Notas> listarNotas(List<Notas> _listarNotas) {
        listaNotas.addAll(_listarNotas);
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

    //TODO solucionar implementacion de FuncionesContactos

}

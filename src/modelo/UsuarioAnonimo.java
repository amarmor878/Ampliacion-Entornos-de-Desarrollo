package modelo;

import modelo.interfaces.FuncionesNotas;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase POJO de Usuario que representa un usuario de la aplicación.
 *
 * @author Alberto
 * @version 1.0
 * @created 06-jun-2022
 */
public class UsuarioAnonimo implements FuncionesNotas {
    private final String nombre = "Anonimo";
    private static UsuarioAnonimo instance = null;
    private List<Notas> listaNotas = new ArrayList<>();

    /**
     * Constructor vacio de la clase modelo.UsuarioAnonimo.
     */
    private UsuarioAnonimo() {

    }

    /**
     * Método que devuelve la instancia de la clase modelo.UsuarioAnonimo.
     *
     * @return UsuarioAnonimo con la instancia de la clase.
     */
    public static UsuarioAnonimo getInstance() {
        if (instance == null) {
            instance = new UsuarioAnonimo();
        }
        return instance;
    }

    /**
     * Metodo de la interfaz FuncionesNotas que devuelve una lista de notas.
     *
     * @param _listaNotas Lista de notas.
     * @return Lista de notas.
     */
    @Override
    public List<Notas> listarNotas(List<Notas> _listaNotas) {
        listaNotas.addAll(_listaNotas);
        return listaNotas;
    }

    /**
     * Metodo de la interfaz FuncionesNotas que agrega notas a una lista.
     *
     * @return Lista de notas.
     */
    @Override
    public void agregarNotas(Notas nota) {
        listaNotas.add(nota);

    }

    /**
     * Metodo de la interfaz FuncionesNotas que elimina notas de una lista.
     *
     * @return Lista de notas.
     */
    @Override
    public void borrarNotas(Notas nota) {
        listaNotas.remove(nota);

    }

    /**
     * Metodo de la interfaz FuncionesNotas que modifica notas de una lista.
     *
     * @return Lista de notas.
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
}

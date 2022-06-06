import java.util.ArrayList;
import java.util.List;

/**
 * Clase POJO de Usuario que representa un usuario de la aplicación.
 *
 * @author Alberto
 * @version 1.0
 * @created 06-jun-2022
 */
public class UsuarioAnonimo {
    private final String nombre = "Anonimo";
    private static UsuarioAnonimo instance = null;
    private List<Notas> listaNotas = new ArrayList<>();

    /**
     * Constructor vacio de la clase UsuarioAnonimo.
     */
    private UsuarioAnonimo() {

    }

    /**
     * Método que devuelve la instancia de la clase UsuarioAnonimo.
     *
     * @return UsuarioAnonimo con la instancia de la clase.
     */
    public static UsuarioAnonimo getInstance() {
        if (instance == null) {
            instance = new UsuarioAnonimo();
        }
        return instance;
    }

    public void agregarNota(Notas nota) {
        listaNotas.add(nota);

    }

    public void eliminarNota(Notas nota) {
        listaNotas.remove(nota);
    }

    public void modificarNota(Notas nota, Notas nuevaNota) {
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

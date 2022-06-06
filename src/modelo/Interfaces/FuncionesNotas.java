package modelo.Interfaces;

import modelo.Notas;

import java.util.List;

/**
 * Interfaz con metodos para gestionar las anotaciones.
 *
 * @author Alberto
 * @version 1.0
 * @created 06-jun-2022
 */
public interface FuncionesNotas {
    List<Notas> listarNotas(List<Notas> notas);

    void agregarNotas(Notas nota);

    void borrarNotas(Notas nota);

    void modificarNotas(Notas nota, Notas nueva);

}

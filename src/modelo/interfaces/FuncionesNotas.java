package modelo.interfaces;

import modelo.Notas;

import java.util.List;

public interface FuncionesNotas {
    List<Notas> listarNotas(List<Notas> notas);

    void agregarNotas(Notas nota);

    void borrarNotas(Notas nota);

    void modificarNotas(Notas nota, Notas nueva);

}

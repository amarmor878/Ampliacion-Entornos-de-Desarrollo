package modelo;

import modelo.POJO.Usuario;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase abstracta que contiene un metodo para agregar usuarios a una lista y tener un registro
 * de usuarios.
 */
public abstract class Aplicacion {
    static List<Usuario> logUsuarios = new ArrayList<>();

    public static void agregarUsuario(Usuario usuario) {
        logUsuarios.add(usuario);
    }
}

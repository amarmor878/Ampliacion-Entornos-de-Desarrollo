package modelo.Interfaces;

import modelo.Contacto;

import java.util.List;

/**
 * Interfaz con metodos para gestionar los contactos.
 *
 * @author Alberto
 * @version 1.0
 * @created 06-jun-2022
 */
public interface FuncionesContacto {
    List<Contacto> listarContactos(List<Contacto> contactos);

    void agregarContacto(Contacto contacto);

    void borrarContacto(Contacto contacto);

    void modificarContacto(Contacto contacto, Contacto nuevo);
}

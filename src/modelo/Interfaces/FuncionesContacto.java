package modelo.Interfaces;

import modelo.Contacto;

import java.util.List;

public interface FuncionesContacto {
    List<Contacto> listarContactos(List<Contacto> contactos);

    void agregarContacto(Contacto contacto);

    void borrarContacto(Contacto contacto);

    void modificarContacto(Contacto contacto, Contacto nuevo);
}

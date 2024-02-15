package es.ies.puerto.modelo.interfaces;

import es.ies.puerto.modelo.entity.BibliotecaEntity;
import es.ies.puerto.modelo.entity.LibroEntity;

import java.util.List;

public interface IBiblioteca {
    /**
     * public BibliotecaEntity find(int id);
     */

    public BibliotecaEntity find(BibliotecaEntity bibliotecaEntity);
    public BibliotecaEntity update(BibliotecaEntity bibliotecaEntity);
    public BibliotecaEntity delete(BibliotecaEntity bibliotecaEntity);
    public List<LibroEntity> findBooksLibrary(BibliotecaEntity bibliotecaEntity);
}

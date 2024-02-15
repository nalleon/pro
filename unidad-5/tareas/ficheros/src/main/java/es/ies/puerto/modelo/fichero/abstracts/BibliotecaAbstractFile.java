package es.ies.puerto.modelo.fichero.abstracts;

import es.ies.puerto.modelo.entity.BibliotecaEntity;
import es.ies.puerto.modelo.entity.LibroEntity;
import es.ies.puerto.modelo.interfaces.IBiblioteca;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public abstract class BibliotecaAbstractFile implements IBiblioteca {
    @Override
    public BibliotecaEntity find(BibliotecaEntity bibliotecaEntity) {
        return null;
    }

    @Override
    public BibliotecaEntity update(BibliotecaEntity bibliotecaEntity) {
        return null;
    }

    @Override
    public BibliotecaEntity delete(BibliotecaEntity bibliotecaEntity) {
        return null;
    }

    @Override
    public List<LibroEntity> findBooksLibrary(BibliotecaEntity bibliotecaEntity) {
        return null;
    }

    public boolean fileExists(String path) {
        if (path == null || path.isEmpty()) {
            return false;
        }
        File file = new File(path);
        return file.exists() && file.isFile();
    }

    public boolean isDirectory(String path) {
        if (path == null || path.isEmpty()) {
            return false;
        }
        File file = new File(path);
        return file.exists() && file.isDirectory();
    }

    public void read(String path) {
        File file = new File(path);
        // Verificar si el fichero existe antes de intentar leerlo
        if (file.exists() && file.isFile()) {
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String string;

                // Leer cada línea del fichero
                while ((string = br.readLine()) != null) {
                    System.out.println(string);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("El fichero no existe o no es un fichero válido.");
        }
    }
}

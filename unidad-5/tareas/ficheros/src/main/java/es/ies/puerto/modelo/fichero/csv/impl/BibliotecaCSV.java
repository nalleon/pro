package es.ies.puerto.modelo.fichero.csv.impl;

import es.ies.puerto.modelo.fichero.abstracts.BibliotecaAbstractFile;
import es.ies.puerto.modelo.interfaces.IBiblioteca;

import java.io.File;

public class BibliotecaCSV extends BibliotecaAbstractFile implements IBiblioteca {

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
}

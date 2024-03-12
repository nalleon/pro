package es.ies.puerto.modelo.fichero.abstracts;

import java.io.File;

public abstract class FileAbstracts {
    public final String DELIMITER = ",";
    public boolean existFile(String path){
        File file = new File(path);
        if (path.isEmpty() || path == null) {
            return false;
        }
        return file.isFile() && file.exists();
    }

}

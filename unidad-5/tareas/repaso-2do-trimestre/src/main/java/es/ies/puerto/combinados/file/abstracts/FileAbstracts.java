package es.ies.puerto.combinados.file.abstracts;

import es.ies.puerto.combinados.Employee;

import java.io.File;
import java.util.List;

public class FileAbstracts {
    public final String DELIMITER = ",";
    public boolean existFile(String path){
        File file = new File(path);
        if (path == null || path.isEmpty()){
            return false;
        }
        return file.isFile() && file.exists();
    }
}

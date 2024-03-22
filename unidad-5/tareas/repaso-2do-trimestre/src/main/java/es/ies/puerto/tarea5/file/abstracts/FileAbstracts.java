package es.ies.puerto.tarea5.file.abstracts;

import es.ies.puerto.tarea4.file.FileJson;
import es.ies.puerto.tarea5.utilities.Utilities;

import java.io.File;

public abstract class FileAbstracts extends Utilities {
    public static final String pathDataCsv = "src/main/resources/data.csv";
    public static final String pathNotesCsv = "src/main/resources/dataCsv";
    public static final String pathSameNotesCsv = "src/main/resources/dataCsv";

    public boolean fileExists(String path){
        if (path == null || path.isEmpty()){
            return false;
        }
        File file = new File(path);
        return file.exists() && file.isFile();
    }
}

package es.ies.puerto.tarea4.abstracts;

import es.ies.puerto.tarea4.utilities.Utilities;

import java.io.File;

public abstract class FileAbstracts extends Utilities {
    public final String pathCsv = "src/main/resources/alimentos.csv";
    public final String pathXml = "src/main/resources/alimentos.xml";
    public final String pathJson = "src/main/resources/alimentos.json";



    public boolean fileExists(String path){
        File file = new File(path);
        if (path == null || path.isEmpty()){
            return false;
        }
        return file.exists() && file.isFile();
    }
}

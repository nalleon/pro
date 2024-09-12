package es.ies.puerto.file.abstracts;

import es.ies.puerto.file.utilities.Utilities;

import java.io.File;

public abstract class FileAbstracts extends Utilities {
    public static final String pathCuatro = "src/main/resources/cuatro.xml";
    public static final String pathDos = "src/main/resources/dos.json";
    public static final String pathTres = "src/main/resources/tres.csv";
    public static final String pathUno = "src/main/resources/uno.xml";

    /**
     * Method to check if the file exists
     * @param path to check
     * @return true if exist and is a file, else false
     */
    public boolean fileExists(String path){
        if (path == null || path.isEmpty()){
            return false;
        }
        File file = new File(path);
        return file.exists() && file.isFile();
    }
}

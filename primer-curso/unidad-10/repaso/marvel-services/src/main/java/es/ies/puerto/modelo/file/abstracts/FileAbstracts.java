package es.ies.puerto.modelo.file.abstracts;

import java.io.File;
import java.util.ArrayList;

public class FileAbstracts {
    /**
     * Properties
     */
    public final String XML_PATH="src/main/resources/example.xml";
    public final String CSV_PATH="src/main/resources/example.csv";
    public final String JSON_PATH="src/main/resources/json.csv";
    public final String DELIMITER=",";


    //public List<Personajes> characters;
    //public List<Alias> games;

    /**
     * Default constructor of the class
     */
    public FileAbstracts() {

    }

    /**
     * Method to check if a file exist
     * @param path of the file
     */

    public boolean fileExists(String path) {
        if (path == null || path.isEmpty()){
            return false;
        }
        File file = new File(path);
        return file.exists() && file.isFile();
    }
}

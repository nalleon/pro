package model.fichero;

import es.ies.puerto.modelo.fichero.csv.implementation.FileCSV;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileCSVTest {

    FileCSV fileCSV;


    @BeforeEach
    public void beforeEach(){
        fileCSV = new FileCSV();
    }
    @Test
    public void fileExistFalseTest(){
        Assertions.assertFalse(fileCSV.fileExist(null), "Expected result not found");
        Assertions.assertFalse(fileCSV.fileExist(""), "Expected result not found");
        Assertions.assertFalse(fileCSV.fileExist("src/main/resources"),
                "Expected result not found");

    }

    @Test
    public void fileExistTrueTest(){
        Assertions.assertTrue(fileCSV.fileExist("src/main/resources/alimentos.csv"),
                "Expected result not found");
    }

    @Test
    public void saveInFileFalseTest(){
        Assertions.assertFalse(fileCSV.saveInFile(null,null), "Expected result not found");
        Assertions.assertFalse(fileCSV.saveInFile("",null), "Expected result not found");
        Assertions.assertFalse(fileCSV.saveInFile("src/main/resources", "testText"),
                "Expected result not found");
    }

    @Test
    public void saveInFileTrueTest(){
        Assertions.assertTrue(fileCSV.fileExist("src/main/resources/alimentos.csv"),
                "Expected result not found");
    }

}

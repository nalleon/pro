package es.ies.puerto.modelo.file;

import es.ies.puerto.modelo.Persona;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class FileXMLTest {
    FileXML fileXML;
    List<Persona> personaList;

    @BeforeEach
    public void beforeEach(){
        fileXML = new FileXML();
        personaList = new ArrayList<>();
        personaList = fileXML.obtainPersonas();
    }


}

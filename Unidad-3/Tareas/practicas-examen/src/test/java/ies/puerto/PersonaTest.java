package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.util.Date;

public class PersonaTest {

@Test
    public void ageTest () throws ParseException {
        Persona persona = new Persona("Nabil", "06/07/2005");
        long result = persona.calculateEdad(persona);
        long resultOK = 18;
        Assertions.assertEquals(resultOK, result, "Expected result not found.");
    }
}

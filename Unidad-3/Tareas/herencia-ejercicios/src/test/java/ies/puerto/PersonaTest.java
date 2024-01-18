package ies.puerto;
import ies.puerto.Excepciones.ValidacionException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PersonaTest {
<<<<<<< HEAD
 Persona persona = new Persona ();
=======
    Persona persona = new Persona("Claus", 36, "12345678K");
    @Test
    void fullConstructorTest() {
        assertEquals("Claus", persona.getName(),"Expected result not found.");
        assertEquals(36, persona.getAge(),"Expected result not found.");
        assertEquals("12345678K", persona.getDni(),"Expected result not found.");
    }
>>>>>>> e5dba78027a6e28ab23115d5235e19b01f716d01

    @Test
    void setNameTest() {
        persona.setName("Alice");
        assertEquals("Alice", persona.getName(),"Expected result not found.");
    }

    @Test
    void setAgeTest() {
        persona = new Persona("Nabil", 18);
        assertEquals(18, persona.getAge(),"Expected result not found.");
    }
    @Test
    void setAgeExceptionTest() {
        assertThrows(ValidacionException.class, () -> persona.setAge(-12), "Expected result not found.");
    }

    @Test
    void setDniExceptionTest() {
        assertThrows(ValidacionException.class, () -> persona.setDni("12345u"),"Expected result not found.");
    }

    @Test
    void toStringTest() {
        persona = new Persona("Claus", 36, "12345678K");
        String resultOK = "Name: Claus\nAge: 36\nDNI: 12345678K";
        assertEquals(resultOK, persona.toString(),"Expected result not found.");
    }

    @Test
    void defaultGreetingTest() {
        assertEquals("Welcome to the app!", persona.greeting(),"Expected result not found.");
    }
}


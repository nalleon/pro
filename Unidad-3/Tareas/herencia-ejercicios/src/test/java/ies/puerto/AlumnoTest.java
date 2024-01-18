package ies.puerto;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AlumnoTest {
    Alumno alumno = new Alumno();

    @Test
    public void constructorTestOK (){
        alumno = new Alumno("Claus", 36, "12345678K");
        assertEquals("Claus", alumno.getName(),"Expected result not found.");
        assertEquals(36, alumno.getAge(),"Expected result not found.");
        assertEquals("12345678K", alumno.getDni(),"Expected result not found.");
    }
}

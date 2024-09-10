package ies.puerto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
public class EstudianteTest {

    Estudiante estudiante = new Estudiante();

    @Test
    public void constructorTestOK (){
        estudiante = new Estudiante("1DAM", new float[]{7.6f, 5f, 10f, 8.4f, 5.75f}, "Claus", 36,
                "12345678K");

        assertEquals("1DAM", estudiante.getCourse(),"Expected result not found.");
        assertEquals(Arrays.toString(new float[]{7.6f, 5f, 10f, 8.4f, 5.75f}), Arrays.toString(estudiante.getScores()),
                "Expected result not found.");
        assertEquals("Claus", estudiante.getName(),"Expected result not found.");
        assertEquals(36, estudiante.getAge(),"Expected result not found.");
        assertEquals("12345678K", estudiante.getDni(),"Expected result not found.");
    }

    @Test
    public void setCourseOK (){
        estudiante.setCourse("2BACH");
        assertEquals("2BACH", estudiante.getCourse(), "Expected result not found.");
    }

    @Test
    public void setScoresOK (){
        estudiante.setScores(new float[]{6.6f, 9f, 4.3f, 3.4f, 5.78f});
        assertEquals(Arrays.toString(new float[]{6.6f, 9f, 4.3f, 3.4f, 5.78f}), Arrays.toString(estudiante.getScores()),
                "Expected result not found.");
    }

    @Test
    public void greetingTestOK (){
        estudiante.setName("Claus");
        assertEquals("Welcome to the app, Claus!", estudiante.greeting(), "Expected result not found.");
    }
}

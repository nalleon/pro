package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio3Test {

    Ejercicio3 ejercicio3 = new Ejercicio3();

    @Test
    public void calificationsSwitchSuspensoNegativeTest (){
        double note = -1;
        String resultado = ejercicio3.calificationsSwitch(note);
        Assertions.assertEquals("Suspenso", resultado, "Expected result was not found.");
    }
    @Test
    public void calificationsSwitchSuspensoTest (){
        double note = 4.3;
        String resultado = ejercicio3.calificationsSwitch(note);
        Assertions.assertEquals("Suspenso", resultado, "Expected result was not found.");
    }
    @Test
    public void calificationsSwitchAprobadoTest (){
        double note = 5.4;
        String resultado = ejercicio3.calificationsSwitch(note);
        Assertions.assertEquals("Aprobado", resultado, "Expected result was not found.");
    }
    @Test
    public void calificationsSwitchBienTest (){
        double note = 6;
        String resultado = ejercicio3.calificationsSwitch(note);
        Assertions.assertEquals("Bien", resultado, "Expected result was not found.");
    }
    @Test
    public void calificationsSwitchNotableTest (){
        double note = 8;
        String resultado = ejercicio3.calificationsSwitch(note);
        Assertions.assertEquals("Notable", resultado, "Expected result was not found.");
    }
    @Test
    public void calificationsSobresalienteSwitch (){
        double note = 9.5;
        String resultado = ejercicio3.calificationsSwitch(note);
        Assertions.assertEquals("Sobresaliente", resultado, "Expected result was not found.");
    }
    @Test
    public void calificationsMatriculaSwitch (){
        double note = 10;
        String resultado = ejercicio3.calificationsSwitch(note);
        Assertions.assertEquals("Matricula", resultado, "Expected result was not found.");
    }
    @Test
    public void calificationsMatricula23Switch (){
        double note = 23;
        String resultado = ejercicio3.calificationsSwitch(note);
        Assertions.assertEquals("Matricula", resultado, "Expected result was not found.");
    }
    @Test
    public void calificationsSuspenso46IfElse(){
        double note = -46;
        String resultado = ejercicio3.calificationsIfElse(note);
        Assertions.assertEquals("Suspenso", resultado, "Expected result was not found.");
    }
    @Test
    public void calificationsSuspensoIfElse(){
        double note = 3.2;
        String resultado = ejercicio3.calificationsIfElse(note);
        Assertions.assertEquals("Suspenso", resultado, "Expected result was not found.");
    }
    @Test
    public void calificationsAprobadoIfElse(){
        double note = 5.3;
        String resultado = ejercicio3.calificationsIfElse(note);
        Assertions.assertEquals("Aprobado", resultado, "Expected result was not found.");
    }
    @Test
    public void calificationsBienIfElse(){
        double note = 6.2;
        String resultado = ejercicio3.calificationsIfElse(note);
        Assertions.assertEquals("Bien", resultado, "Expected result was not found.");
    }
    @Test
    public void calificationsNotableIfElse(){
        double note = 7.4;
        String resultado = ejercicio3.calificationsIfElse(note);
        Assertions.assertEquals("Notable", resultado, "Expected result was not found.");
    }
    @Test
    public void calificationsSobresalienteIfElse(){
        double note = 9;
        String resultado = ejercicio3.calificationsIfElse(note);
        Assertions.assertEquals("Sobresaliente", resultado, "Expected result was not found.");
    }
    @Test
    public void calificationsMatriculaIfElse(){
        double note = 10;
        String resultado = ejercicio3.calificationsIfElse(note);
        Assertions.assertEquals("Matricula", resultado, "Expected result was not found.");
    }
    @Test
    public void calificationsMatricula28IfElse(){
        double note = 28;
        String resultado = ejercicio3.calificationsIfElse(note);
        Assertions.assertEquals("Matricula", resultado, "Expected result was not found.");
    }
}

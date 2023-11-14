package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio1Test {
 Ejercicio1 ejercicio1 = new Ejercicio1();

    double[] notes = {1, 2, 3, 4, 5};


    @Test
    public void showAllTestOK (){
        double [] result = ejercicio1.showAllNotes(notes);
        double [] resultOK = {1, 2, 3, 4, 5};
        Assertions.assertArrayEquals(resultOK, result, "Expected result nor found");

    }

    @Test
    public void higherNotesTestOK (){
        double result = ejercicio1.higherNote(notes);
        double resultOK = 5;
        Assertions.assertEquals(resultOK, result, "Expected result nor found");

    }
    @Test
    public void lowerNotesTestOK (){
        double result = ejercicio1.lowerNote(notes);
        double resultOK = 1;
        Assertions.assertEquals(resultOK, result, "Expected result nor found");

    }
    @Test
    public void averageNotesTestOK (){
        double result = ejercicio1.averageNote(notes);
        double resultOK = 3;
        Assertions.assertEquals(resultOK, result, "Expected result nor found");

    }
}

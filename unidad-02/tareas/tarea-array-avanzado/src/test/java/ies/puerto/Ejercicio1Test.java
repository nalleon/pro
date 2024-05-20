package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio1Test {
 Ejercicio1 ejercicio1 = new Ejercicio1();

    float[] notes = {1.5f, 2.5f, 3.5f, 4.5f, 5.5f};

    @Test
    public void valueNotesOKTest (){
        String result = ejercicio1.valueNotesOK(notes);
        String resultOK = "Notes values are valid";
        Assertions.assertEquals(resultOK, result, "Expected result not found");
    }
    @Test
    public void valueNotesBigger10OKTest (){
        float[] notes = {1.5f, 2.5f, 3.5f, 4.5f, 55.5f};
        String result = ejercicio1.valueNotesOK(notes);
        String resultOK = "Notes values are not valid";
        Assertions.assertEquals(resultOK, result, "Expected result not found");
    }
    @Test
    public void valueNotesNotNegativeOKTest (){
        float[] notes = {-1.5f, 2.5f, 3.5f, 4.5f, 5.5f};
        String result = ejercicio1.valueNotesOK(notes);
        String resultOK = "Notes values are not valid";
        Assertions.assertEquals(resultOK, result, "Expected result not found");
    }
    @Test
    public void showAllTestOK (){
        float [] result = ejercicio1.showAllNotes(notes);
        float [] resultOK = {1.5f, 2.5f, 3.5f, 4.5f, 5.5f};
        Assertions.assertArrayEquals(resultOK, result, "Expected result not found");

    }
    @Test
    public void higherNotesTestOK (){
        float result = ejercicio1.higherNote(notes);
        float resultOK = 5.5f;
        Assertions.assertEquals(resultOK, result, "Expected result nor found");

    }
    @Test
    public void lowerNotesTestOK (){
        float result = ejercicio1.lowerNote(notes);
        float resultOK = 1.5f;
        Assertions.assertEquals(resultOK, result, "Expected result nor found");

    }
    @Test
    public void averageNotesTestOK (){
        float result = ejercicio1.averageNote(notes);
        float resultOK = 3.5f;
        Assertions.assertEquals(resultOK, result, "Expected result nor found");

    }
}

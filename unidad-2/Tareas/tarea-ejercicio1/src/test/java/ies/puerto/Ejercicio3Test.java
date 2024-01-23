package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio3Test {

    Ejercicio3 ejercicio3 = new Ejercicio3();


    @Test
    public void clasificacionNotasIfTestOK (){
        double nota = 7;
        String resultadoOK = "Notable";
        String resultado = ejercicio3.clasificacionNotasIf(nota);
        Assertions.assertEquals(resultadoOK, resultado, "No se ha obtenido el resultado esperado");

    }

    @Test
    public void clasificacionNotasSwitchTestOK (){
        int nota = 7;
        String resultadoOK = "Notable";
        String resultado = ejercicio3.clasificacionNotasSwitch(nota);
        Assertions.assertEquals(resultadoOK, resultado, "No se ha obtenido el resultado esperado");

    }
}

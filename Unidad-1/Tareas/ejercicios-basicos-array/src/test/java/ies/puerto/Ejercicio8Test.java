package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio8Test {
    Ejercicio8 ejercicio8 = new Ejercicio8();

    @Test
    public void arrayDuplicadosTestOK (){
        int [] numeros = {1,1,1,2,3,4};
        int [] numerosCopia =numeros;
        int [] resultadoOK = {1,2,3,4};
        int  resultado = ejercicio8.eliminarDuplicados(numeros, numerosCopia);
        Assertions.assertEquals(resultadoOK, resultado, "No se ha obtenido el resultado esperado.");
    }

}

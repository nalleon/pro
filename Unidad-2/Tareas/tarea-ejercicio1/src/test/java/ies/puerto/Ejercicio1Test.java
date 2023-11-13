package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio1Test {

    Ejercicio1 ejercicio1 = new Ejercicio1();
    @Test
    public void arrayBinarioTestOK (){
        int [] numeros = {1, 4, 5};
        int valor = 3;
        int resultado = ejercicio1.arrayBinario(numeros, valor);
        int resultadoOK=-1;
        Assertions.assertEquals(resultadoOK, resultado, "No se ha obtenido el resultado esperado");
    }
}

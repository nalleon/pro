package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class LibroTest {
    Libro libro = new Libro();

    @Test
    public void imprimirTest(){
        Libro libro = new Libro("Legend of the Galactic Heroes", "Yoshiki Tanaka", 1984);
        String resultadoOk = "Titulo:Legend of the Galactic Heroes, Autor:Yoshiki Tanaka, AnioPublicacion:1984";
        Assertions.assertEquals(resultadoOk, libro.imprimir(), "No es el resultado esperado");
    }
}

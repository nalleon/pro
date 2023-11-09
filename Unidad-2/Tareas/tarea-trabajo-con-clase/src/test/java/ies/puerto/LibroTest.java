package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class LibroTest {
    String titulo = "Legend of the Galactic Heroes";
    String autor = "Yoshiki Tanaka";
    int anioPublicacion = 1984;
    Libro libro;

    @BeforeEach
    public void beforeEach (){
        libro = new Libro(titulo, autor, anioPublicacion);
    }
    @Test
    public void constructorTestOK (){
        Assertions.assertEquals(titulo, libro.getTitulo(), "No se ha obtenido el resultado esperado");
        Assertions.assertEquals(autor, libro.getAutor(), "No se ha obtenido el resultado esperado");
        Assertions.assertEquals(anioPublicacion, libro.getAnioPublicacion(), "No se ha obtenido el resultado esperado");

    }
    @Test
    public void setTituloTestOK (){
        String miTitulo = "Otro titulo";
        libro.setTitulo(miTitulo);

        Assertions.assertEquals(miTitulo, libro.getTitulo(), "No se ha obtenido el resultado esperado");
    }
    @Test
    public void setAutorTestOK (){
        String miAutor = "Otro autor";
        libro.setAutor(miAutor);
        Assertions.assertEquals(miAutor, libro.getAutor(), "No se ha obtenido el resultado esperado");
    }
    @Test
    public void setAnioPublicacionTestOK (){
        int otroAnio = 2019;
        libro.setAnioPublicacion(otroAnio);
        Assertions.assertEquals(otroAnio, libro.getAnioPublicacion(), "No se ha obtenido el resultado esperado");
    }

    @Test
    public void imprimirTest(){
        String resultadoOk = "Titulo:"+titulo+", Autor:"+autor+", Anio de publicacion:"+anioPublicacion;
        Assertions.assertEquals(resultadoOk, libro.imprimir(), "No es el resultado esperado");
    }
}

package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class PersonaTest {
    String nombre = "Nabil";
    int edad = 18;
    int anioPublicacion = 1984;

    Persona persona;

    @Test
    public void imprimirTest(){
        Persona persona1 = new Persona("Nabil", 18, "nla@gmail.com", 987654321);
        String resultadoOk = "Nombre:Nabil, Edad:18, Email:nla@gmail.com, Telefono:987654321";
        Assertions.assertEquals(resultadoOk, persona1.imprimir(), "No es el resultado esperado");
    }
}

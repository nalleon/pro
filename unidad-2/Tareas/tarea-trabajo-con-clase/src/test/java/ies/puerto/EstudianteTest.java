package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EstudianteTest {

    Estudiante estudiante = new Estudiante();

    @Test
    public void imprimirTest () {
        Estudiante estudiante1 = new Estudiante("Nabil", 18, "DAM", 6);
        String resultado = estudiante1.imprimir();
        String resultadoOK = "Nombre:Nabil, Edad:18, Carrera:DAM, Promedio:6.0";
        Assertions.assertEquals(resultadoOK, resultado, "No es el resultado esperado");
    }

    @Test
    public void aprobadoTest () {
        Estudiante estudiante1 = new Estudiante("Nabil", 18, "DAM", 6);
        boolean resultado = estudiante1.aprobado();
        boolean resultadoOK = true;
        Assertions.assertEquals(resultadoOK, resultado, "No es el resultado esperado");
    }
    @Test
    public void suspendidoTest () {
        Estudiante estudiante1 = new Estudiante("Nabil", 18, "DAM", 4);
        boolean resultado = estudiante1.aprobado();
        boolean resultadoOK = false;
        Assertions.assertEquals(resultadoOK, resultado, "No es el resultado esperado");
    }
}

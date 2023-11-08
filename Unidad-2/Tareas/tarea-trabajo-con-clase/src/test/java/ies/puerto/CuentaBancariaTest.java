package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CuentaBancariaTest {

    CuentaBancaria cuenta = new CuentaBancaria();

    @Test
    public void depositarTest () {
        CuentaBancaria cuentaBancaria = new CuentaBancaria(27, "Alex", 2200f);
        float resultado = cuentaBancaria.depositar(22f);
        float resultadoOk = 2222f;
        Assertions.assertEquals(resultadoOk, resultado, "No es el resultado esperado");
    }

    @Test
    public void retirarTest () {
        CuentaBancaria cuentaBancaria = new CuentaBancaria(27, "Alex", 2200f);
        float resultado = cuentaBancaria.retirar(200f);
        float resultadoOk = 2000f;
        Assertions.assertEquals(resultadoOk, resultado, "No es el resultado esperado");
    }

    @Test
    public void mostrarSaldoTest () {
        CuentaBancaria cuentaBancaria = new CuentaBancaria(27, "Alex", 2200f);
        String resultado = cuentaBancaria.mostrarSaldo();
        String resultadoOk = "2200.0";
        Assertions.assertEquals(resultadoOk, resultado, "No es el resultado esperado");
    }
}

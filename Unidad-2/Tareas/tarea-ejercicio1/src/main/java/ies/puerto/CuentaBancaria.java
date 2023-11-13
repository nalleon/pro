package ies.puerto;

/**
 * Crea una clase CuentaBancaria con propiedades como numeroCuenta, nombreTitular y saldo. Agrega métodos para
 * realizar depósitos, retiros, y mostrar el saldo actual.
 * @author Nabil
 */
    public class CuentaBancaria {
    private String titular;
    double saldo;
    ;

    /**
     * Constructor por defecto de la clase
     */
    public CuentaBancaria() {
    }

    /**
     * Constructor de la clase
     * @param titular de la cuenta
     */
    public CuentaBancaria(String titular) {
        this.titular = titular;
    }

    /**
     * Constructor de la clase con todos sus parametros
     * @param titular de la cuenta
     * @param saldo de la cuenta
     */
    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    /**
     * Getters/Setters de la clase
     */
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
        



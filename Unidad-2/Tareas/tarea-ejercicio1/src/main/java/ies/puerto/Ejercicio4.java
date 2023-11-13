package ies.puerto;

/**
 * Crea una clase CuentaBancaria con propiedades como numeroCuenta, nombreTitular y saldo. Agrega métodos para
 * realizar depósitos, retiros, y mostrar el saldo actual.
 * @author Nabil
 */
public class Ejercicio4 {
 CuentaBancaria cuentaBancaria;

    /**
     * Constructor por defecto de la clase
     */
    public  Ejercicio4 (){
    }
    /**
     * Constructor de la clase
     * @param cuentaBancaria llamada para operar
     */
 public  Ejercicio4 (CuentaBancaria cuentaBancaria){
     this.cuentaBancaria = cuentaBancaria;
 }

    /**
     * Funcion que calcula el saldo que hay cuando se deposita una cantidad de dinero utilizando la clase CuentaBancaria
     * @param saldoAniadido
     * @return
     */
  public double depositarDinero (double saldoAniadido){
      return saldoAniadido+cuentaBancaria.getSaldo();
  }

    /**
     * Funcion que calcula el saldo que queda cuando se retira una cantidad de dinero utiliando la clase CuentaBancaria
     * @param saldoRetirado cantidad retirada
     * @return lo que queda en la cuenta
     */
    public double retirarDinero (double saldoRetirado){
        return cuentaBancaria.getSaldo()-saldoRetirado;
    }

    /**
     * Función que imprime la información de la cuenta utilizando la clase CuentaBancaria
     * @return
     */
    public String imprimirInformacion (){
     return "Titular:" + cuentaBancaria.getTitular() + ", Saldo:" + cuentaBancaria.getSaldo();
    }
}

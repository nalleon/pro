package ies.puerto;

/**
 * Crea una clase CuentaBancaria con propiedades como numeroCuenta, nombreTitular y saldo. Agrega métodos para
 * realizar depósitos, retiros, y mostrar el saldo actual.
 * @author Nabil
 */
    public class CuentaBancaria {
        private int numeroCuenta;
        private String nombreTitular;
        private float saldo;

        /**
         * Constructor por defecto de la clase
         */
        public CuentaBancaria () {}

        /**
         * Constructor de la clase
         * @param numeroCuenta de la cuenta
         */
        public CuentaBancaria (int numeroCuenta){
            this.numeroCuenta = numeroCuenta;
        }

        /**
         * Constructor de la clase
         * @param numeroCuenta de la cuenta
         * @param nombreTitular de la cuenta
         */
        public CuentaBancaria (int numeroCuenta, String nombreTitular) {
            this.numeroCuenta = numeroCuenta;
            this.nombreTitular = nombreTitular;
        }
        /**
         * Constructor de la clase
         * @param numeroCuenta de la cuenta
         * @param nombreTitular de la cuenta
         * @param saldo de la cuenta
         */
        public CuentaBancaria (int numeroCuenta, String nombreTitular, float saldo) {
            this.numeroCuenta = numeroCuenta;
            this.nombreTitular = nombreTitular;
            this.saldo = saldo;
        }

        /**
         * Funcion para depositar dinero
         * @param numeroDepositar dinero a depositar
         */

        public float depositar (float numeroDepositar) {
            this.saldo += numeroDepositar;
            return this.saldo;
        }
        /**
         * Funcion para retirar dinero
         * @param numeroRetirar dinero a retirar
         */

        public float retirar (float numeroRetirar) {
            this.saldo -= numeroRetirar;
            return this.saldo;
        }

        /**
         * Funcion para mostrar el saldo de la cuenta
         * @return saldo de la cuenta
         */
        public String mostrarSaldo () {
            return "" + this.saldo;
        }
    }


package ies.puerto;

/**
 * Realiza un programa que tenga un método al que se le pase un número e indique si es
 * positivo o negativo y si es par o impar.
 * @author Nabil
 */
public class Ejercicio2 {


    public String signoNumero (int numero) {
        if (numero > 0) {
            return "positivo";
        } else {
            return "negativo";
        }
    }
        public String esPar(int numero){
        String resultado = "impar";
        if (numero % 2 == 0) {
            resultado = "par";
        }
        return resultado;
    }
}



package ies.puerto;

/**
 * Realiza un programa que tenga un método al que se le pase un número e indique si es
 * positivo o negativo y si es par o impar.
 * @author Nabil
 */
public class Ejercicio2 {
    /**
     * Funcion que determina el signo del numero.
     * @param numero a evaluar.
     * @return "positivo" si es mayor a 0, "negativo" si es menor a este.
     */
    public String signoNumero (int numero) {
        if (numero > 0) {
            return "positivo";
        }
        return "negativo";
    }

    /**
     * Funcion que determina si el numero es par o impar.
     * @param numero a evaluar.
     * @return "par" si es par, "impar" en caso contrario.
     */
        public String esPar(int numero){
        String resultado = "impar";
        if (numero % 2 == 0) {
            resultado = "par";
        }
        return resultado;
    }
}



package ies.puerto;

/**
 * Realiza un programa que tenga un método al que se le pase un número e indique si es
 * positivo o negativo y si es par o impar.
 * @author Nabil
 */
public class Ejercicio2 {
    public String esPrimo (int numero){
        if (numero == 2 || numero ==3){
            return "Es primo.";
        }
        if (numero <=1 || numero % 2 == 0 || numero % 3 == 0 ) {
            return "No es primo.";
        }
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return "No es primo.";
            }
        }
        return "Es primo.";
    }

        while (numeroPositivo < 0) {

        }
        
    }
}

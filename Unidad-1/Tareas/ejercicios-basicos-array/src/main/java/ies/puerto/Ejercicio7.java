package ies.puerto;
import java.util.Arrays;

/**
 * Ordena un array de enteros en orden ascendente.
 * @author  Nabil
 */
public class Ejercicio7 {
    /**
     * Funcion que ordena numeros enteros en orden ascendente.
     * @param numeros a ordenar
     * @return los mismos numeros pero ordenados ascendentemente
     */
        public int[] arrayOrdenado (int[] numeros) {
            Arrays.sort(numeros);
            for (int i = 0; i < numeros.length; i++) {
                System.out.print(numeros[i] + " ");
            }
            System.out.println();
            return numeros;
        }
    }



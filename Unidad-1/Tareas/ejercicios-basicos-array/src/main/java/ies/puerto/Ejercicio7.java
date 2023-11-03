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
            for (int i = 0; i < numeros.length -1; i++) {
                for (int j=0; j < numeros.length -i; j++){
                    if (numeros[j] > numeros[i-1]) {
                        int temporal = numeros[j];
                    }
                }
                System.out.print(numeros[i] + " ");
            }
            System.out.println();
            return numeros;
        }
    }



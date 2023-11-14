package ies.puerto;

/**
 * Implementa el algoritmo de ordenamiento de burbuja para ordenar un array de números enteros.
 * El ordenamiento de burbuja es un algoritmo de ordenamiento simple que funciona comparando
 * repetidamente pares de elementos adyacentes y intercambiándolos si están en el orden
 * incorrecto. Este proceso se repite hasta que no se requieren más intercambios, lo
 * que indica que el array está ordenado
 * @author Nabil
 */
public class Ejercicio2 {

    public int [] ordenarArray (int [] array) {
        int numeros = array.length;
        boolean intercambio;

        do {
            for (int i = 0; i < numeros - 1; i++) {
                if (array[i - 1] > array[i]) {
                    intercambio = true;
                }
                numeros--;
            }
        } while (intercambio = false);
        return array;
    }
}

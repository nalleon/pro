package ies.puerto;
/**
 * Imprime los números pares de un array de enteros.
 * @author Nabil
 */
public class Ejercicio4 {
    public int numerosPares(int valorA, int valorB, int valorC) {
        int [] numeros = {valorA, valorB, valorC};
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i]);
            }
        }
        return numerosPares(valorA, valorB, valorC);
    }
}
package ies.puerto;
/**
 * Imprime los números pares de un array de enteros.
 * @author Nabil
 */
public class Ejercicio4 {
    /**
     * Funcion que imprime todos los numeros pares de un array entero
     * @param numeros valores a recorrer
     * @return el numero de pares
     */
    public int numerosPares(int [] numeros) {
        /**
         * @param contador cuenta el numero de pares.
         */
        int contador = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i]+ ";");
                contador++;
            }
        }
        return contador;
    }
}
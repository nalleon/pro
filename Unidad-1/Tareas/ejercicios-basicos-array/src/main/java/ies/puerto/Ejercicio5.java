package ies.puerto;

/**
 * Dado un valor específico, encuentra su posición en el array o
 * indica si no está presente.
 * @author nabil
 */
    public class Ejercicio5 {
    /**
     * Funcion que busca un valor en el array e imprime su posicion
     * @param numeros valores del array
     * @param valor a encontrar
     * @return la posicion en el array
     */
        public static int encontrarPosicion(int[] numeros, int valor) {
            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] == valor) {
                    System.out.println("El valor " + valor + " se encuentra en la posición " + i + " del array.");
                    return i;
                }
            }
            System.out.println("El valor " + valor + " no se encuentra en el array.");
            return -1;
        }
    }



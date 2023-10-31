package ies.puerto;

/**
 * Dado un valor específico, encuentra su posición en el array o
 * indica si no está presente.
 * @author nabil
 */
public class Ejercicio5 {
    public static int encontrarPosicion(int[] numeros, int valor) {
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    public int mostrarPosicion (int[] numeros, int valorBuscado) {
        int posicion = encontrarPosicion(numeros, valorBuscado);

        System.out.println("El valor " + valorBuscado + " no se encuentra en el array.");
        if (posicion != -1) {
            System.out.println("El valor " + valorBuscado + " se encuentra en la posición " + posicion + " del array.");

    }
        return posicion;
    }
}

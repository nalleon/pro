package ies.puerto;

/**
 * Implementa el algoritmo de búsqueda binaria para encontrar la posición
 * de un elemento en un array ordenado.
 */
public class Ejercicio1 {
    /**
     * Array que realiza una busqueda binaria para encontrar
     * @param numeros arreglo de enteros
     * @param valor a buscar
     * @return el resultado
     */
    public int arrayBinario (int[] numeros, int valor) {
        int inicio = 0;
        int fin = numeros.length - 1;
        int puntoMedio = (inicio + fin) / 2;
        int resultado = 0;

        while (inicio <= fin) {
            resultado = -1;
            if (numeros[puntoMedio] == valor) {
                resultado = puntoMedio;
            }
            if (numeros[puntoMedio] < valor) {
                resultado = puntoMedio + 1;
            }
            if (numeros[puntoMedio] > valor) {
                resultado = puntoMedio - 1;
            }
        }
        return resultado;
    }
}
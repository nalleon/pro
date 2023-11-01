package ies.puerto;

/**
 * Combina dos arrays ordenados en uno solo manteniendo el orden.
 * @author Nabil
 */
public class Ejercicio9 {
    /**
     * Funcion que ordena y combina dos array en orden ascendente.
     * @param primerArray arreglo de enteros
     * @param segundoArray arreglo de enteros
     * @param resultado arreglo de enteros
     * @return retorna resultado
     */
    public int arrayOrdenadoCombinado(int[] primerArray, int[] segundoArray, int[] resultado) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < primerArray.length && j < segundoArray.length) {
            if (primerArray[i] < segundoArray[j]) {
                resultado[k] = primerArray[i];
                i++;
            } else {
                resultado[k] = segundoArray[j];
                j++;
            }
            k++;
        }
        while (i < primerArray.length) {
            resultado[k] = primerArray[i];
            i++;
            k++;
        }
        while (j < segundoArray.length) {
            resultado[k] = segundoArray[j];
            j++;
            k++;
        }
        return k;
    }
}

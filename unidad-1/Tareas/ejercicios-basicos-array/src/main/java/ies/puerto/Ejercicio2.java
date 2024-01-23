package ies.puerto;

/**
 * Calcula el promedio de los elementos en un array de números en punto flotante.
 * @author Nabil
 */
public class Ejercicio2 {
    /**
     * Funcion que calcula el promedio de los numeros con un float
     * @param valorA para el calculo
     * @param valorB para el calculo
     * @param valorC para el calculo
     * @param valorD para el calculo
     * @param valorE para el calculo
     * @return el promedio
     */
    public float calcularPromedio (float valorA, float valorB, float valorC, float valorD, float valorE){
        float[] numeros = {valorA, valorB, valorC, valorD, valorE};
        float suma = 0;

        for (int i =0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        return suma / numeros.length;
    }
}



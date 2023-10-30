package ies.puerto;
/**
 * Escribe un programa que calcule la suma de todos los elementos en un
 * array de enteros.
 * @author Nabil
 */
    public class Ejercicio1 {

    /**
     * Funcion que calcula una suma de los elementos de un array
     * @return la suma de los numeros
     */
    public int calcularSuma() {
        int[] numeros = {1, 2, 3, 4, 5};
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        return suma;
    }

    /**
     * Funcion que muestra el resultado de la suma.
     * @return resultado de la suma.
     */
    public String mostrarResultado (){
        return "La suma de los elementos es: " + calcularSuma();
    }
}

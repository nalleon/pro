package ies.puerto;
/**
 * Escribe un programa que calcule la suma de todos los elementos en un
 * array de enteros.
 * @author Nabil
 */
    public class Ejercicio1 {


    public int calcularSuma() {
        int[] array = {1, 2, 3, 4, 5};
        int suma = 0;

        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        return suma;
    }
    public void mostrarResultado (){
        System.out.println(calcularSuma());
        return;
    }
}

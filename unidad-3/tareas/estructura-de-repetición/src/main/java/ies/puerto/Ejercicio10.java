package ies.puerto;

/**
 * Escribe un programa que imprima todos los números
 * positivos en un array, usando continue para omitir los números negativos.
 * @author Nabil
 */
public class Ejercicio10 {
    public static void main (String[] args){
        int[] array = {-2, 5, -8, 10, 15, -3, 7};
        for (int i =0; i < array.length; i++){
            if (array[i] < 0){
                continue;
            }
            System.out.println(array[i]);
        }
        System.out.println();

        for (int i =0; i < array.length; i++) {
            if (array[i] > 0) {
                System.out.println(array[i]);
            }
        }
    }
}

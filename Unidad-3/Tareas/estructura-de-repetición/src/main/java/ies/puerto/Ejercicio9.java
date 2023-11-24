package ies.puerto;

/**
 * Escribe un programa que busque y cuente los números mayores que 50 en un array,
 * usando continue para omitir los números menores o iguales a 50.
 * @author Nabil
 */
public class Ejercicio9 {
    public static void main(String[] args){
        int[] array = {40, 60, 30, 80, 50, 45, 70};
        for (int i = 0; i < array.length; i++){
            if (array[i] <=50){
                continue;
            }
            System.out.println(array[i]);
        }
        System.out.println();
        for (int i = 0; i < array.length; i++){
            if (array[i] > 50) {
                System.out.println(array[i]);
            }
        }
    }


}

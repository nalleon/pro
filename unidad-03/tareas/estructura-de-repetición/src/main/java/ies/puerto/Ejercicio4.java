package ies.puerto;
import java.util.Arrays;

/**
 * Escribe un programa que encuentre el primer número
 * negativo en un array, utilizando break.
 * @author Nabil
 */
public class Ejercicio4 {
    public static void main(String[] args) {
    int [] array = {1,2,3,4,6,-7, 9, -10};
        for (int i =0; i <= array.length; i++){
            if (array[i] < 0){
                System.out.println(" " +i);
                break;
            }
        }

    }
}

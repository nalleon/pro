package ies.puerto;
/**
 * Escribe un programa que encuentre el primer número primo mayor que 100 , utilizando break.
 * @author Nabil
 */
import java.util.Arrays;

public class Ejercicio2 {

    public static void main(String[] args) {
        for (int i=100; i <=1000; i++){
            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0){
                System.out.println("The number is " + i);
                break;
            }
        }

    }
}

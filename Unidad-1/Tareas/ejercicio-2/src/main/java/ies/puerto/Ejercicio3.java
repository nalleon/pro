package ies.puerto;
import java.util.Scanner;
/**
 * Desarrolle un algoritmo que realice la sumatoria de los números enteros
 * comprendidos entre el 1 y el 10, es decir, 1 + 2 + 3 + …. + 10.
 * Utilia un buble __for__ y un bucle __while__.
 */
public class Ejercicio3 {
    public static void main(String[] args){

        int suma = 0;
        int j = 1;
        for (int i =1; i <= 10; i++) {
            suma += i;
        }
        System.out.println("Suma en bucle for:" +suma);

        while (j <= 10) {
            j++; }
        System.out.println("Suma en bulce while:" +suma);
        }
    }

package ies.puerto;
import java.util.Scanner;
/**
 * Desarrolle un algoritmo que permita leer dos números y
 * ordenarlos de menor a mayor, si es el caso.
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner lecture = new Scanner(System.in);
        int numero1;
        int numero2;
        System.out.println("Ingrese un primer numero:");
        numero1 = lecture.nextInt();


        System.out.println("Ingrese un segundo numero:");
        numero2 = lecture.nextInt();


        if (numero1 > numero2) {
            System.out.println(numero1 + " > " + numero2);
        } else if (numero1 < numero2) {
            System.out.println(numero2 + " < " + numero1);
        } else {
            System.out.println(numero1 + " = " + numero2);
        }


    }
}

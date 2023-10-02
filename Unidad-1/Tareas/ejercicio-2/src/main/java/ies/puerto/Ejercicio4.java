package ies.puerto;
import java.util.Scanner;
/**
 * Desarrolle un algoritmo que permita leer un valor cualquiera N y
 * escriba si dicho número es par o impar.
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner lecture = new Scanner (System.in);

        System.out.println("Ingrese un numero positvo y entero:");
        int n = lecture.nextInt();

        if (n % 2 == 0) {
            System.out.println(n + " es un número par."); // El residuo de la división por 2 es 0
        } else {
            System.out.println(n + " es un número impar."); // El residuo de la división por 2 no es 0
        }

    }
}
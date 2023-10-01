package ies.puerto;
import java.util.Scanner;

/**
 * Desarrolle un algoritmo que permita leer un valor cualquiera N y
 * escriba si dicho número es par o impar.
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner lecture = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = lecture.nextInt();

        if (par(numero)) {
            System.out.println(numero + " es par.");
        } else {
            System.out.println(numero + " es impar.");
        }
    }
    public static boolean par(int numero) {
        return numero % 2 == 0; // si el numero es divido entre 2 y es igual a
                                // 0 es impar. Si es dividido y no es posible
                                // que de 0 es impar.
    }
}
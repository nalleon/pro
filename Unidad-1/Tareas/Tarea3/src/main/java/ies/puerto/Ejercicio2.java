package ies.puerto;
import java.util.Scanner;
/**
 * Escribe un programa en Java que encuentre el máximo común divisor (MCD) de
 * dos números. Se debe solicitar los números por teclado.
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner lecture = new Scanner(System.in);

        System.out.println("Introduzca el valor A: ");
        int valorA = lecture.nextInt();
        System.out.println("Introduzca el valor B: ");
        int valorB = lecture.nextInt();

        System.out.println("El máximo común divisor de " + valorA + "y" + valorB + "es: ");

    }
    }
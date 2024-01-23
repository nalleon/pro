package ies.puerto;

import java.util.Scanner;

/**
 * Crea un programa que tome un número entero ingresado por el usuario, lo convierta a
 * un valor double y muestre la raíz cuadrada de ese número.
 */

public class Ejercicio65 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert an integer number: ");
        int num = scanner.nextInt();
        System.out.println("Square root is: " + doubleNumSquareRoot(num));
    }

    public static double doubleNumSquareRoot (int num){
        return Math.sqrt((double)num);
    }
}

package ies.puerto;

import java.util.Scanner;

/**
 * Crea un programa que tome un número entero y un número decimal ingresados
 * por el usuario y muestre su suma, considerando conversiones necesarias.
 */
public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert an integer number: ");
        int integerNum = scanner.nextInt();

        System.out.println("Insert a decimal number: ");
        float decimalNum = scanner.nextFloat();

        int intSum = integerNum + (int)decimalNum;
        float floatSum = (float) integerNum + decimalNum;

        System.out.println("Integer conversion sum: " +intSum+ "\nFloat conversion sum: " + floatSum);
    }
}

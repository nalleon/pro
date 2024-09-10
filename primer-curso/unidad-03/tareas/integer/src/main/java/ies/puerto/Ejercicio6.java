package ies.puerto;

import java.util.Scanner;

/**
 * Desarrolla un programa que convierta un número entero a su
 * representación binaria utilizando métodos de la clase Integer.
 * @author Nabil
 */
public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert an integer number: ");
        int number = scanner.nextInt();

        String binaryNumber = Integer.toBinaryString(number);

        System.out.println("Binary representation: " + binaryNumber);

    }
}

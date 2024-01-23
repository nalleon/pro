package ies.puerto;

import java.util.Scanner;

/**
 * Implementa un programa que calcule el factorial de un número
 * entero utilizando métodos de la clase Integer.
 * @author Nabil
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert an integer number: ");
        int number = scanner.nextInt();

        int factorial = calculateFactorial(number);

        System.out.println("Factorial is: " + factorial);
    }

    public static int calculateFactorial(int num) {
        int fact = 1;
        for (int i =1; i<= num; i++){
            fact = fact*i;
        }
        return fact;
    }
}

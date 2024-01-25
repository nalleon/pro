package ies.puerto;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Desarrolla un programa que determine si un número entero es primo o
 * no utilizando los métodos de la clase Integer.
 * @author Nabil
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Insert an integer number: ");
            int number = scanner.nextInt();

            boolean numberPrime = isPrime(number);

            System.out.println(number + " is prime: " + numberPrime);

        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException. Number is not valid, please use an integer number.");
        }
    }

    public static boolean isPrime (int number){
        if (number == 0){
            return false;
        } else if (number == 1){
            return false;
        } else if (number == 2){
            return true;
        }
        for (int i =2; i <= Math.sqrt(Math.abs(number)); i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
}

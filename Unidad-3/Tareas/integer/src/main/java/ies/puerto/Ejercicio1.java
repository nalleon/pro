package ies.puerto;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Crea un programa que tome un número entero como entrada y verifique si es par o impar utilizando los
 * métodos de la clase Integer. Controla las exception que pudiera generar.
 * @author Nabil
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Insert an integer number: ");
            int number = scanner.nextInt();

            if (Parity(number)) {
                System.out.println(number + " is even.");
            } else {
                System.out.println(number + " is odd.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Number is not valid. Please use an integer number.");
        } finally {
            scanner.close();
        }
    }
        public static boolean Parity(int number) {
            return number % 2 == 0;
    }
}

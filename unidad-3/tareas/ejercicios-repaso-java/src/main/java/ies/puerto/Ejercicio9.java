package ies.puerto;

import java.util.Scanner;

/**
 * Escribe un programa que solicite al usuario su edad y luego muestre si es mayor de edad o no.
 * @author Nabil
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert your age: ");
        int age = scanner.nextInt();

        if (age < 18){
            System.out.println("You are underage.");
        } else {
            System.out.println("You are above of age.");
        }
    }
}

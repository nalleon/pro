package ies.puerto;

import java.util.Scanner;

/**
 * Desarrolla un programa que incluya un bucle while que se ejecute infinitamente.
 * Asegúrate de proporcionar una condición de salida adecuada.
 */
public class Ejercicio80 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("You're trapped here forever");

            String exit = scanner.nextLine();
            if (exit.equalsIgnoreCase("q")){
                System.out.println("You escaped from the infinite loop.");
                break;
            }
        }
        scanner.close();
    }
}

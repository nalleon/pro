package ies.puerto;

import java.util.Scanner;

/**
 * Crea un programa que tome el radio de un círculo ingresado por el usuario y muestre su área.
 * @author Nabil
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a value for a circle's radius: ");
        float radius = scanner.nextFloat();

        float area = (float) (Math.PI*(radius*radius));
        System.out.println("Circle's area is: " +area);
    }
}


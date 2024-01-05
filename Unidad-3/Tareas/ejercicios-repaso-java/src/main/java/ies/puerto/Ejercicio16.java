package ies.puerto;

import java.util.Scanner;

/**
 * Haz un programa que utilice una constante para representar el valor de
 * PI (3.14159265) y calcule el área de un círculo
 */
public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a value for a circle's radius: ");
        float radius = scanner.nextFloat();

        final float PI = 3.14159265f;
        float area = PI*(radius*radius);
        System.out.println("Circle's area is: " +area);
    }
}

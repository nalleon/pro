package ies.puerto;

import java.util.Scanner;

/**
 * Crea un programa que declare dos variables booleanas, representando por ejemplo si está lloviendo y si es de noche,
 * y luego utilice operadores lógicos para determinar si se debe encender una lámpara.
 */
public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Is raining at the moment? (true/false)");
        boolean raining = scanner.nextBoolean();
        System.out.println("Is night at the moment? (true/false)");
        boolean night = scanner.nextBoolean();

        boolean lamp = raining || night;

        if (lamp){
            System.out.println("We should turn on the lamp.");
        } else {
            System.out.println("It's not necessary to turn on the lamp");
        }


    }
}

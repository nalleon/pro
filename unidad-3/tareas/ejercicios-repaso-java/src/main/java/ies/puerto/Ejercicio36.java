package ies.puerto;

import java.util.Scanner;

/**
 * Haz un programa que utilice una constante para representar el valor máximo permitido para la temperatura.
 * Luego, pide al usuario ingresar una temperatura y determina si está dentro del rango permitido.
 */
public class Ejercicio36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final float maxTemperature = 60f;
        final float minTemperature = -30f;

        System.out.println("Insert temperature's value: ");
        float userTemperature = scanner.nextFloat();

        if ((userTemperature<= maxTemperature) && (userTemperature>= minTemperature)){
            System.out.println("Temperature is in range.");
        } else {
            System.out.println("Temperature is out of range");
        }

    }
}

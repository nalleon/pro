package ies.puerto;

import java.util.Scanner;

/**
 * Haz un programa que utilice una constante para representar el valor máximo permitido para la temperatura.
 * Luego, pide al usuario ingresar una temperatura y determina si está dentro del rango permitido.
 */
public class Ejercicio46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert temperature's value: ");
        float userTemperature = scanner.nextFloat();
        System.out.println(temperatureRange(userTemperature));
    }

    public static String temperatureRange (float userTemperature){
        String result = "";
        final float maxTemperature = 60f;
        final float minTemperature = -30f;
        if ((userTemperature<= maxTemperature) && (userTemperature>= minTemperature)){
            result = "Temperature is in range.";
        } else {
            result = "Temperature is out of range";
        }
        return result;
    }
}

package ies.puerto;
import java.util.Scanner;

/**
 * Realice un algoritmo que a partir de proporcionarle la velocidad de un automóvil, expresada en
 * kilómetros por hora, proporcione la velocidad en metros por segundo.
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner lecture = new Scanner(System.in);


        System.out.println("Ingrese la velocidad en kilómetros por hora (km/h):");

        // double se utiliza para que la variable pueda contener numeros decimales.
        double velocidad_kmh = lecture.nextDouble();

        // 1Km/h = (1 * 1000m)/3600s
        double velocidad_ms = velocidad_kmh * 1000 / 3600;

        System.out.println("La velocidad en metros por segundo (m/s) es: " + velocidad_ms);
    }
}

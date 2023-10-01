package ies.puerto;
import java.util.Scanner;

/**
 * Desarrolla un algoritmo que convierta la velocidad de km/h a m/s.
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la velocidad en kilómetros por hora (km/h): ");
        double velocidadEnKmPorHora = scanner.nextDouble();

        double velocidadEnMetrosPorSegundo = velocidadEnKmPorHora * 0.27778;

        System.out.println("La velocidad en metros por segundo (m/s) es: " + velocidadEnMetrosPorSegundo);

        scanner.close();
    }
}

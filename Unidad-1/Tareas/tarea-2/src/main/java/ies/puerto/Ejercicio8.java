package ies.puerto;
import java.util.Scanner;
/**
 * Desarrolle un algoritmo que permita calcular
 * Promedio de Notas; finaliza cuando N = 0.
 */

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner lecture = new Scanner(System.in);

        int suma = 0;
        int contador = 0;
        int nota;

        System.out.print("Para finalizar introduzca 0. ");

        System.out.print("Ingrese una nota:");
        nota = lecture.nextInt();

        while (nota != 0) {
            suma += nota;
            contador += 1;

            System.out.print("Ingrese una nota:");
            nota = lecture.nextInt();
        }

        if (contador > 0) {
            int promedio = suma / contador;
            System.out.println("El promedio de las notas es: " + promedio);
        }
    }
}

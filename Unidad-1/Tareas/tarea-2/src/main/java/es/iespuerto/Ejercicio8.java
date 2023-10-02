package ies.puerto;
import java.util.Scanner;


/**
 * Desarrolla un algoritmo que permita calcular el promedio de notas;
 * finaliza cuando N = 0.
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner lecture = new Scanner(System.in);


        int suma = 0;
        int contador = 0; // cantidad de elementos o eventos que
        // ocurren durante la ejecución del programa.


        System.out.print("Para finalizar introduzca 0. ");
        while (true) {
            System.out.print("Ingrese una nota:");
            int nota = lecture.nextInt();


            if (nota == 0) {
                break; // Salir del bucle si se ingresa 0
            }


            suma += nota;
            contador++;
        }


        if (contador > 0) {
            double promedio = (double) suma / contador;
            System.out.println("El promedio de las notas es: " + promedio);
        } else {
            System.out.println("No se ingresaron notas.");
        }
    }
}

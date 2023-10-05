package ies.puerto;
import java.util.Scanner;
/**
 * EEncontrar y mostrar todos los números perfectos en un rango
 * dado utilizando un bucle for. Solicita el límite por teclado.
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner lecture = new Scanner(System.in);

        int inicio = 1;

        System.out.print("Introduzca el valor de fin para el rango: ");
        int fin = lecture.nextInt();

        System.out.println("Números perfectos en rango de " + inicio + " a " + fin + ":");

        for (int numero = inicio; numero <= fin; numero++) {
            int suma = 0;
            for (int divisor = 1; divisor < numero; divisor++) {
                if (numero % divisor == 0) {
                    suma += divisor;
                }
            }
            if (suma == numero) {
                System.out.println(numero);
            }
        }
    }
}
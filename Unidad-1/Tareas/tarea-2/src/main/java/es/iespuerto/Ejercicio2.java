package ies.puerto;
import java.sql.SQLOutput;
import java.util.Scanner;
/**
 * Desarrolle un algoritmo que permita leer tres valores y almacenarlos en las variables A, B y C respectivamente.
 * El algoritmo debe imprimir cual es el mayor y cual es el menor. Recuerde constatar que los tres valores
 * introducidos por el teclado sean valores distintos. Presente un mensaje de alerta en caso de que se
 * detecte la introducción de valores iguales.
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner lecture = new Scanner(System.in);


        int valorA;
        int valorB;
        int valorC;


        do {
            System.out.println("Ingrese el valor de A");
            valorA = lecture.nextInt();
            System.out.println("El valor de A es:" + valorA);


            System.out.println("Ingrese el valor de B");
            valorB = lecture.nextInt();
            System.out.println("El valor de B es:" + valorB);


            System.out.println("Ingrese el valor de C");
            valorC = lecture.nextInt();
            System.out.println("El valor de A es:" + valorC);


            if ((valorA == valorB) || (valorA == valorC) || (valorB == valorC)) {
                System.out.println("Dos o mas valores son iguales.");
            }
        } while ((valorA == valorB) || (valorA == valorC) || (valorB == valorC));
        if ((valorA > valorB) && (valorA > valorC)) {
            System.out.println("El valor A es el mayor.");
            if (valorC < valorB) {
                System.out.println("El valor C es el menor.");
            }
        } else if ((valorB > valorA) && (valorB > valorC)) {
            System.out.println("El valor B es el mayor.");
            if (valorC < valorA) {
                System.out.println("El valor C es el menor.");
            } else {
                System.out.println("El valor A es el menor.");


            }
        } else {
            System.out.println("El valor C es el mayor.");
            if (valorA > valorB) {
                System.out.println("El valor de A es el menor.");
            } else {
                System.out.println("El valor de B es el menor.");
            }
        }
    }
}

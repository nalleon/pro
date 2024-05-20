package ies.puerto;
/**
 * Escribe un programa que compare dos cadenas de texto e indique
 * si son iguales o diferentes.
 * @author Nabil
 */
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca su nombre: ");
        String name = scanner.next();

        System.out.println("¡Hola " + name + "!");
    }
}
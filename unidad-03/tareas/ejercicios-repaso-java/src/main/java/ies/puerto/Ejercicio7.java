package ies.puerto;

import java.util.Scanner;

/**
 * Desarrolla un programa que solicite al usuario una cantidad en euros y
 * muestre su equivalente en dólares solicitando el valor cambio.
 * @author Nabil
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a quantity of euros to convert: ");
        float euros = scanner.nextFloat();
        float conversionUSD = euros*1.1052298f;

        System.out.println(euros + "€ are: " + conversionUSD +"$");
    }
}

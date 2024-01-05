package ies.puerto;

import java.util.Scanner;

/**
 * Desarrolla un programa que tome el precio de un producto
 * ingresado por el usuario y muestre el precio final con el 7% de IGIC incluido .
 * @author Nabil
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a price for a product: ");
        float price = scanner.nextFloat();
        float productIGIC = price * 0.07f;
        float totalPrice = price+productIGIC;
        System.out.println("Final price: " + totalPrice);
    }
}

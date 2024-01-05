package ies.puerto;

import java.util.Scanner;

/**
 * Escribe un programa que solicite al usuario
 * ingresar cinco números y calcule el producto de esos números utilizando un bucle for.
 */
public class Ejercicio72 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] num = new float[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Insert num #" + (i + 1) + ": ");
            num[i] = scanner.nextFloat();
        }
        System.out.println("Product is: " + productX5(num));
    }

    public static float productX5 (float [] num){
        float product = 1.0f;
        for (int i=0; i < num.length; i++){
            product = product * num[i];
        }
        return product;
    }
}

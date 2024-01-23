package ies.puerto;

import java.util.Scanner;

/**
 * Crea un programa que utilice un bucle for para imprimir un triángulo de asteriscos,
 * donde la base del triángulo es ingresada por el usuario.
 */
public class Ejercicio74 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Triangle's base size: ");
        int size = scanner.nextInt();
            if (size % 2 == 0){
                size += 1;
            }
        printTriangle(createTriangle(size));
    }

    public static String [][] createTriangle (int rows){
        String[][] triangle = new String[rows + 1][rows*2 - 1];
        int rightLimit = rows * 2 - 1;
        int leftLimit = 0;
        for (int i = rows; i > 0; i--) {
            for (int j = leftLimit; j < rightLimit; j++) {
                triangle[i][j] = "*";
            }
            rightLimit--;
            leftLimit++;
        }
        return triangle;
    }
    public static void printTriangle(String[][] triangle) {
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                if (triangle[i][j] == null)
                    triangle[i][j] = " ";
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}


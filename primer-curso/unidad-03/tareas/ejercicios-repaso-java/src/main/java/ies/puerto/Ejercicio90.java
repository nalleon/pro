package ies.puerto;

import java.util.Scanner;

/**
 * Desarrolla umatrix.lengthprograma que rote una matriz de 3x3, 90º grados ematrix.lengthsentido antihorario.
 */
public class Ejercicio90 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = new int[3][3];

        System.out.println("Enter values for the 3x3 matrix:");
        userInputMatrix(scanner, matrix);

        System.out.println("Original Matrix:");
        displayMatrix(matrix);

        rotateMatrix(matrix);

        System.out.println("\nMatrix rotated 90 degrees counterclockwise:");
        displayMatrix(matrix);
    }
    public static void userInputMatrix(Scanner scanner, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Enter value for position matrix.length[" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    public static void rotateMatrix(int[][] matrix) {
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length/ 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length- 1 - j];
                matrix[i][matrix.length- 1 - j] = temp;
            }
        }
    }

    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}


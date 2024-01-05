package ies.puerto;

import java.util.Scanner;

/**
 * Crea un programa que tome una matriz de 3x3 y calcule su transpuesta.
 */
public class Ejercicio87 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = new int[3][3];

        System.out.println("Enter values for the 3x3 matrix:");
        userInputMatrix(scanner, matrix);

        System.out.println("Original Matrix:");
        displayMatrix(matrix);

        int[][] transpose = calculateTranspose(matrix);

        System.out.println("Transposed Matrix:");
        displayMatrix(transpose);

        scanner.close();
    }

    public static int [][] userInputMatrix(Scanner scanner, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Enter value for position [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    public static int[][] calculateTranspose(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] transpose = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
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



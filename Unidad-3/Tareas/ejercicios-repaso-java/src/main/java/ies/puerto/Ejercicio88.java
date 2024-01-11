package ies.puerto;

import java.util.Scanner;

/**
 * Escribe un programa que multiplique dos matrices de dimensiones 2x3 y 3x2, y muestre el resultado.
 */
public class Ejercicio88 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix1 = new int[2][3];
        int[][] matrix2 = new int[3][2];

        System.out.println("Enter values for the first matrix (2x3):");
        userInputMatrix(scanner, matrix1);

        System.out.println("Enter values for the second matrix (3x2):");
        userInputMatrix(scanner, matrix2);

        int[][] result = multiplyMatrices(matrix1, matrix2);

        System.out.println("Result of matrix multiplication:");
        displayMatrix(result);

    }

    public static void userInputMatrix(Scanner scanner, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Enter value for position [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int columns1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int columns2 = matrix2[0].length;

        if (columns1 != rows2) {
            throw new IllegalArgumentException("Matrices cannot be multiplied: Invalid dimensions");
        }

        int[][] result = new int[rows1][columns2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {
                for (int k = 0; k < columns1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
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

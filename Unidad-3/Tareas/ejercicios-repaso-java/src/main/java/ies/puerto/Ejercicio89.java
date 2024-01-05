package ies.puerto;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Haz un programa que busque el número máximo en una matriz de 4x4 y muestre su posición.
 */
public class Ejercicio89 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[4][4];
        System.out.println("Enter values for the first matrix (2x3):");
        userInputMatrix(scanner, matrix);
        int[] result = findMaxValue(matrix);
        System.out.println("Max value position: " + Arrays.toString(result));
    }
    public static void userInputMatrix(Scanner scanner, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Enter value for position [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }
    public static int[] findMaxValue(int[][] matrix) {
        int [] maxValuePos = {0,0};
        int maxValue = matrix[0][0];

        for (int i =0; i < matrix.length; i++){
            for (int j =0; j < matrix[i].length; j++){
                if (matrix[i][j] > maxValue){
                    maxValue = matrix[i][j];
                    maxValuePos[0] = i;
                    maxValuePos[1] = j;
                }
            }
        }
        return maxValuePos;
    }
}

package ies.puerto;

import java.util.Arrays;

/**
 * @author Nabil
 */
public class Ejercicio4 {
    /**
     * function evalue if the matrix is 5x5
     * @param matrix to evalue
     * @return if matrix is 5x5 return matrix, else null
     */
    public int [][] showMatrix5x5(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        if (rows == 5 && columns == 5) {
            return matrix;
        }
        return null;
    }

    /**
     * function that sum a matrix rows
     * @param matrix to operate with
     * @return the sum
     */
    public int [] sumRowMatrix(int[][] matrix) {
        int [] sum = new int [matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j =0; j < matrix[i].length; j++){
                sum[i] += matrix[i][j];
            }
        }
        return sum;
    }

    /**
     * function that sum a matrix columns
     * @param matrix to operate with
     * @return the sum
     */
    public int[] sumColumnsMatrix(int[][] matrix) {
        int [] sum = new int [matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j =0; j < matrix[i].length; j++){
                sum[j] += matrix[i][j];
            }
        }
        return sum;
    }
}

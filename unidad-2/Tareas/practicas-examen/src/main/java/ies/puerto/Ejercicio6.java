package ies.puerto;

public class Ejercicio6 {

    public int [] [] transposeMatrix ( int [][] matrix){
        int rows = matrix.length;
        int columns = matrix[0].length;
        int [] [] transposeMatrix = new int[rows][columns];

        for (int i =0; i < rows; i++){
            for (int j=0; j < columns; j++){
                transposeMatrix[j][i] = matrix[i][j];
            }
        }
        return transposeMatrix;
    }

}

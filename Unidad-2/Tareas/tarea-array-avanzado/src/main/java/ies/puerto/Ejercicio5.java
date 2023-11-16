package ies.puerto;

public class Ejercicio5 {

    public int[][] showDiagonal() {
        int [] [] matrix = new int [5][5];
        int rows = matrix.length;
        int columns = matrix[0].length;

       for (int i=0; i< rows; i++){
           for (int j=0; j < columns; j++){
               if (i == j){
                   matrix [i][j] =1;
               }
           }
       }
        return matrix;
    }
}

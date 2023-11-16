package ies.puerto;
/**
 * @author Nabil
 */
public class Ejercicio5 {
    /**
     * function that shows a 5x5 diagonal matrix
     * @return diagonal matrix
     */
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

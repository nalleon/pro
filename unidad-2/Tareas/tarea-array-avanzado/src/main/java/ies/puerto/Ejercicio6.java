package ies.puerto;
/**
 * @author Nabil
 */
public class Ejercicio6 {
    /**
     * function that shows a frame made of 0 and 1
     * @return the matrix that compose the frame
     */
    public int [][]frame (){
        int [] [] matrix = new int [5][15];
        for(int i =0; i < matrix.length; i++) {
            for (int j=0; j < matrix[i].length; j++){
                if (i == 0 || i == matrix.length - 1){
                    matrix [i][j] =1;
                } else if (j == 0 || j == matrix[i].length - 1) {
                    matrix [i][j] =1;
                }
            }
    }
        return matrix;
    }
}



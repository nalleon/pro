package ies.puerto;

public class Ejercicio5 {

    public int [][] diagonal (){
        int [][] matrix = new int [5][5];

        for (int i=0; i < matrix.length; i++){
            for (int j=0; j< matrix[i].length; j++) {
                if (i ==  j) {
                    matrix[i][j] = 1;
                }
            }
        }
        return matrix;
    }
}


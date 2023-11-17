package ies.puerto;

public class Ejercicio6 {
    public int [][] frame (){
        int [][] matrix = new int [5][15];

        for (int i=0; i < matrix.length; i++){
            for (int j=0; j< matrix[i].length; j++){
                if (i ==0 || i == matrix.length-1){
                    matrix [i][j] = 1;
                } else if (j ==0|| j == matrix[i].length-1){
                    matrix [i][j] =1;
                }
            }

        }
        return matrix;
    }
}


package es.ies.puerto;

public class WalkThroughAMatrix {

    public String walkThroughAMatrixTrad(int [][] matrix){
        StringBuilder result = new StringBuilder();
        for (int i =0; i < matrix.length; i++){
            for (int j=0; j < matrix[i].length; j++){
                int currentElement = matrix[i][j];
                result.append(currentElement);
                result.append(" ");
            }
        }
        return result.toString();
    }
}

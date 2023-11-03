package ies.puerto;

/**
 * Dada una matriz cuadrada, encuentra su transpuesta.
 * @author Nabil
 */

public class Ejercicio6 {
    /**
     * Funcion que calcula la matriz traspuesta de una dada
     * @param matriz para el calculo de la traspuesta
     * @return su traspuesta
     */
    public int [][] matrizTraspuesta (int [][] matriz){
    int filas = matriz.length;
    int columnas = matriz[0].length;
    int [][] traspuesta = new int [filas][columnas];
    for (int i = 0; i < filas; i++) {
     for (int j = 0; j < columnas; j++) {
       traspuesta[i][j] = matriz[j][i];
    }
}
    return traspuesta;
}

    /**
     * Funcion que muestra la matriz en consola
     * @param matriz que se mostrara
     * @return su traspuesta
     */
    public int [][] mostrarTraspuesta (int [][]matriz) {
    int [][] matrizTraspuesta = matrizTraspuesta(matriz);
    for (int i=0; i< matrizTraspuesta.length; i++) {
        for (int j=0; j< matrizTraspuesta[i].length; j++){
            System.out.println(matrizTraspuesta[i][j]+ " ");
        }
    }
    System.out.println();
    return matrizTraspuesta;
}
}

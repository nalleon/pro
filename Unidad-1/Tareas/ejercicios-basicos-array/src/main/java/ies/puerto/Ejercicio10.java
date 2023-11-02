package ies.puerto;
/**
 * Comprueba si una matriz es diagonal (todos los elementos fuera de
 * la diagonal principal son cero).
 * @author  Nabil
 */
public class Ejercicio10 {
    /**
     * Funcion que comprueba si una matriz es cuadrada o no
     * @param matriz a evaluar
     * @return true si es cuadrada, false si no lo es
     */
    public boolean matrizCuadrada  (int [] [] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        if (filas != columnas){
            return false;
        }
        return true;
    }

    /**
     * Funcion que comprueba si una matriz es diagonal o no
     * @param matriz a evaluar
     * @return true si la matriz es diagonal, false si no lo es
     */
    public boolean matrizDiagonal (int [] [] matriz){
        int filas = matriz.length;
        int columnas = matriz[0].length;

        for (int i=0; i < filas; i++) {
            for (int j=0; j< columnas; j++) {
                if (i!= j && matriz[i][j] != 0){
                    return false;
                }
            }
        }
      return true;
    }

}

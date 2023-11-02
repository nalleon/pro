package ies.puerto;

/**
 * Encuentra el valor máximo y mínimo en un array de entero
 * @author Nabil
 */
public class Ejercicio3 {
    /**
     * Funcion que calcula que numero es el mayor
     * @param numeros a evaluar
     * @return el numero mayor
     */
 public int calcularMayor (int [] numeros){
     int maximo = numeros [0];
      for (int i = 1; i < numeros.length; i++){
          if (numeros[i] > maximo) {
          maximo = numeros[i];
          }
      }
     return maximo;
 }
    /**
     * Funcion que calcula que numero es el menor
     * @param numeros array a evaluar
     * @return el numero menor
     */
    public int calcularMenor(int [] numeros ){
        int minimo = numeros [0];
        for (int i = 1; i < numeros.length; i++){
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }
        return minimo;
    }
}

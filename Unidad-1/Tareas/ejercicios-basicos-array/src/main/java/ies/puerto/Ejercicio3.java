package ies.puerto;

/**
 * Encuentra el valor máximo y mínimo en un array de entero
 * @author Nabil
 */
public class Ejercicio3 {
    /**
     * Funcion que calcula que numero es el mayor
     * @param valorA para el calculo
     * @param valorB para el calculo
     * @param valorC para el calculo
     * @return el maximo
     */
 public int calcularMayor (int valorA, int valorB, int valorC){
     int [] numeros = {valorA, valorB, valorC};
     int maximo = numeros [0];
      for (int i = 0; i < numeros.length; i++){
          if (numeros[i] > maximo) {
          maximo = numeros[i];
          }
      }
     return maximo;
 }
    /**
     * Funcion que calcula que numero es el menor
     * @param valorA para el calculo
     * @param valorB para el calculo
     * @param valorC para el calculo
     * @return el minimo
     */
    public int calcularMenor(int valorA, int valorB, int valorC){
        int [] numeros = {valorA, valorB, valorC};
        int minimo = numeros [3];
        for (int i = 0; i > numeros.length; i--){
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }
        return minimo;
    }
}

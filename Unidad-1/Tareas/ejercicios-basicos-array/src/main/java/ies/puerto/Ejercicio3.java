package ies.puerto;

/**
 * Encuentra el valor máximo y mínimo en un array de entero
 * @author Nabil
 */
public class Ejercicio3 {
    /**
     * Funcion que calcula que numero es el mayor
     * @param valorA primer valor
     * @param valorB segundo valor
     * @param valorC tercer valor
     * @return el numero mayor
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
     * @param valorA el primer valor
     * @param valorB el segundo valor
     * @param valorC el tercer valor
     * @return el numero menor
     */
    public int calcularMenor(int valorA, int valorB, int valorC){
        int [] numeros = {valorA, valorB, valorC};
        int minimo = numeros [0];
        for (int i = 1; i < numeros.length; i++){
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }
        return minimo;
    }
}

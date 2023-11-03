package ies.puerto;

import java.util.Arrays;

/**
 * Elimina elementos duplicados de un array, y muestra finalmente los valores iniciales
 * del array y el resultado final.
 * @author  Nabil
 */
public class Ejercicio8 {
     /**
      * Funcion que elimina los numeros duplicados de un array
      * @param numeros para el calculo
      * @param numerosCopia para el calculo
      * @return
      */
     public int eliminarDuplicados (int [] numeros, int [] numerosCopia){
     numerosCopia=numeros;
     Arrays.sort(numerosCopia);
     int [] resultado = new int[numerosCopia.length];
     for (int i = 0; i < numerosCopia.length; i++) {
         for (int j=i+1; j < numerosCopia.length; j++) {
             if (numerosCopia[i] != numerosCopia[j]) {
                 resultado[i] = numerosCopia[j];
             }
         }
          return resultado [i];
     }


      return 0;
     }

     /**
      * Funcion que muestra el array sin duplicados y el original por consola
      * @param numeros a mostrar
      * @return array sin suplicados y original
      */
     public boolean mostrarArrays (int [] numeros, int valor) {
             for (int i = 0; i < numeros.length; i++) {
                 if (numeros[i] == valor) {
                     return true;
                 }
             }
             return false;
         }
     }


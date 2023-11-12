package ies.puerto;
/**
 * @author Nabil
 */
public class Ejercicio1 {

    public int arraySumatory (int [] array){
       int sumatory = 0;
       int lenght = array.length;

       for (int i =0; i < lenght; i++) {
           sumatory += array[i];
       }
        return sumatory;
    }
}

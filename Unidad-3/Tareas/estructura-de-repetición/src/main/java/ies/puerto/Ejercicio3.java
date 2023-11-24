package ies.puerto;
/**
 * Escribe un programa que busque el número 7 en un array, utilizando break.
 * @author Nabil
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        int [] array = {1,2,2,3,4,5,6,7,8,9,10};
        int findNumber = 7;

        for (int i =0; i <= array.length; i++){
            if (array[i] == findNumber){
                System.out.println("Number found " + i);
                break;
            }
        }
    }
}

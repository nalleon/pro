package ies.puerto.ejercicicios.ejercicio.uno;

import java.util.ArrayList;
import java.util.List;

/**
 * Crea un programa que declare e inicialice un ArrayList de
 * enteros. Luego, agrega números pares del 1 al 10 a la lista.
 */
public class Ejercicio1 {

    static List<Integer> evenNumList;
    static List<Integer> notEvenNumList;

    public static void main(String[] args) {
        evenNumList = new ArrayList<>();
        notEvenNumList = new ArrayList<>();
        for (int i=1; i <= 10; i++){
            if (numParity(i)){
                evenNumList.add(i);
            } else {
                notEvenNumList.add(i);
            }
        }
        System.out.println("Even number: " + evenNumList);
        System.out.println("Size: " + evenNumList.size());
        System.out.println("Not even number: " + notEvenNumList);
        System.out.println("Size: " + notEvenNumList.size());
    }

    /**
     * Method that verifies if a num is even
     * @param i num to evalue
     * @return true if it's even, false if not
     */
    public static boolean numParity(int i){
        return i % 2 == 0;
    }
}

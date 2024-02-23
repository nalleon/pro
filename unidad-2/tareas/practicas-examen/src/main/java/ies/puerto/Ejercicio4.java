package ies.puerto;

import java.util.Arrays;

/**
 * @author Nabil
 */
public class Ejercicio4 {
    public int parity (int [] array) {
        int[] arrayCopy = array;
        int lenght = arrayCopy.length;
        int numberCounter = 0;

        for (int i = 0; i < lenght; i++) {
            if (arrayCopy[i] % 2 == 0) {
                numberCounter++;
            }
        }
        return numberCounter;
    }
}

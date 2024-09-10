package ies.puerto;
/**
 * @author Nabil
 */
public class Ejercicio3 {

    public int findMaximumValue (int [] array) {
        int [] arrayCopy = array;
        int maximum = arrayCopy[0];
        int lenght = arrayCopy.length;
        for (int i=0; i < lenght; i++){
            if (arrayCopy[i] > maximum) {
                maximum = arrayCopy [i];
            }
        }
        return maximum;
    }
    public int findMinimumValue (int [] array) {
        int [] arrayCopy = array;
        int minimum = arrayCopy[0];
        int lenght = arrayCopy.length;
        for (int i=0; i < lenght; i++){
            if (arrayCopy[i] < minimum) {
                minimum = arrayCopy [i];
            }
        }
        return minimum;
    }
}

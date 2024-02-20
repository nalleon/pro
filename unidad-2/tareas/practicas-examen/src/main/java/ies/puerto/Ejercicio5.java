package ies.puerto;

public class Ejercicio5 {

    public int findValue (int [] array, int value){
        int [] arrayCopy = array;
        int valueCopy = value;
        int length = arrayCopy.length;

        for (int i=0; i < length; i++){
            if (arrayCopy[i] == valueCopy) {
                return valueCopy;
            }
        }
        return -1;
    }
}

package ies.puerto;
/**
 * @author Nabil
 */
import java.util.Arrays;

public class Ejercicio2 {


    public float averageScore (float [] array) {
        float sumatory = 0;
        float lenght = array.length;

        for (int i=0; i < lenght; i++){
            sumatory += array [i];
        }
        float averageScore =  sumatory / lenght;

        return averageScore;
    }
}

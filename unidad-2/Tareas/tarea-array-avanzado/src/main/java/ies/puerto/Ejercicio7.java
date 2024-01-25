package ies.puerto;
import java.util.Arrays;

/**
 * @author Nabil
 */
public class Ejercicio7 {
    /**
     * functions that shows a list of drivers and the total of km they do in a week
     * @param names of the drivers
     * @param kms drove by the drivers
     * @return total ok km per driver
     */
    public String [][] kmPerDriver (String [] names, int [][] kms){
       String [][] totalKMS= new String[][];
        for (int i=0; i < names.length; i++){
            int kmsCounter=0;
            for (int j=0; j < kms.length; j++){
                kmsCounter += kms [i][j];
            }
            totalKMS[i] = new String[]{names[i], Integer.toString(kmsCounter)};
        }
        return totalKMS;
    }
}

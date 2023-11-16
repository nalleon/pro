package ies.puerto;
/**
 * @author Nabil
 */
public class Ejercicio7 {
    /**
     * functions that shows a list of drivers are the total of km they do in a week
     * @param names of the drivers
     * @param kms drove by the drivers
     * @return total ok km per driver
     */
    public String kmPerDriver (String [] names, int [][] kms){
       String totalKMS= "";
        for (int i=0; i < names.length; i++){
            int kmsCounter=0;
            for (int j=0; j < kms[i].length; j++){
                kmsCounter += kms [j][i];
            }
            totalKMS = names[i]+":" + kms +"\n";
        }
        return totalKMS;
    }
}

package ies.puerto;

public class Ejercicio7 {

    public String kmPerDriver (String [] names, int [][] kms){
        kms = new int[names.length][7];
       String totalKMS= "";

        for (int i=0; i < names.length; i++){
            int kmsCounter=0;
            for (int j=0; j < kms[i].length; j++){
                kmsCounter += kms [i][j];
            }
            totalKMS = names[i]+": " + kmsCounter;
        }
        return totalKMS;
    }
}

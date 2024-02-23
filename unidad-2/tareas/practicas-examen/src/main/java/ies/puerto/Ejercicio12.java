package ies.puerto;

public class Ejercicio12 {


    public int evenNumbersSumatory (int end){
       int start = 0;
       int sumatory =0;

       for (start=1; start < end; start++){
           if (start % 2 == 0){
               sumatory += start;
           }
        }
        return sumatory;
       }
    }


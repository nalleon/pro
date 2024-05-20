package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio3 {

    public List<Integer> printParity(int numLimit){
        List<Integer> result = new ArrayList<>();

        if (numLimit % 2 == 0){
            result.add(numLimit);
        }

        if (numLimit == 0){
            return result;
        }

        result.addAll(printParity(numLimit-1));
        return result;
    }

    /**
     *
    public void printParityTrad(int numLimit){
        for (int i=1; i <= numLimit; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
     *
     */
}

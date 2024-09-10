package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio7 {
    public List<Integer> regressiveCountRecursive(int num){
        List<Integer> list = new ArrayList<>();

        if (num >= 0){
            list.add(num);
            list.addAll(regressiveCountRecursive(num-1));
        }
        return list;

    }
}

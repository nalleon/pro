package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio9 {
    public List<Integer> numSeriesTrad (int limit){
        List<Integer> list = new ArrayList<>();
        for (int i=1; i <= limit; i++){
            list.add(i);
        }
        return list;
    }

    public List<Integer> numSeriesRecursive (int limit){
        List<Integer> list = new ArrayList<>();
        if (limit <= 0){
            return list;
        }
        list = numSeriesRecursive(limit-1);
        list.add(limit);
        return  list;
    }




}

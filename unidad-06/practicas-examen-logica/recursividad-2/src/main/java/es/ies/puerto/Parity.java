package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;

public class Parity {
    public static void main(String[] args) {
        System.out.println(traditionalMethod(10));
        List<Integer> result = new ArrayList<>();
        System.out.println(recursiveMethod(10, result));
    }

    public static List<Integer> traditionalMethod(int limit){
        List<Integer> result = new ArrayList<>();

        for (int i=limit; i > 0; i--){
            if (i % 2 == 0){
                result.add(i);
            }
        }

        return result;
    }


    public static List<Integer> recursiveMethod(int limit,  List<Integer> result){
        if (limit <= 1){
            return result;
        }

        if (limit % 2 == 0){
            result.add(limit);
        }

        return recursiveMethod(--limit, result);
    }
}

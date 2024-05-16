package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;

public class NoParity {

    public static void main(String[] args) {
        List<Integer> result = new ArrayList<>();
        System.out.println(traditional(50));
        System.out.println(recursive(50, result));
    }

    public static List<Integer> traditional(int limit){
        List<Integer> result = new ArrayList<>();

        for (int i=limit; i >=1; --i){
            if (!(i % 2 == 0)){
                result.add(i);
            }
        }

        return result;
    }


    public static List<Integer> recursive(int limit, List<Integer> result){
        if (limit <= 1){
            result.add(limit);
            return result;
        }

        if (!(limit % 2 == 0)){
            result.add(limit);
        }

        return recursive(--limit, result);
    }
}

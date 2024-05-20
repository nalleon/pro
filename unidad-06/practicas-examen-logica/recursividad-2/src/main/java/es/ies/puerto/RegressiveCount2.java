package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;

public class RegressiveCount2 {

    public static void main(String[] args) {
        List<String> result = new ArrayList<>();
        System.out.println(traditional(5));
        System.out.println(recursive(5,result));
    }

    public static List<String> traditional (int limit){
        List<String> result = new ArrayList<>();
        for (int i=limit; i >=1; --i){
            String message = i + "...";
            if (i == 1){
                message = i + "!";
            }
            result.add(message);
        }
        return result;
    }

    public static List<String> recursive (int limit, List<String> result){
        result.add(limit + "...");
        if (limit == 1){
            return result;
        }

        return recursive(--limit, result);
    }
}

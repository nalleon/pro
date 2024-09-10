package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;

public class RegressiveCount {
    public static void main(String[] args) {
        System.out.println(traditionalMethod(20));
        List<Integer> result = new ArrayList<>();
        System.out.println(recursiveMethod(10, result));
    }
    public static List<Integer> traditionalMethod(int startNum){
        List<Integer> result = new ArrayList<>();

        for (int i =startNum; i >0; i--){
            result.add(i);
        }

       return result;
    }

    public static List<Integer> recursiveMethod(int startNum, List<Integer> result){
        result.add(startNum);

        if (startNum > 1){
            recursiveMethod(--startNum, result);
        }

        return result;
    }
}

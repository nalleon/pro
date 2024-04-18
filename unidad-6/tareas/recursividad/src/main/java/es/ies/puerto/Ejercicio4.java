package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {
    public List<Integer> fibonacciTrad(int num) {
        List<Integer> fibonacci = new ArrayList<>();
        int resultInt = 0;
        int previous = 0;
        int current = 1;
        for (int i = 0; i < num-1; i++) {
            resultInt = previous + current;
            previous = current;
            current = resultInt;
            fibonacci.add(resultInt);
        }
        return fibonacci;
    }

    public int fibonacciRecursive(int num) {
        if (num <= 1){
            return num;
        }

        return  fibonacciRecursive(num-1) + fibonacciRecursive(num-2);
    }
}

package es.ies.puerto;

public class Fibonacci {

    public int fibonacciTrad(int position){
        int result = 0;
        for (int i=1; i<=position; i++){
            int current = i;
            int previous = i-1;
            result = current+previous;
        }
        return result;
    }

    public int fibonacciRecursive(int position){
        if (position == 0){
            return 0;
        }

        if (position==1){
            return 1;
        }
        return fibonacciTrad(position-1)+fibonacciTrad(position-2);
    }
}

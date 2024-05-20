package es.ies.puerto;

public class Factorial {

    public int factorialTrad(int num){
        int factorial = 1;
        for (int i = num; i >= 1; i--){
            factorial *=i;
        }
        return factorial;
    }

    public int factorialRecursive(int num){
        if (num <= 1){
            return 1;
        }
        return  num * factorialRecursive(num-1);
    }
}

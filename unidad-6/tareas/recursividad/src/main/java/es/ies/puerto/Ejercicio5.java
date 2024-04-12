package es.ies.puerto;

public class Ejercicio5 {
    public int factorialTrad(int num){
        int result = 1;
       for (int i=num; i>=1; i--){
           result *= i;
       }

        return result;
    }

    public int factorial(int num){
        if (num == 0){
            return 1;
        }
        return num * factorial(num-1);
    }
}

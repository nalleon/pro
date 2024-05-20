package es.ies.puerto;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(traditionalMethod(10));
        System.out.println(recursiveMethod(10));
    }


    public static int traditionalMethod (int limit){
        int result = 0;
        int previous = 0;
        int current = 1;
        for (int i=2; i <=limit; i++){
            result = previous + current;
            previous = current;
            current = result;
        }
        return result;
    }

    public static int recursiveMethod(int limit){
        if (limit <= 1){
            return limit;
        }

        return recursiveMethod(limit-2)+recursiveMethod(limit-1);
    }
}

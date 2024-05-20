package es.ies.puerto;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(traditional(5));
        System.out.println(recursive(5));
    }

    public static int traditional (int limit){
        int result=1;

        for (int i =limit; i >= 1; i--){
            result *= i;
        }

        return result;
    }


    public static int recursive(int limit){
        if (limit <= 1){
            return limit;
        }

        return limit*recursive(--limit);
    }
}

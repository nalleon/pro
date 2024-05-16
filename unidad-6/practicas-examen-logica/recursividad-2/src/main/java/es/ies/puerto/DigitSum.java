package es.ies.puerto;

public class DigitSum {
    public static void main(String[] args) {
        System.out.println(traditionalMethod(10));
        System.out.println(recursiveMethod(10));
    }
    public static int traditionalMethod(int limit){
        int result = limit;

        for (int i=limit-1; i > 0; i--){
            result +=i;
        }

        return result;
    }

    public static int recursiveMethod(int limit){
        int result = limit;

        if (limit == 1){
            return result;
        }

        result += recursiveMethod(--limit);
        return result;
    }
}

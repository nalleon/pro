package es.ies.puerto;

public class Potency {
    public static void main(String[] args) {
        System.out.println(traditional(5,3));
        System.out.println(recursive(5,3));
    }
    public static int traditional(int num, int expo){
        int result = 1;
        for (int i=expo; i >= 1; i--){
            result *= num;
        }

        return result;
    }

    public static int recursive(int num, int expo){
        if (expo == 0){
            return 1;
        }

        if (expo == 1){
            return num;
        }

        return num*recursive(num, --expo);
    }
}

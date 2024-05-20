package es.ies.puerto;

public class Potency {

    public int potencyTrad(int num, int expo){
        int result =1;
        for (int i=1; i <= expo; i++){
            result *= num;
        }

        return result;
    }

    public int potencyRecursive(int num, int expo){
        if (expo == 0){
            return 1;
        }

        if (expo == 1){
            return num;
        }

        return num * potencyRecursive(num, expo-1);
    }
}

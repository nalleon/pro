package es.ies.puerto;

public class Ejercicio6 {
    public int potencyTrad (int num, int expo){
        if (expo == 0){
            return 1;
        }

        int result = num;
        for (int i=1; i< expo; i++){
            result *= num;
        }
        return result;
    }

    public int potency (int num, int expo){
        if (expo == 0){
            return 1;
        }

        if (expo == 1){
            return num;
        }

        return num * potency(num, expo-1);
    }

}

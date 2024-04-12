package es.ies.puerto;

public class Ejercicio6 {
    public int potencyTrad (int num, int expo){
        int result = 1;
        for (int i=0; i< expo; i++){
            result *= num;
        }
        return result;
    }

    public int potency (int num, int expo){
        if (expo == 0){
            return 1;
        }
        return num * potency(num, expo-1);
    }

}

package es.ies.puerto.modelo.impl;

public class NaturalSum {
    public int naturalSumTrad(int num){
        int result = 0;
        for (int i = 1; i <= num; i++){
            result += i;
        }
        return result;
    }

    public int naturalSumRecursive(int num){
        if (num == 0){
            return 0;
        }
        return num +naturalSumRecursive(num-1);
    }
}

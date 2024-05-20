package es.ies.puerto.modelo.impl;

public class RegressiveCount {
    public String regressiveCountTrad(int num){
        String result = "";
        for (int i=1; i <= num; i++){
            result =  " " + i;
        }
        return result;
    }

    public String regressiveCountRecursive(int num){
        if (num  ==  1)
            return "" + num;

        return num + " " + regressiveCountRecursive(--num);
    }
}

package es.ies.puerto;

import java.util.Collections;
import java.util.List;

public class MaxNumArray {

    public int maxNumArrayTrad(List<Integer> list){
        int maxNum =0;
        for (int i=1; i <= list.size(); i++){
            int current = i;
            int previous = i-1;
            maxNum = current;

            if (previous > current){
                maxNum = previous;
            }
        }
        return maxNum;
    }

    public int maxNumArrayRecursive(List<Integer> list){
        if (list.isEmpty()){
            return -1;
        }

        if (list.size() == 1){
            return list.get(0);
        }

        int firstNum =list.get(0);
        int maxNumRest = maxNumArrayRecursive(list.subList(1, list.size()));

        return Math.max(firstNum, maxNumRest);
    }
}

package es.ies.puerto;

import java.util.List;

public class SearchElementArray {


    public int searchElementPosTrad(List<Integer> list, int element) {
        int result = 0;

        for (int i=0; i <= list.size()-1; i++){
            if (list.get(i) == element){
                result = i;
            }
        }
        return result;
    }

    public int searchElementPosRecursive(List<Integer> list, int index, int element){
        if (index >= list.size()){
            return -1;
        }

        if (list.get(index) == element){
            return index;
        }

        return searchElementPosRecursive(list, index+1, element);
    }
}

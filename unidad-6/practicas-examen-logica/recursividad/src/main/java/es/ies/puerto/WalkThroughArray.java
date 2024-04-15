package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WalkThroughArray {
    public List<Integer> walkThroughArray(List<Integer> list, int index){
        if (index == list.size()-1){
            return list;
        }

        return walkThroughArray(list, ++index);
    }


}

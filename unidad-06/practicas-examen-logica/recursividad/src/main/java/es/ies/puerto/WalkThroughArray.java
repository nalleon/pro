package es.ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WalkThroughArray {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,23,35,4,5));
        System.out.println(walkThroughArrayTrad(list, 2));
    }
    public static List<Integer> walkThroughArrayTrad(List<Integer> list, int index){
        List<Integer> result = new ArrayList<>();
            for (int i=index; i <= list.size()-1; i++){
                result.add(list.get(i));
            }
        return result;
    }

    public List<Integer> walkThroughArray(List<Integer> list, int index){
        List<Integer> result = new ArrayList<>();
        if (index >= list.size()){
            return result;
        }

        result.add(list.get(index));
        List<Integer> subList = walkThroughArray(list, ++index);
        result.addAll(subList);

        return result;
    }


}

package ies.puerto.app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AppListaInteger {
    static List<Integer> myIntegerList;

    public static void main(String[] args) {
        myIntegerList = new ArrayList<>();
        addElement(1);
        addElement(2);
        List<Integer> subSubList = new ArrayList<>();
        subSubList.add(3);
        subSubList.add(4);
        addSubList(subSubList);
        System.out.println(myIntegerList);
    }
    // Si retorna true se añadio correctamente, false si no
    // Los Array list no tienen orden y permiten duplicados. Son vectores dinamicps
    public static boolean addElement(Integer element){
        return myIntegerList.add(element);
    }

    public static boolean removeElemeny (Integer element){
        return myIntegerList.remove(element);
    }

    public static boolean addSubList (Collection subList){
        return myIntegerList.addAll(subList);
    }
}

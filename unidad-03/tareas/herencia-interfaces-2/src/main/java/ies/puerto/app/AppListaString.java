package ies.puerto.app;

import java.util.ArrayList;
import java.util.List;

public class AppListaString {
    static List<String> myStringList;

    public static void main(String[] args) {
        myStringList = new ArrayList<>();

        String dni1 = "12345678H";
        String dni2 = "98765432P";
        myStringList.add(dni1);
        myStringList.add(dni2);
        System.out.println(myStringList);

        boolean existElement = exist(dni1);
        if (existElement){
            System.out.println("The element exist: " + dni1 + ", in my list:" + myStringList);
        }
        existElement = exist("1234");
        if (!existElement){
            System.out.println("Element does not exist in my list: " + myStringList);
        }
    }

    public static boolean exist(String element){
        return myStringList.contains(element);
    }
}

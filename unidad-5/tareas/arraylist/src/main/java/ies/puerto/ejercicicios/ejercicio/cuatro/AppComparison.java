package ies.puerto.ejercicicios.ejercicio.cuatro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppComparison {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 5));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(7, 6, 7, 9, 2, 4));

        boolean commonElementExists = Ejercicio4.commonElementRecursive(list1, list2);
        System.out.println("Common element's existence: " + commonElementExists);
        List<Integer> notCommonList = new ArrayList<>(Arrays.asList(3, 6, 9, 10));
        commonElementExists = Ejercicio4.commonElementRecursive(notCommonList, list1);
        System.out.println("Common element's existence: " + commonElementExists);



    }
}

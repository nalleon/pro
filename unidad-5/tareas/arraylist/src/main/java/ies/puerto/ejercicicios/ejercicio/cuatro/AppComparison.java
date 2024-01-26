package ies.puerto.ejercicicios.ejercicio.cuatro;

import java.util.ArrayList;
import java.util.List;

public class AppComparison {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(6);
        list1.add(2);
        list1.add(3);

        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(1);
        list2.add(9);

        boolean commonElementExists = Ejercicio4.haveCommonElement(list1, list2);

        if (commonElementExists) {
            System.out.println("The lists have at least one common element.");
        } else {
            System.out.println("The lists do not have any common elements.");
        }

        List <Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(31);
        list3.add(78);

        commonElementExists = Ejercicio4.haveCommonElement(list3, list1);

        if (commonElementExists) {
            System.out.println("The lists have at least one common element.");
        } else {
            System.out.println("The lists do not have any common elements.");
        }
    }
}

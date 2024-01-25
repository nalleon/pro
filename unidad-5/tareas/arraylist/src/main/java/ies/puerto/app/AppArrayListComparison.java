package ies.puerto.app;

import java.util.ArrayList;

import static ies.puerto.impl.ArrayListComparison.haveCommonElement;

public class AppArrayListComparison {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(6);
        list1.add(2);
        list1.add(3);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(1);
        list2.add(9);

        boolean commonElementExists = haveCommonElement(list1, list2);

        if (commonElementExists) {
            System.out.println("The lists have at least one common element.");
        } else {
            System.out.println("The lists do not have any common elements.");
        }
    }
}

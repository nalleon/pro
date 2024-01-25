package ies.puerto.app;

import ies.puerto.impl.ArrayListDuplicates;

import java.util.ArrayList;

public class AppArrayListDuplicates {


    public static void main(String[] args) {
        ArrayList <String> myDuplicatesList = new ArrayList<>();
        myDuplicatesList.add("Apple");
        myDuplicatesList.add("Apple");
        myDuplicatesList.add("Avocado");
        myDuplicatesList.add("Kiwi");
        myDuplicatesList.add("Kiwi");
        myDuplicatesList.add("Coco");

        System.out.println("> Original: " + myDuplicatesList);

        ArrayListDuplicates arrayListDuplicates = new ArrayListDuplicates(myDuplicatesList);
        ArrayList <String> myUniqueList = arrayListDuplicates.removeDuplicates();
        System.out.println("> Updated: " + myUniqueList);
    }
}

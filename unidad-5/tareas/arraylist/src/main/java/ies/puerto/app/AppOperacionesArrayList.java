package ies.puerto.app;

import ies.puerto.impl.OperacionesArrayList;

import java.util.ArrayList;
import java.util.List;

public class AppOperacionesArrayList {

    public static void main(String[] args) {
        List <String> myList = new ArrayList<>();
        myList.add("Apple");
        myList.add("Avocado");
        myList.add("Kiwi");
        myList.add("Coco");
        int counterA = OperacionesArrayList.elementStartWithA(myList);

        System.out.println("Total of words that starts with A: " + counterA);

        ArrayList<Integer> myIntegerList = new ArrayList<>();
        myIntegerList.add(2);
        myIntegerList.add(23);
        myIntegerList.add(237);
        myIntegerList.add(12);
        myIntegerList.add(5);
        myIntegerList.add(7);
        myIntegerList.add(3);
        myIntegerList.add(10);
        myIntegerList.add(90);

        List <Integer> numParity = OperacionesArrayList.parity(myIntegerList);
        System.out.println(numParity);

        boolean greaterThan10False = OperacionesArrayList.greaterThan10(myIntegerList);
        System.out.println("> All element > 10: " + greaterThan10False);
        ArrayList<Integer> myOtherIntegerList = new ArrayList<>();
        myOtherIntegerList.add(25);
        myOtherIntegerList.add(23);
        myOtherIntegerList.add(237);
        myOtherIntegerList.add(12);
        boolean greaterThan10True = OperacionesArrayList.greaterThan10(myOtherIntegerList);
        System.out.println("> All element > 10: " + greaterThan10True);
    }
}

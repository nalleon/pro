package ies.puerto.ejercicicios.ejercicio.dos.cinco.ocho;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppOperacionesArrayList {

    public static void main(String[] args) {
        List<String> myList;
        myList = new ArrayList<>(Arrays.asList("Apple", "Avocado", "Kiwi", "Coco", "Strawberry", "Ananias"));

        System.out.println(myList);
        System.out.println("Elements that start with A|a: " + OperacionesArrayList.counterOfElements(myList));


        ArrayList<Integer> myIntegerList = new ArrayList<>(Arrays.asList(2, 23, 4, 5,
                78, 90, 89, 45, 12, 46));


        List<Integer> numParity = OperacionesArrayList.parity(myIntegerList);
        System.out.println("Original list: " + myIntegerList);
        System.out.println("Modified list: " + numParity);

        boolean greaterThan10False = OperacionesArrayList.greaterThan10(myIntegerList);
        System.out.println("> All element >= 10: " + greaterThan10False);
        List<Integer> myOtherIntegerList = new ArrayList<>();
        myOtherIntegerList.add(25);
        myOtherIntegerList.add(23);
        myOtherIntegerList.add(237);
        myOtherIntegerList.add(12);
        boolean greaterThan10True = OperacionesArrayList.greaterThan10(myOtherIntegerList);
        System.out.println("> All element >= 10: " + greaterThan10True);
    }
}

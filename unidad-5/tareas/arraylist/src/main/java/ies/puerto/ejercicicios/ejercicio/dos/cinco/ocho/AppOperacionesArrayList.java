package ies.puerto.ejercicicios.ejercicio.dos.cinco.ocho;

import java.util.ArrayList;
import java.util.List;

public class AppOperacionesArrayList {

    public static void main(String[] args) {
        List<String> myList;
        myList = new ArrayList<>();
        myList.add("Apple");
        myList.add("Avocado");
        myList.add("Kiwi");
        myList.add("Coco");
        myList.add("Strawberry");
        myList.add("Ananias");
        myList.add("Sweets");

        System.out.println(myList);
        System.out.println("Elements that start with A|a: " + Ejercicio2.counterOfElements(myList));


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

        List<Integer> numParity = Ejercicio2.parity(myIntegerList);
        System.out.println("Original list: " + myIntegerList);
        System.out.println("Modified list: " + numParity);

        boolean greaterThan10False = Ejercicio2.greaterThan10(myIntegerList);
        System.out.println("> All element >= 10: " + greaterThan10False);
        List<Integer> myOtherIntegerList = new ArrayList<>();
        myOtherIntegerList.add(25);
        myOtherIntegerList.add(23);
        myOtherIntegerList.add(237);
        myOtherIntegerList.add(12);
        boolean greaterThan10True = Ejercicio2.greaterThan10(myOtherIntegerList);
        System.out.println("> All element >= 10: " + greaterThan10True);
    }
}

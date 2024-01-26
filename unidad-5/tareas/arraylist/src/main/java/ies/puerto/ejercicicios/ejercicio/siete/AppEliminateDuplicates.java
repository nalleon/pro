package ies.puerto.ejercicicios.ejercicio.siete;

import java.util.ArrayList;
import java.util.List;

public class AppEliminateDuplicates {
    public static void main(String[] args) {
        List<String> myDuplicatesList = new ArrayList<>();
        myDuplicatesList.add("Apple");
        myDuplicatesList.add("Apple");
        myDuplicatesList.add("Avocado");
        myDuplicatesList.add("Kiwi");
        myDuplicatesList.add("Kiwi");
        myDuplicatesList.add("Coco");

        System.out.println("> Original: " + myDuplicatesList);

        Ejercicio7 ejercicio7 = new Ejercicio7(myDuplicatesList);
        List <String> myUniqueList = ejercicio7.removeDuplicates();
        System.out.println("> Updated: " + myUniqueList);
    }
}

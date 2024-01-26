package ies.puerto.ejercicicios.ejercicio.siete;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppEliminateDuplicates {
    public static void main(String[] args) {
        List<String> myDuplicatesList = new ArrayList<>(Arrays.asList("Apple", "Apple", "Apple", "Avocado", "Kiwi", "Kiwi", "Coco"));

        System.out.println("> Original: " + myDuplicatesList);
        List <String> myUniqueList = Ejercicio7.removeDuplicates(myDuplicatesList);
        System.out.println("> Updated: " + myUniqueList);
    }
}

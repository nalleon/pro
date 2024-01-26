package ies.puerto.ejercicicios.ejercicio.siete;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Ejercicio7 {

    static List<String> myDuplicatesList;

    public static void main(String[] args) {
        myDuplicatesList = new ArrayList<>(Arrays.asList("milk", "water", "milk", "bag",
                "milk", "water", "bottle"));
        System.out.println("> Original: " + myDuplicatesList);
        List <String> myUniqueList = removeDuplicates(myDuplicatesList);
        System.out.println("> Updated: " + myUniqueList);
    }

    /**
     * Method to remove duplicates elements from a str array list
     * @return an unique elements array list
     */
    public static List<String> removeDuplicates(List<String> myStrList) {
        List<String> uniqueElementsList = new ArrayList<>();
        for (String element : myStrList) {
            if (!uniqueElementsList.contains(element)) {
                uniqueElementsList.add(element);
            }
        }
        return uniqueElementsList;
    }

    @Override
    public String toString() {
        return "Ejercicio7{}";
    }

}

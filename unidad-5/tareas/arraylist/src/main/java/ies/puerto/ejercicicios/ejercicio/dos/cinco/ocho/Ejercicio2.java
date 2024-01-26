package ies.puerto.ejercicicios.ejercicio.dos.cinco.ocho;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Escribe un método en una clase llamada OperacionesArrayList que reciba un ArrayList de cadenas y
 * devuelva la cantidad de elementos que comienzan con la letra 'A'. a la lista.
 */
public class Ejercicio2 {
    static List<String> myStrList;
    public static void main(String[] args) {
        myStrList = new ArrayList<>();

        myStrList.add("Apple");
        myStrList.add("Avocado");
        myStrList.add("Kiwi");
        myStrList.add("Coco");
        myStrList.add("Strawberry");
        myStrList.add("Ananias");
        myStrList.add("Sweets");

        System.out.println(myStrList);
        System.out.println("Elements that start with A|a: "+ counterOfElements(myStrList));
    }

    /**
     * Method to count how many elements starts with a selected letter
     * @param myStrList to count
     * @return number ofelements that starts with selected letter
     */
    public static int counterOfElements (List<String> myStrList){
        int counter = 0;
        for (String element : myStrList){
            if (strStartsWithARegex(element)){
                counter++;
            }
        }
        return counter;
    }
    /**
     * Method that verifies if a str starts with A
     * @param element to evalue
     * @return true if element starts with A, false if not
     */
    public static boolean strStartsWithA (String element){
        return element.charAt(0) == 'A';
    }

    /**
     * Method that verifies if a str starts with A with Regular Expression
     * @param element to evalue
     * @return true if element starts with A, false if not
     */
    public static boolean strStartsWithARegex (String element) {
        String regex = "^[A|a].*";
        return Pattern.matches(regex, element);
    }

    /**
     * Method to verify if a number is even
     * @param myList to evalue
     * @return new list with only even numbers
     */
    public static List <Integer> parity (List <Integer> myList){
        List <Integer> parity = new ArrayList<>();
        for (Integer num : myList){
            if (num % 2 ==0){
                parity.add(num);
            }
        }
        return parity;
    }

    /**
     * Method to verify if a list of integer has all its elements greaten than 10
     * @param myList to evalue
     * @return true if all elements are greater than 10, false if not
     */
    public static boolean greaterThan10 (List <Integer> myList){
        for (Integer num : myList){
            if (num <= 10){
                return false;
            }
        }
        return true;
    }
}

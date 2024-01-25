package ies.puerto.ejercicicios.ejercicio.dos;

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
        int counter = 0;
        for (String element : myStrList){
            if (strStartsWithARegex(element)){
                counter++;
            }
        }
        System.out.println(myStrList);
        System.out.println("Elements that start with A|a: "+ counter);
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
}

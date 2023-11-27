package ies.puerto;
import java.util.Scanner;
public class Ejercicio4 {


/**
 * Crea un programa que intente acceder a un método de un objeto que es null.
 * Por ejemplo un String. Maneja la excepción NullPointerException.
 * @author Nabil
 */
public class Ejercicio4 {
    public static void main(String[] args) throws Exception {
        String test = text();
    }

    public static String text() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a text:");
        String text = scanner.next();

        try {

            int lenght = text.length();
            System.out.println("Text's lenght:" + lenght);

        } catch (NullPointerException exception) {

            String errorMessage = "Tried to access a null object.";
            System.out.println("Message of println: " + errorMessage);
            throw new Exception(errorMessage);

        }
        return text;
    }
}

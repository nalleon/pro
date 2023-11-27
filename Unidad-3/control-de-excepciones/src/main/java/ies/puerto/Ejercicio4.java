package ies.puerto;
import java.util.Scanner;

/**
 * Crea un programa que intente acceder a un método de un objeto que es null.
 * Por ejemplo un String. Maneja la excepción NullPointerException.
 * @author Nabil
 */
public class Ejercicio4 {
    public static void main(String[] args) throws Exception {
        String test = text();
    }

    /**
     * Function yh
     * @return
     * @throws Exception
     */
    public static String text() throws Exception {

        String text = null;

        try {

            int lenght = text.length();

        } catch (NullPointerException exception) {

            String errorMessage = "Tried to access a null object.";
            System.out.println("Message of println: " + errorMessage);
            throw new Exception(errorMessage);

        }
        return text;
    }
}

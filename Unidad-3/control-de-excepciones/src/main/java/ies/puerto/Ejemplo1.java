package ies.puerto;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * @author Nabil
 */
public class Ejemplo1 {
    public static void main (String[] args)  {
        System.out.println("Hola chicos, esto será un error.");
        try {
            File archive = new File("archivo.txt");
            FileReader reader = new FileReader(archive);
        } catch (ArithmeticException exception){
            System.out.println("Es una exception arithmetic");
        } catch (FileNotFoundException fileNotFoundException){
            System.out.println("Es una exception FileNotFoundException");
        }
    }
}
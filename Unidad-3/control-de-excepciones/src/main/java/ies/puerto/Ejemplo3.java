package ies.puerto;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * @author Nabil
 */
public class Ejemplo3 {
    public static void main (String[] args)  {
        System.out.println("Hi guys, i'm example 3.");
            File archive = new File("archive.txt");
         System.out.println("I'm going to generate a NullPointer "+archive.getName());
    }
}

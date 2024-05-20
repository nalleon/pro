package ies.puerto;

import java.util.Scanner;

/**
 * Crea un programa que solicite al usuario ingresar un número como texto y luego intente convertirlo a un entero. 
 * Maneja la excepción NumberFormatException si el usuario ingresa algo que no es un número.
 * @author Nabil
 */
public class Ejercicio2 {
    public static void main(String[] args) throws Exception {
     String strNumber = askNumber();
     int number = convertStrIntNumbers(strNumber);
        System.out.println("Value of the transformed number: " + number);
    }

    /**
     * Function that asks a number via console
     * @return selected number
     */
    public  static String askNumber (){
        String number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a number:");
        number = scanner.nextLine();

        return number;
    }

    /**
     * Function that converts the string number into an integer
     * @param strNumber to convert
     * @return integer number
     * @throws Exception if the string is not a number
     */
    
    public static int convertStrIntNumbers(String strNumber) throws Exception {
        int result = 0;
        try {
            result = Integer.parseInt(strNumber);
        } catch (NumberFormatException e){
            throw new Exception("Inserted value: " + strNumber + ", it's not a number.");
        }


        return result;
    }
}

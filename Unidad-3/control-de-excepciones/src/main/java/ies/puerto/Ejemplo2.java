package ies.puerto;
/**
 * @author Nabil
 */

public class Ejemplo2 {
public static void main (String[] args){
    int number = 10;
    int divider = 0;
    try {
        int division = number/divider;
        System.out.println("Numero divido por 0 =" + division);
    } catch (ArithmeticException arithmeticException){
        System.out.println("Se ha producido una airthmetic exception," +
                "mensaje:"+ arithmeticException.getMessage());
    }



    }
}

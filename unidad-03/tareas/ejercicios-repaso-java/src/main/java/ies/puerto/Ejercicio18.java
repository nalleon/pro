package ies.puerto;

/**
 * Escribe un programa que declare una variable double y otra int, luego
 * realiza una conversión explícita de double a int y muestre el resultado.
 */
public class Ejercicio18 {
    public static void main(String[] args) {
        double doubleNum = 19.24;
        int intNum;
        intNum = (int) doubleNum;
        System.out.println("Double's value is: " +doubleNum+ "\nConversion to int is: " + intNum);
    }
}

package ies.puerto;
import java.util.Scanner;
/**
 * Escribe un programa que pida al usuario su edad y determine si es menor de 18, entre 18 y 65 o mayor de 65 años.
 */
public class Ejercicio49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How old are you? ");
        int age = scanner.nextInt();
        System.out.println(ageCheck(age));
    }
    public static String ageCheck (int age) {
        String result = "";
        if (age < 0) {
            result = "Age can NOT be negative.";
        } else if (age < 18) {
            result = "You are underage.";
        } else if (age > 18 && age < 65) {
            result = "You are above of age";
        } else {
            result = "You are old.";
        }
        return result;
    }
}

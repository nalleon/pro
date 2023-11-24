package ies.puerto;
/**
 * Escribe un programa que encuentre el primer número
 * divisible por 7 y 5 entre 1 y 100 (inclusive), utilizando break.
 * @author Nabil
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if ((i % 5 == 0 ) && (i % 7 == 0)) {
                System.out.println("The number is:" +i);
                break;
            }
        }
    }
    // acabar
    public boolean checkNumber (int number) {
        if ((number % 5 == 0) && (number % 7 == 0)) {
            return true;
        }
        return false;
    }
}

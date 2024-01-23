package ies.puerto;

/**
 * Escribe un programa que encuentre el primer
 * número divisible por 5 y mayor que 30, utilizando break
 * @author Nabil
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        for (int i=31; i <= 100; i++){
            if (i % 5 == 0){
                System.out.println("Number is " +i);
                break;
            }
        }
    }
}

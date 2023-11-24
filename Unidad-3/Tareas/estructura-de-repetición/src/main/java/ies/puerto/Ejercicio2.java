package ies.puerto;
/**
 * Escribe un programa que encuentre el isPrimer número primo mayor que 100 , utilizando break.
 * @author Nabil
 */
import java.util.Arrays;
public class Ejercicio2 {

    public static void main(String[] args) {
        boolean isPrime = false;
        int start = 100;
        int divider = 0;
        
        do {
        divider = 2;
        while (divider < start){
            if (start % divider == 0){
                break;
            }
        }
            if (divider == start - 1){
                isPrime = true; 
                break;
            }
            divider++;
            
            
        } while (!isPrime);



        





        for (int i=100; i <=1000; i++){
            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0){
                System.out.println("The number is " + i);
                break;
            }
        }

    }
}

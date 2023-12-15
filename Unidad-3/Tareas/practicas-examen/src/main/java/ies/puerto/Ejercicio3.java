package ies.puerto;

import java.util.Scanner;

/**
 * @author Nabil
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert an integer number");
        int num = scanner.nextInt();

        Ejercicio3 ejercicio3 = new Ejercicio3();
        System.out.println("Num " +num+ " is even: " + ejercicio3.parity(num));
    }

    public boolean parity(int num){
        return num % 2 == 0;
    }
}

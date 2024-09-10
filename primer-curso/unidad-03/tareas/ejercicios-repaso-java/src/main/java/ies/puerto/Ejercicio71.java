package ies.puerto;

import java.util.Scanner;

/**
 * Crea un programa que simule un juego de adivinanza. Elige un número aleatorio entre 1 y 10 y pide al usuario que
 * adivine. Utiliza un bucle do-while para continuar el juego hasta que el usuario adivine el número.
 */
public class Ejercicio71 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 7;
        System.out.println("Guess what number I'm thinking of between 1 and 10: ");
        int userNum = scanner.nextInt();

        do {
            System.out.println("Use a number between 1 and 10: ");
            userNum = scanner.nextInt();
        } while (userNum > 10);

        System.out.println(guessNum(num, userNum));

    }
    public static String guessNum (int num, int userNum){
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Try another num: ");
            userNum = scanner.nextInt();

        } while (num != userNum);

        return "Num was " + num;
    }

}

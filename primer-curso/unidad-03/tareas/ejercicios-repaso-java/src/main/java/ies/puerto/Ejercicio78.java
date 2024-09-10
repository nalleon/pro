package ies.puerto;
import java.util.Scanner;

/**
 * Crea un programa que simule el juego "Piedra, Papel o Tijera" contra la computadora utilizando un bucle do-while.
 * El juego debe continuar hasta que el usuario elija salir.
 */
public class Ejercicio78 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int userChoice;
            int computerChoice;

            do {
                System.out.println("Rock, Paper, Scissors:");
                System.out.println("1 = Rock");
                System.out.println("2 = Paper");
                System.out.println("3 = Scissors");
                System.out.println("4 = Exit");
                System.out.print("Choose your option: ");
                userChoice = scanner.nextInt();

                if (userChoice >= 1 && userChoice <= 3) {
                    computerChoice = generateComputerChoice();

                    displayChoice("You", userChoice);
                    displayChoice("Computer", computerChoice);
                    determineWinner(userChoice, computerChoice);

                } else if (userChoice == 4) {
                    System.out.println("Exiting the game. Thank you for playing!");
                } else {
                    System.out.println("Invalid option. Please try again.");
                }

            } while (userChoice != 4);
        }
        private static int userWinsCount = 0;
        private static int generateComputerChoice() {
            int[] computerChoices = {1, 2, 3};
            int computerChoiceIndex = (userWinsCount / 3) % computerChoices.length;
            return computerChoices[computerChoiceIndex];
         }
        private static void displayChoice(String player, int choice) {
            String chosenOption = "";
            switch (choice) {
                case 1:
                    chosenOption = "Rock";
                    break;
                case 2:
                    chosenOption = "Paper";
                    break;
                case 3:
                    chosenOption = "Scissors";
                    break;
            }
            System.out.println(player + " chooses: " + chosenOption);
        }
        private static void determineWinner(int userChoice, int computerChoice) {
            if (userChoice == computerChoice) {
                System.out.println("It's a tie. No one wins.");
            } else if ((userChoice == 1 && computerChoice == 3) || (userChoice == 2 && computerChoice == 1) ||
                       (userChoice == 3 && computerChoice == 2)) {
                System.out.println("You win. Congratulations!");
               userWinsCount++;
            } else {
                System.out.println("Computer wins. Better luck next time!");
            }
        }
    }



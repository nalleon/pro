package ies.puerto;
import java.util.Scanner;

public class Ejercicio3 {
    public class Ejercicio3 {

        public static void main(String[] args) throws Exception {
            int[] arrayPosition = arrayPosition();
        }

        public static int[] arrayPosition() throws Exception {
            int[] array = new int[3];
            Scanner scanner = new Scanner(System.in);

            try {
                System.out.println("Search for a position in the array: ");
                int position = scanner.nextInt();

                if (array.length <= position) {
                    throw new ArrayIndexOutOfBoundsException("Index out of bounds");
                }

            } catch (ArrayIndexOutOfBoundsException e) {
                String errorMessage = "Tried to access a position that does not exist";
                System.out.println("Message of println: " + errorMessage);
                throw new Exception(errorMessage);
            }
            return array;
        }
    }
}

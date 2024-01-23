package ies.puerto;

import java.util.Scanner;

/**
 * Crea una aplicación en Java que construya y muestre una representación gráfica de un triángulo invertido.
 * El programa debe de solicitar por teclado el número de columnas y si es
 * menor que cuatro generar una exception indicando el error.
 * @author Nabil
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert a number of columns:");
        int columns = scanner.nextInt();
        if (columns < 4) {
            throw new IllegalArgumentException("Error. Number of columns must be 4 or greater.");
        } else if (columns % 2 == 0) {
            columns += 1;
        }

        String[][] triangle = createTriangle(columns);
        String[][] invertedTriangle = createInvertedTriangle(columns);
        printTriangle(invertedTriangle);
        printTriangle(triangle);


    }

    public static String[][] createTriangle(int rows) {
        int columns = rows*2-1;
        String[][] triangle = new String[rows][columns];
        int rightLimit = rows * 2 - 1;
        int leftLimit = 0;
        for (int i = rows-1; i >= 0; i--) {
            for (int j = leftLimit; j < rightLimit; j++) {
                triangle[i][j] = "*";
            }
            rightLimit--;
            leftLimit++;
        }
        return triangle;
    }
    public static String[][] createInvertedTriangle(int rows) {
        int columns = rows*2-1;
        String[][] triangle = new String[rows][columns];
        int rightLimit = rows * 2 - 1;
        int leftLimit = 0;
        for (int i = 0; i <= rows-1; i++) {
            for (int j = leftLimit; j < rightLimit; j++) {
                triangle[i][j] = "*";
            }
            rightLimit--;
            leftLimit++;
        }
        return triangle;
    }


    public static void printTriangle(String[][] triangle) {
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                if (triangle[i][j] == null)
                    triangle[i][j] = " ";
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }

}


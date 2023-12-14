package ies.puerto;

import java.util.Scanner;

/**
 * Crea una aplicación en Java que construya y muestre una representación gráfica de un triángulo invertido. El programa debe de solicitar por teclado el número de columnas y si es
 * menor que cuatro generar una exception indicando el error.
 * @author Nabil
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert a number of columns:");
        int columns = scanner.nextInt();
                if (columns % 2 == 0){
                    columns += 1;
                }
        int rows = columns / 2;

    }

    public static String[][] createTriangle(int rows) {
        String[][] triangle = new String[rows+1][rows + rows - 1];
        int rightLimit = rows + rows -1;

        for (int i = rows; i > 0; i--) {
            for (int j = 0; j < rightLimit; j++){
                triangle[i][j] = ""+1;
            }
            rightLimit--;
        }
        return triangle;
    }

    public static void invertedTriangle (String [][] array){
        for (int i=0; i < array.length; i++){
            for (int j=i; j < array.length-i-1 ; j++){
                System.out.println('*');
            }
        }
    }
    public static void printTriangle (String[][] triangle) {
        for (int i = 0; i < triangle.length; i++){
            for (int j = 0; j < triangle[i].length; j++) {
                if (triangle[i][j] == null)
                    triangle[i][j] = " ";
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}


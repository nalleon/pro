package es.ies.puerto.modelo.impl;

import java.util.Scanner;

/**
 * Escribir un programa en que dibuje un triángulo equilátero como muestra la figura. El usuario deberá
 * ingresar la altura (número de rows que compondrán el triángulo), y el programa imprimirá en la consola el
 * triángulo correspondiente. En este ejemplo se trata de un trángulo con 5 rows.
 *
 *     1
 *    111
 *   11111
 *  1111111
 * 111111111
 */
public class Triangle {
    public static void main(String[] args) {
        int rows = askRows();
        drawTriangle(rows);
        drawTriangleInverted(rows);
    }

    public static int askRows() {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Choose an amount of rows: ");
        return lectura.nextInt();
    }

    public static void drawTriangle(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (i * 2) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void drawTriangleInverted(int rows) {
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (i * 2) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


}

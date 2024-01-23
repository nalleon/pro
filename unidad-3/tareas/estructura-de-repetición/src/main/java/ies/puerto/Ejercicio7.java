package ies.puerto;

/**
 * Escribe un programa que imprima todos los números impares del 1 al 20,
 * usando continue para omitir los números pares.
 * @author Nabil
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
        if (i % 2 == 0){
            continue;
        }
            System.out.println(i);
        }
    }
}

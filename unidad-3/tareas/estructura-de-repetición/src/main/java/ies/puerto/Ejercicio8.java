package ies.puerto;

/**
 * Escribe un programa que sume todos los números
 * pares del 1 al 10, usando continue para omitir los números impares.
 * @author Nabil
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                continue;
            }
            sum += i;
        }
        System.out.println(sum);
    }
}

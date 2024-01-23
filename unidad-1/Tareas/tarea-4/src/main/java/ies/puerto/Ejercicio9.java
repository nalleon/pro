package ies.puerto;
/**
 * Muestra los números del 1 al 100 (ambos incluidos). Usa un bucle while.
 * Haz el mismo ejercicio anterior con un bucle for.
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        int numero = 1;


        while (numero <= 100) {
            System.out.println(numero);
            numero++;
        }
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }
}



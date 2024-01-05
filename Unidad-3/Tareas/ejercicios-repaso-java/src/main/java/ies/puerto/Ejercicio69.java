package ies.puerto;

/**
 * Escribe un programa que utilice un bucle for para imprimir los números pares del 2 al 20.
 */
public class Ejercicio69 {
    public static void main(String[] args) {
        for (int i=2; i <=20; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}

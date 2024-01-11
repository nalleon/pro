package ies.puerto;

/**
 * Haz un programa que utilice un bucle while para imprimir los números pares del 20 al 2 en orden descendente.
 */
public class Ejercicio75 {
    public static void main(String[] args) {
        int i =20;
        while (i >=2){
            if (i % 2 ==0){
                System.out.println(i);
            }
            i--;
        }
    }
}

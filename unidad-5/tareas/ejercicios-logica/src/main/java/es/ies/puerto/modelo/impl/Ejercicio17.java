package es.ies.puerto.modelo.impl;
/*
 * Crea dos funciones, una que calcule el máximo común divisor (MCD) y otra
 * que calcule el mínimo común múltiplo (mcm) de dos números enteros.
 * - No se pueden utilizar operaciones del lenguaje que
 *   lo resuelvan directamente.
 */
public class Ejercicio17 {

    public int mcm (int num1, int num2){
        int result = 0;
        int temp = num2;
        while (num2 != 0){
            num2 = num1 % num2;
            num1 = temp;
        }

        return result;
    }

    public int mcd (int num1, int num2){
        return (num1*num2)/ mcm(num1,num2);
    }
}

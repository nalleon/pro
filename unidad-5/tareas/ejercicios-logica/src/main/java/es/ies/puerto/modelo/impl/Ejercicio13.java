package es.ies.puerto.modelo.impl;
/*
 * Escribe una función que calcule si un número dado es un número de Armstrong
 * (o también llamado narcisista).
 * Si no conoces qué es un número de Armstrong, debes buscar información
 * al respecto.
 */
public class Ejercicio13 {
    public boolean isArmstrong(int num){
        if (num < 0){
            return false;
        }
        int sum =0;
        int length = String.valueOf(num).length();
        String numStr = String.valueOf(num);

        for (int i=0; i<numStr.length(); i++){
            char currentChar = numStr.charAt(i);
            int digit = Character.getNumericValue(currentChar);
            sum+= (int) Math.pow(digit,length);
        }

        return num == sum;
    }
}

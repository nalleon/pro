package es.ies.puerto.modelo.impl;
/*
 * Crea una función que reciba dos cadenas como parámetro (str1, str2)
 * e imprima otras dos cadenas como salida (out1, out2).
 * - out1 contendrá todos los caracteres presentes en la str1 pero NO
 *   estén presentes en str2.
 * - out2 contendrá todos los caracteres presentes en la str2 pero NO
 *   estén presentes en str1.
 */
public class Ejercicio10 {
    public String notCommonLetters(String str1, String str2){
        String out = "";

       str1 = str1.toLowerCase();
       str2 = str2.toLowerCase();

        for (int i=0; i< str1.length(); i++){
            char currentChar = str1.charAt(i);
            if (str2.indexOf(currentChar) == -1 && out.indexOf(currentChar) == -1){
                out += currentChar;
            }
        }
        return out;
    }
}

package es.ies.puerto.modelo.impl;

import java.text.Normalizer;
import java.util.Locale;

public class Ejercicio11 {
    public boolean isPalindrome (String str){
        String normalStr = str.toLowerCase();
        int length = normalStr.length();
        for (int i =0; i < length/2; i++){
            if (normalStr.charAt(i) != normalStr.charAt(length-1-i)){
                return false;
            }
        }
        return true;
    }
}

package es.ies.puerto.modelo.impl;

public class ReverseStr {
    public static void main(String[] args) {
        System.out.println(reverseStrTrad("orvito"));
        System.out.println(reverseStrRecursive("loghito"));
    }
    public static String reverseStrTrad(String str) {
        String resultado = "";
        for (int i = str.length()-1 ; i >= 0 ; i--) {
            resultado+= str.charAt(i);
        }
        return resultado;
    }
    public static String reverseStrRecursive(String str) {
        if (str.length() == 1) {
            return str;
        }
        return str.charAt(str.length()-1) + reverseStrRecursive(str.substring(0,str.length()-1));
    }

}

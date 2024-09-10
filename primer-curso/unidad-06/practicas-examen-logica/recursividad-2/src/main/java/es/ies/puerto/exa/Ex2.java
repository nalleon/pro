package es.ies.puerto.exa;

import java.util.Date;

public class Ex2 {

    public static void main(String[] args) {
        System.out.println(sumaTradicional(1234));
        System.out.println(sumaRecursiva(1234));
    }
    public static int sumaTradicional(int numero) {
        String strNum = String.valueOf(numero);

        if (strNum.length() == 1){
            return numero;
        }

        int suma = 0;
        for (char i=0; i <= strNum.length()-1; i++){
            char charAtI = strNum.charAt(i);
            suma += Character.getNumericValue(charAtI);
        }

        return suma;
    }

    public  static int sumaRecursiva(int numero) {
        String strNum = String.valueOf(numero);

        if (strNum.length() == 1){
            return numero;
        }

        return Character.getNumericValue(strNum.charAt(0))
                + sumaRecursiva(Integer.parseInt(strNum.substring(1)));
    }
}

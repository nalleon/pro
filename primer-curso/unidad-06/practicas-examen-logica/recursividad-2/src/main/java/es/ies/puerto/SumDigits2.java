package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;

public class SumDigits2 {
    public static void main(String[] args) {
        System.out.println(traditional(123));
        System.out.println(recursive(123));
    }
    public static int traditional (int num){

        String strNum = String.valueOf(num);

        if (strNum.length()==1){
            return num;
        }

        int result = 0;

        for (char i =0; i <= strNum.length()-1; i++){
            char charAtI = strNum.charAt(i);
            result += Character.getNumericValue(charAtI);
        }

        return result;
    }


    public static int recursive (int num){
        String strNum = String.valueOf(num);

        if (strNum.length() == 1){
            return num;
        }

        return Character.getNumericValue(strNum.charAt(0))+
                recursive(Integer.parseInt(strNum.substring(1)));
    }
}

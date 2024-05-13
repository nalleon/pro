package es.ies.puerto;

public class Ejercicio8 {

    public  int sumDigitsTrad(int num){
        String strNum = String.valueOf(num);

        if (strNum.length() == 1){
            return num;
        }

        int sum = 0;
        for (char i=0; i <= strNum.length()-1; i++){
            char charI = strNum.charAt(i);
            sum += Character.getNumericValue(charI);
        }
        return sum;
    }


    public int sumDigitsRecursive(int num){
        String strNum = String.valueOf(num);
        if (strNum.length() == 1){
            return num;
        }

        return Character.getNumericValue(strNum.charAt(0)) +
                sumDigitsRecursive(Integer.parseInt(strNum.substring(1)));
    }
}

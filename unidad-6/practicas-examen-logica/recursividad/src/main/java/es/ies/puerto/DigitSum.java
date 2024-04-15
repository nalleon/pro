package es.ies.puerto;

public class DigitSum {

    public int digitSumTrad(int num){
        String strNum = String.valueOf(num);
        int sum = 0;
        for (int i=0; i < strNum.length(); i++){
            char charI = strNum.charAt(i);
            int digit = Character.getNumericValue(charI);
            sum += digit;
        }

        return sum;
    }

    public int digitSumRecursive(int num){
        String strNum = String.valueOf(num);

        if (strNum.length() == 1){
            return num;
        }


        return Character.getNumericValue(strNum.charAt(0)) +
                digitSumRecursive(Integer.parseInt(strNum.substring(1)));
    }
}

package es.ies.puerto;

public class SumDigits {

    public static void main(String[] args) {
        System.out.println(traditional(12));
        System.out.println(recursive(12));
    }

    public static int traditional (int num){
        String strNum = String.valueOf(num);

        if (strNum.length() == 1){
            return num;
        }

        int sum =0;

        for (char i=0; i <= strNum.length()-1; i++){
            char charAtI = strNum.charAt(i);
            sum += Character.getNumericValue(charAtI);
        }

        return sum;
    }


    public static int recursive (int num){
        String strNum = String.valueOf(num);

        if (strNum.length()==1){
            return num;
        }

        return Character.getNumericValue(strNum.charAt(0))
                +recursive(Integer.parseInt(strNum.substring(1)));
    }
}

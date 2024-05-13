package es.ies.puerto.modelo.impl;

public class Armstrong {

    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
        System.out.println(isArmstrong(-45));
        System.out.println(isArmstrong(370));
    }
    public static boolean isArmstrong(int num){
        if (num <= 0){
            return false;
        }

        int sum = 0;
        String strNum = String.valueOf(num);
        int numLength = strNum.length();

        for (int i = 0; i < strNum.length(); i++){
            char charI = strNum.charAt(i);
            sum += (int) Math.pow(Character.getNumericValue(charI), numLength);
        }

        return sum == num;
    }
}

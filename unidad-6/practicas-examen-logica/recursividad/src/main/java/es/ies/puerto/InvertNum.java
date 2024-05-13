package es.ies.puerto;

public class InvertNum {
    public static void main(String[] args) {
        System.out.println(invertNumRecursive(2530));
    }
    public static int invertNumRecursive(int num){
        if (num < 10){
            return num;
        }
        String strNum = String.valueOf(num);
        return (num % 10) * (int) Math.pow(10,strNum.length()) + (invertNumRecursive(num/10));
    }
}

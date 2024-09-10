package es.ies.puerto.modelo.impl;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i=1; i <= 100; i++) {
            System.out.println(i + " " + fizzBuzz(i));
        }
    }
    public static String fizzBuzz(int i){
        String message = "";
        if (i % 3 == 0){
            message +="fizz";
        }

        if (i % 5 == 0){
            message += "buzz";
        }
        return message;
    }
}


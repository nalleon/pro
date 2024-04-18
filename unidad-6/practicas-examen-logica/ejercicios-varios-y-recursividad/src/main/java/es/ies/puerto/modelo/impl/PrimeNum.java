package es.ies.puerto.modelo.impl;

public class PrimeNum {
    public static void main(String[] args) {
        for (int i =1; i <= 100; i++){
            System.out.println(i + " is prime: " + isPrime(i));
        }
    }

    public static Boolean isPrime (int i){
        if (i <= 1){
            return false;
        }

        if (i == 2){
            return true;
        }

        if (i % 2 == 0){
            return false;
        }

        for (int j = 3; j * j <= i; j+=2){
            if (i % j == 0){
                return false;
            }
        }
        return true;
    }
}

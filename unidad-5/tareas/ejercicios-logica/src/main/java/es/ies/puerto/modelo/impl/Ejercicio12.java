package es.ies.puerto.modelo.impl;

public class Ejercicio12 {
    public int factorial (int num){
        if (num < 0){
            return 0;
        } else if (num <= 1) {
            return 1;
        } else {
            return num * factorial(num-1);
        }
    }
}

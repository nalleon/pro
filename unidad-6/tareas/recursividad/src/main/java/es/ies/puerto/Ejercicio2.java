package es.ies.puerto;

public class Ejercicio2 {
    public int sum(int i){
        if (i == 0){
            return 0;
        }
        return i + sum(--i);
    }
}

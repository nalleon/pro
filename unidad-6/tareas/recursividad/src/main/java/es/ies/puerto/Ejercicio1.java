package es.ies.puerto;

public class Ejercicio1 {
    public String regressiveCount(int i){
        if (i < 0){
            return "";
        }
        return i + " " + regressiveCount(--i);
    }
}

package es.ies.puerto;

public class Ejercicio10 {
    public String printNum(int numLimit){
        if (numLimit < 1){
            return "";
        }

        if (!(numLimit % 2 == 0)){
            return numLimit + " " + printNum(--numLimit);
        }
        return printNum(--numLimit);
    }

}

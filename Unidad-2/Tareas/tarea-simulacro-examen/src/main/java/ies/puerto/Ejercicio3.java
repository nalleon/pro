package ies.puerto;
/**
 * @author Nabil
 */
public class Ejercicio3 {
    /**
     * function to classifies students' notes using a switch
     * @param note to classify
     * @return string
     */
    public String calificationsSwitch (double note){
        int status = 0;

        if (note < 5){
            status = 1;
        } else if (note < 6) {
            status = 2;
        } else if (note < 7 ) {
            status = 3;
        } else if (note < 9) {
            status = 4;
        } else if (note < 10) {
          status = 5;
        } else if (note >= 10) {
            status = 6;
        }

        switch (status) {

            case 1:
                return "Suspenso";
            case 2:
                return "Aprobado";
            case 3:
                return "Bien";
            case 4:
                return "Notable";
            case 5:
                return "Sobresaliente";
            case 6:
                return "Matricula";
        }
        return "Suspenso";
    }
    /**
     * function to classifies students' notes using if/else
     * @param note to classify
     * @return string
     */
    public String calificationsIfElse (double note){
        if (note < 5){
            return "Suspenso";
        } else if (note < 6) {
            return "Aprobado";
        } else if (note < 7 ) {
            return "Bien";
        } else if (note < 9) {
            return "Notable";
        } else if (note < 10) {
            return "Sobresaliente";
        } else if (note >= 10) {
            return "Matricula";
        }
        return  "Suspenso";
    }
}

package ies.puerto;

public class Ejercicio5 {

    public String monthIfElse (int month ){
        if (month < 0 || month > 12) {
            return  "Month does not exist.";
        }
        if (month == 1) {
            return "January";
        } else if (month == 2) {
            return "February";
        } else if (month ==3) {
            return "March";
        } else if (month ==4) {
            return "April";
        } else if (month == 5) {
            return "May";
        } else if (month == 6) {
            return "June";
        } else if (month == 7) {
            return "July";
        } else if (month == 8) {
            return "August";
        } else if (month == 9) {
            return "September";
        }
        return "";
    }
}

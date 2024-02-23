package ies.puerto.modelo.implementacion;

public class Ejercicio5 {

    private int num;

    /**
     * Default constructor of the class
     */
    public Ejercicio5 (){
    }

    /**
     * Constructor of the class
     * @param num of the month
     */
    public Ejercicio5(int num) {
        this.num = num;
    }

    /**
     * Getters and setters
     */

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    /**
     * Method to determinate a month by a number using if/else
     * @param num to evalue
     * @return name of the month if number is between or equals to one and twelve
     */
    public String monthIfElse(int num){
        if (num == 1){
            return "January";
        } else if (num == 2) {
            return "February";
        } else if (num == 3) {
            return "March";
        } else if (num == 4) {
            return "April";
        } else if (num == 5) {
            return "May";
        } else if (num == 6) {
            return "June";
        } else if (num == 7) {
            return "July";
        } else if (num == 8) {
            return "August";
        } else if (num == 9) {
            return "September";
        } else if (num == 10) {
            return "October";
        }
        else if (num == 11) {
            return "November";
        }
        else if (num == 12) {
            return "December";
        }
        return "Month does not exist";
    }
    /**
     * Method to determinate a month by a number using a switch
     * @param num to evalue
     * @return name of the month if number is between or equals to one and twelve
     */
    public String monthSwitch (int num){
        String result = "";
        switch (num){
            case 1:
                result = "January";
                break;
            case 2:
                result = "February";
                break;
            case 3:
                result = "March";
                break;
            case 4:
                result = "April";
                break;
            case 5:
                result = "May";
                break;
            case 6:
                result = "June";
                break;
            case 7:
                result = "July";
                break;
            case 8:
                result = "August";
                break;
            case 9:
                result = "September";
                 break;
            case 10:
                result = "October";
                break;
            case 11:
                result = "November";
             break;
            case 12:
                result = "December";
                break;
            default:
                result = "Month does not exist";
        }
        return result;
    }
}

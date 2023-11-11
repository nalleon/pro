package ies.puerto;
/**
 * @author Nabil
 */
public class Ejercicio4 {
    private String owner;
    private double salary;

    /**
     * default constructor of the class
     */
    public  Ejercicio4 (){}

    /**
     * consructor of the class with all its params
     * @param owner of the bank's account
     * @param salary inside the bank's account
     */
    public Ejercicio4(String owner, double salary) {
        this.owner = owner;
        this.salary = salary;
    }

    /**
     * getters/setters
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * function to deposit money in a bank's account
     * @param money to deposit
     * @return total of money
     */
    public double depositMoney (double money) {
        double result = salary + money;
        return result;
    }

    /**
     * function to withdraw money in a bank's account
     * @param money to withdraw
     * @return total of money
     */
    public double withdrawMoney (double money) {
        double result = salary - money;
        return result;
    }

    /**
     * function that shows the bank's account information
     * @return who is the owner and the salary
     */
    public String showInformation () {
        return "Owner:" + owner + ", Salary:" + salary;
    }
}

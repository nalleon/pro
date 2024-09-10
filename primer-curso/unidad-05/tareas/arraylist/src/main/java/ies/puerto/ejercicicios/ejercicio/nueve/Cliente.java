package ies.puerto.ejercicicios.ejercicio.nueve;

import java.util.Objects;

public class Cliente {
    private String name;
    private String num;
    private float balance;

    /**
     * Default constructor of the class
     */
    public Cliente() {
    }

    /**
     * Constructor of the class
     * @param name of the customer
     */
    public Cliente(String name) {
        this.name = name;
    }


    /**
     * Constructor of the class
     * @param name of the customer
     * @param num  of the customer
     */
    public Cliente(String name, String num) {
        this.name = name;
        this.num = num;
    }
    /**
     * Constructor of the class
     * @param name of the customer
     * @param num  of the customer
     * @param balance of the costumer
     */
    public Cliente(String name, String num, float balance) {
        this.name = name;
        this.num = num;
        this.balance = balance;
    }

    /**
     * Getters and setters
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public  void  updateBalance(float amount){
        this.balance += amount;
    }
    @Override
    public String toString() {
        return "Cliente{" +
                "name='" + name + '\'' +
                ", num=" + num +
                ", balance=" + balance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(num, cliente.num);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, num, balance);
    }
}

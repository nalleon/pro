package ies.puerto.ejercicicios.ejercicio.nueve;

import java.util.Objects;

public class Cliente {
    private String name;
    private int num;
    private float balance;

    public Cliente() {
    }

    public Cliente(String name) {
        this.name = name;
    }

    public Cliente(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public Cliente(String name, int num, float balance) {
        this.name = name;
        this.num = num;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
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
        return num == cliente.num && Float.compare(balance, cliente.balance) == 0 && Objects.equals(name, cliente.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, num, balance);
    }
}

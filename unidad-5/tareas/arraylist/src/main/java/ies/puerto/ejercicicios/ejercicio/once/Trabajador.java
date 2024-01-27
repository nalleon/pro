package ies.puerto.ejercicicios.ejercicio.once;

import java.util.Objects;

public abstract class Trabajador extends PersonaAbstrac {

    private String workerName;
    private float balance;

    /**
     * Default constructor of the class
     */
    public Trabajador (){}

    /**
     * Constructor of the class
     * @param workerName of the worker
     * @param balance of the worker
     */
    public Trabajador(String workerName, float balance) {
        this.workerName = workerName;
        this.balance = balance;
    }

    /**
     * Constructor of the class
     * @param workerName of the worker
     * @param balance of the worker
     * @param name of the worker
     * @param birthDate of the worker
     * @param dni of the worker
     */
    public Trabajador(String name, String birthDate, String dni, String workerName, float balance) {
        super(name, birthDate, dni);
        this.workerName = workerName;
        this.balance = balance;
    }

    /**
     * Getters and setters
     */

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "workerName='" + workerName + '\'' +
                ", balance=" + balance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Trabajador that = (Trabajador) o;
        return Float.compare(balance, that.balance) == 0 && Objects.equals(workerName, that.workerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), workerName, balance);
    }
}

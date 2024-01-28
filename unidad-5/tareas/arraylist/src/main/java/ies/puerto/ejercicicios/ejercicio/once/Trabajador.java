package ies.puerto.ejercicicios.ejercicio.once;

import java.util.Objects;

public abstract class Trabajador extends PersonaAbstrac {

    private String jobName;
    private float salary;

    /**
     * Default constructor of the class
     */
    public Trabajador (){}

    /**
     * Constructor of the class
     * @param jobName of the worker
     * @param balance of the worker
     */
    public Trabajador(String jobName, float balance) {
        this.jobName = jobName;
        this.salary = balance;
    }

    /**
     * Constructor of the class
     * @param jobName of the worker
     * @param balance of the worker
     * @param name of the worker
     * @param birthDate of the worker
     * @param dni of the worker
     */
    public Trabajador(String name, String birthDate, String dni, String jobName, float balance) {
        super(name, birthDate, dni);
        this.jobName = jobName;
        this.salary = balance;
    }

    /**
     * Getters and setters
     */

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "jobName='" + jobName + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Trabajador that = (Trabajador) o;
        return Float.compare(salary, that.salary) == 0 && Objects.equals(jobName, that.jobName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), jobName, salary);
    }
}

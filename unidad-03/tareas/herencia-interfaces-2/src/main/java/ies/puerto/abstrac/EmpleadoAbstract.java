package ies.puerto.abstrac;

import ies.puerto.interfaz.ITrabajador;

import java.util.Date;

public abstract class EmpleadoAbstract extends  PersonaAbstract implements ITrabajador {
    private float salary;
    private String job;

    public EmpleadoAbstract (){}

    public EmpleadoAbstract (float salary){
        this.salary = salary;
    }
    public EmpleadoAbstract (float salary, String job){
        this.salary = salary;
        this.job = job;
    }
    public EmpleadoAbstract(String name, String birthDate, float salary, String job) {
        super(name, birthDate);
        this.salary = salary;
        this.job = job;
    }

    /**
     * Getters and Setters
     */
    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public abstract float calculateSalary ();

    @Override
    public abstract String toString();
}

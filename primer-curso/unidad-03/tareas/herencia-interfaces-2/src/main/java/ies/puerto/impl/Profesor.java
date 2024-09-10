package ies.puerto.impl;

import ies.puerto.abstrac.EmpleadoAbstract;

public class Profesor extends EmpleadoAbstract  {

    private  String specialty;

    /**
     * Default constructor of the class
     */
    public Profesor (){}

    public Profesor(String specialty){
        this.specialty = specialty;
    }
    /**
     * Constructor of the class
     * @param name of the professor
     * @param birthDate of the professor
     * @param salary of the professor
     */

    public Profesor(String name, String birthDate, float salary, String specialty) {
        super(name, birthDate, salary, "Professor");
        this.specialty = specialty;
    }

    /**
     * Getters and Setters
     */

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }


    @Override
    public float calculateSalary() {
        return super.getSalary();
    }

    @Override
    public String toString() {
        return "> Info:\nName: " + getName() +"\nBirth: " + getBirthDate() +"\nJob: " + getJob() + "\nSpecialty: "
                + specialty + "\nSalary: " + calculateSalary();
    }


    @Override
    public String working() {
        return "I'm working atm";
    }

    public String teachingClass (){
        return "I'm teaching " + specialty;
    }
}

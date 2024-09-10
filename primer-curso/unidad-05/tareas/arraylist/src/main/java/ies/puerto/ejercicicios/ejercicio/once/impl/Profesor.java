package ies.puerto.ejercicicios.ejercicio.once.impl;

import ies.puerto.ejercicicios.ejercicio.once.abstracts.Empleado;

public class Profesor extends Empleado {
    private String speciality;

    /**
     * Default constructor of the class
     */
    public  Profesor (){}

    /**
     * Constructor of the class
     * @param name of the professor
     * @param birthDate of the professor
     * @param dni of the professor
     * @param workerName of the professor
     * @param salary of the professor
     * @param speciality of the professor
     */
    public Profesor(String name, String birthDate, String dni, String workerName, float salary, String speciality) {
        super(name, birthDate, dni, workerName, salary);
        this.speciality = speciality;
    }

    /**
     * Getters and setters
     */
    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "Profesor{" +  "name='" + super.getName() + '\'' +
                ", birthDate='" + super.getBirthDate() + '\'' +
                ", dni='" + super.getDni() + '\'' +
                "speciality='" + speciality + '\'' +
                "jobName='" + super.getJobName() + '\'' +
                ", salary=" + super.getSalary() +
                '}';
    }
}

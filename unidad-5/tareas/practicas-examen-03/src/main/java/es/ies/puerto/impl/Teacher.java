package es.ies.puerto.impl;

import es.ies.puerto.abstracts.Employee;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class Teacher extends Employee {
    private String specialty;

    /**
     * Constructor of the class
     */
    public Teacher (){
    }
    public Teacher (String specialty){
        this.specialty = specialty;
    }
    public Teacher(String name, String dni, String birthDate, String jobName, float salary, String specialty) {
        super(name, dni, birthDate, jobName, salary);
        this.specialty = specialty;
    }

    /**
     * Getters and setters
     */
    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    /**
     * Method toString
     */
    @Override
    public String toString() {
        return "Teacher{name='" + super.getName() + '\'' +
                ", dni='" + super.getDni() + '\'' +
                ", birthDate='" + super.getBirthDate() + '\'' +
                ", jobName='" + super.getJobName() + '\'' +
                ", salary=" + super.getSalary() + '\'' +
                ", specialty=" + specialty +
                '}';
    }

    public float maxSalaryPerTeacher(){
        float result = Float.MIN_VALUE;
        result = Math.max(result, getSalary());

        return result;
    }

    public float minSalaryPerTeacher(){
        float result = Float.MAX_VALUE;
        result = Math.min(result, getSalary());

        return result;
    }


}

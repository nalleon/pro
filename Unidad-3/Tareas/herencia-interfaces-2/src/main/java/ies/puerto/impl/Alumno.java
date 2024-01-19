package ies.puerto.impl;

import ies.puerto.abstrac.PersonaAbstract;

public class Alumno extends PersonaAbstract  {
    private String level;

    /**
     * Default constructor of the class
     */
    public Alumno () {}

    /**
     * Constructor of the class
     * @param level of the student
     */
    public Alumno(String level) {
        this.level = level;
    }

    /**
     * Constructor of the class
     * @param name of the student
     * @param birthDate of the student
     * @param level of the student
     */
    public Alumno(String name, String birthDate, String level) {
        super(name, birthDate);
        this.level = level;
    }

    /**
     * Getters and setters
     */

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    /**
     * Method to study
     */
    public String studying(){
        return "I'm studying for next exam";
    }

    @Override
    public String toString() {
        return "> Info:\nName: " + getName() + "\nBirth: " + getBirthDate() + "\nLevel: " + level;
    }
}

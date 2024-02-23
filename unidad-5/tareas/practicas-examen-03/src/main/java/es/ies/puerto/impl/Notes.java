package es.ies.puerto.impl;

import java.util.Objects;

public class Notes {
    private String subjectName;
    private float value;

    /**
     * Constructor of the class
     */
    public Notes (){}

    public Notes(String subjectName) {
        this.subjectName = subjectName;
    }

    public Notes(String subjectName, float value) {
        this.subjectName = subjectName;
        this.value = value;
    }

    /**
     * Getters and setters
     */
    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    /**
     * Method toString
     */
    @Override
    public String toString() {
        return "Notes{" +
                "subjectName='" + subjectName + '\'' +
                ", value=" + value +
                '}';
    }

    /**
     * Equals and hashcode
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notes notes = (Notes) o;
        return Objects.equals(subjectName, notes.subjectName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subjectName);
    }
}

package ies.puerto.ejercicicios.ejercicio.once;

import java.util.Objects;

public class Nota {
    private String subjectName;
    private float value;

    /**
     * Default constructor of the class
     */
    public Nota() {
    }

    /**
     * Constructor of the class
     * @param subjectName of the subject
     */
    public Nota(String subjectName) {
        this.subjectName = subjectName;
    }

    /**
     * Constructor of the class
     * @param subjectName of the subject
     * @param value of the subject
     */
    public Nota(String subjectName, float value) {
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

    @Override
    public String toString() {
        return "Nota{" +
                "subjectName='" + subjectName + '\'' +
                ", value=" + value +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nota nota = (Nota) o;
        return Float.compare(value, nota.value) == 0 && Objects.equals(subjectName, nota.subjectName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subjectName, value);
    }
}

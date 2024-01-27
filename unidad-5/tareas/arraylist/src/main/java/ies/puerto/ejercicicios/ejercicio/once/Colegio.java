package ies.puerto.ejercicicios.ejercicio.once;

import java.util.List;
import java.util.Objects;

public class Colegio {
    private String schoolName;
    private String address;
    private String location;
    private List <Aula> classList;

    /**
     * Default constructor of the class
     */
    public Colegio() {}

    /**
     * Constructor of the class
     * @param schoolName of the school
     * @param address of the school
     * @param location of the school
     * @param classList of the school
     */
    public Colegio(String schoolName, String address, String location, List <Aula> classList) {
        this.schoolName = schoolName;
        this.address = address;
        this.location = location;
        this.classList = classList;
    }

    /**
     * Getters and setters
     */
    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Aula> getClassList() {
        return classList;
    }

    public void setClassList(List<Aula> classList) {
        this.classList = classList;
    }

    @Override
    public String toString() {
        return "Colegio{" +
                "schoolName='" + schoolName + '\'' +
                ", address='" + address + '\'' +
                ", location='" + location + '\'' +
                ", classList=" + classList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Colegio colegio = (Colegio) o;
        return Objects.equals(address, colegio.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address);
    }

    public float averageGradesSchool (){
        float result = 0f;
        if (classList == null){
            return result;
        }

        for (Aula classSchool : classList){
            result+= classSchool.averageGradesClass();
        }
        return result/classList.size();
    }
}

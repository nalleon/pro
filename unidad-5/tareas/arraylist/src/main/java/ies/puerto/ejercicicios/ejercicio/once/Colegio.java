package ies.puerto.ejercicicios.ejercicio.once;

import java.text.ParseException;
import java.util.ArrayList;
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

    public float averageGradesSchool (List <Aula> classList){
        float result = 0f;
        if (classList == null){
            return result;
        }

        for (Aula classSchool : classList){
            result+= classSchool.averageGradesClass();
        }
        return result/classList.size();
    }

    /**
     * Method to get the Max grade for each student in the school
     * @return a list with the max grade ofr each student
     */
    public List<Float> getMaxGradesOfStudents() {
        List<Float> studentsMaxGrades = new ArrayList<>();
        for (Aula classroom : classList) {
            List<Alumno> students = classroom.getStudentList();
            if (!students.isEmpty()) {
                for (Alumno student : students) {
                    float maxGrades = getMaxGrade(student.getStudentsGrades());
                    studentsMaxGrades.add(maxGrades);
                }
            }
        }
        return studentsMaxGrades;
    }
    /**
     * Auxiliar method to the function getMaxGradesOfStudents
     * @return maxGrade if list is not empty, 0f if list is empty
     */
    public float getMaxGrade(List<Float> grades) {
        if (!grades.isEmpty()) {
            float maxGrade = Float.MIN_VALUE;
            for (float grade : grades) {
                if (grade > maxGrade) {
                    maxGrade = grade;
                }
            }
            return maxGrade;
        }
        return 0f;
    }

    /**
     * Method to calculate the max salary of professors
     * @return maxSalary
     */
    public float getMaxSalaryOfProfessors() {
        float maxSalary = Float.MIN_VALUE;
        for (Aula classroom : classList) {
            Profesor professor = classroom.getProfessor();
            if (professor != null) {
                maxSalary = Math.max(maxSalary, professor.getSalary());
            }
        }
        return maxSalary;
    }
    /**
     * Method to calculate the min salary of professors
     * @return minSalary
     */
    public float getMinSalaryOfProfessors() {
        float minSalary = Float.MAX_VALUE;

        for (Aula classroom : classList) {
            Profesor professor = classroom.getProfessor();
            if (professor != null) {
                minSalary = Math.min(minSalary, professor.getSalary());
            }
        }
        return minSalary;
    }

    /**
     * Method to calculate the avg salary of professors
     * @return avg salary per professor in school
     */
    public float getAverageSalaryOfTeachers() {
        float totalSalary = 0;
        int totalTeachers = 0;

        for (Aula aula : classList) {
            Profesor profesor = aula.getProfessor();
            if (profesor != null) {
                totalSalary += profesor.getSalary();
                totalTeachers++;
            }
        }
        return totalSalary/totalTeachers;
    }
    /**
     * Method to calculate the avg age of professors
     * @return avg age of professors in school
     * @throws ParseException if dateOfBirth has not correct format
     */
    public float getAverageAgeOfTeachers() throws ParseException {
        float totalAge = 0;
        int totalProfessors = 0;

        for (Aula aula : classList) {
            Profesor professor = aula.getProfessor();
            if (professor != null) {
                totalAge += professor.years();
                totalProfessors++;
            }
        }

        return totalAge/totalProfessors;
    }
    /**
     * Method to calculate the avg age of students
     * @return avg age of students in school
     * @throws ParseException if dateOfBirth has not correct format
     */
    public float getAverageAgeOfStudents() throws ParseException {
        float totalAge = 0;
        int totalStudents = 0;

        for (Aula aula : classList) {
            List<Alumno> students = aula.getStudentList();
            if (!students.isEmpty()) {
                for (Alumno student : students) {
                    totalAge += student.years();
                    totalStudents++;
                }
            }
        }

        return totalAge/totalStudents;
    }

    /**
     * Method to search information by DNI
     * @param dni to search for
     * @return toString of Professor, Student or Class
     */
    public String searchInformationByDNI(String dni) {
        for (Aula aula : classList) {
            Profesor professor = aula.getProfessor();
            if (professor != null && professor.getDni().equals(dni)) {
                return professor.toString();
            }
        }

        for (Aula aula : classList) {
            List<Alumno> students = aula.getStudentList();
            if (students != null && !students.isEmpty()) {
                for (Alumno student : students) {
                    if (student.getDni().equals(dni)) {
                        return student.toString();
                    }
                }
            }
        }

        for (Aula classroom : classList) {
            if (classroom.getClassName().equals(dni)) {
                return classroom.toString();
            }
        }
        return "Provided DNI/ID doesn't match anything.";
    }
}

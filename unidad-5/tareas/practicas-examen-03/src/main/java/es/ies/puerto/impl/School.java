package es.ies.puerto.impl;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class School {
    private String schoolName;
    private String address;

    private String location;
    private List<Classroom> classroomList;

    /**
     * Constructor of the class
     */
    public  School () {}
    public School(String schoolName, String address, String location, List<Classroom> classroomList) {
        this.schoolName = schoolName;
        this.address = address;
        this.location = location;
        this.classroomList = classroomList;
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

    public List<Classroom> getClassroomList() {
        return classroomList;
    }

    public void setClassroomList(List<Classroom> classroomList) {
        this.classroomList = classroomList;
    }

    /**
     * Method toString
     */
    @Override
    public String toString() {
        return "School{" +
                "schoolName='" + schoolName + '\'' +
                ", address='" + address + '\'' +
                ", location='" + location + '\'' +
                ", classroomList=" + classroomList +
                '}';
    }
    /**
     * Equals and hashcode
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school = (School) o;
        return Objects.equals(schoolName, school.schoolName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schoolName);
    }

    /**
     * Method to calculate the average note per Classroom
     * @return a float with the average note
     */
    public float avgNotePerSchool (){
        float result = 0f;
        if (classroomList.isEmpty()){
            return result;
        }
        List <Float> classroomNotes = new ArrayList<>();

        for (Classroom classroom : classroomList){
            float classroomAVG = classroom.avgNotePerClassroom();
            classroomNotes.add(classroomAVG);
            result+=classroomAVG;
        }

        result += result/ classroomList.size();

        return result;
    }

    public int averageAgeTeacher () throws ParseException {
        int result = 0;
        if (classroomList.isEmpty()){
            return result;
        }

        List <Teacher> classroomTeachers = new ArrayList<>();

        for (Classroom classroom : classroomList){
            Teacher teacher = classroom.getTeacher();
            classroomTeachers.add(teacher);
            } for (Teacher teacher : classroomTeachers){
                 result += teacher.years(teacher.getBirthDate());
        }
        return result / classroomList.size();
    }

    public float averageAgeSalary () throws ParseException {
        float result = 0;
        if (classroomList.isEmpty()){
            return result;
        }

        List<Teacher> teachers = new ArrayList<>();

        for (Classroom classroom : classroomList){
            Teacher teacher = classroom.getTeacher();
            teachers.add(teacher);

        } for (Teacher teacher : teachers){
            result += teacher.getSalary();
        }
        return result / classroomList.size();
    }
}

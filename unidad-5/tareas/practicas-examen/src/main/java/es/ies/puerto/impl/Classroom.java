package es.ies.puerto.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Classroom {
    private String classroomName;
    private Teacher teacher;

    private List<Student> studentList;

    /**
     * Constructor of the class
     */
    public Classroom (){}

    public Classroom(String classroomName) {
        this.classroomName = classroomName;
    }

    public Classroom(String classroomName, Teacher teacher) {
        this.classroomName = classroomName;
        this.teacher = teacher;
    }

    public Classroom(String classroomName, Teacher teacher, List<Student> studentList) {
        this.classroomName = classroomName;
        this.teacher = teacher;
        this.studentList = studentList;
    }

    /**
     * Getters and setters
     */
    public String getClassroomName() {
        return classroomName;
    }

    public void setClassroomName(String classroomName) {
        this.classroomName = classroomName;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    /**
     * Method toString
     */
    @Override
    public String toString() {
        return "Classroom{" +
                "classroomName='" + classroomName + '\'' +
                ", teacher=" + teacher +
                ", studentList=" + studentList +
                '}';
    }

    /**
     * Equals and hashcode
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Classroom classroom = (Classroom) o;
        return Objects.equals(classroomName, classroom.classroomName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(classroomName);
    }

    /**
     * Method to calculate the average note per Classroom
     * @return a float with the average note
     */
    public float avgNotePerClassroom (){
        float result = 0f;
        if (studentList.isEmpty()){
            return result;
        }
        List <Float> classroomNotes = new ArrayList<>();

        for (Student student : studentList){
           float studentAVG = student.avgNotePerStudent();
           classroomNotes.add(studentAVG);
           result+=studentAVG;
        }

        result += result/ studentList.size();

        return result;
    }
}

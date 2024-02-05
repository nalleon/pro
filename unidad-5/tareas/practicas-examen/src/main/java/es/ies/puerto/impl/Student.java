package es.ies.puerto.impl;

import es.ies.puerto.abstracts.Person;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
   private List<Notes> notesList;

    /**
     * Constructor of the class
     */
    public Student() {
        this.notesList = new ArrayList<>();;
    }

    public Student(String name, String dni, String birthDate) {
        super(name, dni, birthDate);
        this.notesList = new ArrayList<>();
    }

    /**
     * Getters and setters
     */

    public List<Notes> getNotesList() {
        return notesList;
    }

    public void setNotesList(List<Notes> notesList) {
        this.notesList = notesList;
    }

    /**
     * Method toString
     */
    @Override
    public String toString() {
        return "Person{" +
                "name='" + super.getName() + '\'' +
                ", dni='" + super.getDni() + '\'' +
                ", birthDate='" + super.getBirthDate() + '\'' +
                ", notes='" + notesList + '\'' +
                '}';
    }

    /**
     * Method to calculate the average note per Student
     * @return a list with the average note for each student
     */
    public float avgNotePerStudent (){
        float result = 0f;
        if (notesList.isEmpty()){
            return result;
        }

        for (Notes note : notesList){
            result += note.getValue();
        }
        result = result/notesList.size();

        return result;
    }
}

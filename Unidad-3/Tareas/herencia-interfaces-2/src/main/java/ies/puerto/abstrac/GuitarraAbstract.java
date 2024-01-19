package ies.puerto.abstrac;

public abstract class GuitarraAbstract {
    private String note;
    public GuitarraAbstract (){}
    /**
     * Constructor of the class
     * @param note to play on the guitar
     */
    public GuitarraAbstract(String note) {
        this.note = note;
    }

    /**
     * Getters and setters
     */
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }


    public String playNote(String note) {
        return "Playing "+ note + " on the guitar";
    }


    public String tune() {
        return "Tuning the guitar";
    }

    @Override
    public String toString (){
        return "> Data provided: " + note;
    }
    public void changeStrings() {
        System.out.println("Changing the strings of the guitar.");
    }
}

package ies.puerto;

public class Guitarra implements InstrumentoMusical {
    private String note;
    public static void main(String[] args) {
        Guitarra guitarra;
        guitarra = new Guitarra("J");
        guitarra.playNote(guitarra.getNote());
        guitarra.tune();
        guitarra.changeStrings();
    }

    /**
     * Default constructor of the class
     */
    public Guitarra () {}

    /**
     * Constructor of the class
     * @param note to play on the guitar
     */
    public Guitarra(String note) {
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

    @Override
    public void playNote(String note) {
        System.out.println("Playing "+ note + " on the guitar");
    }

    @Override
    public void tune() {
        System.out.println("Tuning the guitar");
    }

    @Override
    public String toString (){
        return "> Data provided: " + note;
    }
    public void changeStrings() {
        System.out.println("Changing the strings of the guitar.");
    }
}

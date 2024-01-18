package ies.puerto.app;

import ies.puerto.impl.Guitarra;

public class AppInstrumentoMusical {
    static Guitarra guitarra;

    public static void main(String[] args) {
        guitarra = new Guitarra("H");
        System.out.println(guitarra.toString());
        guitarra.playNote(guitarra.getNote());
        guitarra.tune();
        guitarra.changeStrings();

        guitarra.setNote("F");
        System.out.println("> New data provided: " +  guitarra.getNote());
        guitarra.playNote(guitarra.getNote());
        guitarra.tune();
        guitarra.changeStrings();
    }
}

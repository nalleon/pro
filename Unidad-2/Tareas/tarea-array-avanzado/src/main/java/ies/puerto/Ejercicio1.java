package ies.puerto;
/**
 * @author Nabil
 */
public class Ejercicio1 {

    public double [] showAllNotes (double [] notes){
      return notes;
    }

    public double higherNote (double [] notes){
        double higherNote = notes[0];
        for (int i=0; i < notes.length; i++){
            if (higherNote < notes[i]){
                higherNote = notes[i];
            }
        }
        return higherNote;
    }

    public double lowerNote (double [] notes){
        double lowerNote = notes[0];
        for (int i=0; i < notes.length; i++){
            if (lowerNote > notes[i]){
                lowerNote = notes[i];
            }
        }
        return lowerNote;
    }

    public double averageNote (double [] notes){
        double sumNotes = 0;

        for(int i=0; i<notes.length; i++){
            sumNotes += notes[i];
        }
        return sumNotes/notes.length;
    }
}

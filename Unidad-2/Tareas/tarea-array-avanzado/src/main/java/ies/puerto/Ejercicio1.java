package ies.puerto;
/**
 * @author Nabil
 */
public class Ejercicio1 {
    /**
     * function that evalues if notes values are valid
     * @param notes to evalue
     * @return if they are valid ()or not
     */
    public String valueNotesOK (float[]notes){
        for (int i =0; i < notes.length; i++){
            if (notes[i] <= 0 || notes[i] >= 10){
               return "Notes values are not valid";
            }
        }
        return  "Notes values are valid";
    }

    /**
     * function that shows all notes
     * @param notes to show
     * @return notes
     */
    public float [] showAllNotes (float [] notes){
      return notes;
    }

    /**
     * function shows the higher note
     * @param notes to evalue
     * @return the higher notes
     */
    public float higherNote (float [] notes){
        float higherNote = notes[0];
        for (int i=0; i < notes.length; i++){
            if (higherNote < notes[i]){
                higherNote = notes[i];
            }
        }
        return higherNote;
    }

    /**
     * function shows the lower note
     * @param notes to evalue
     * @return the lower notes
     */
    public float lowerNote (float [] notes){
        float lowerNote = notes[0];
        for (int i=0; i < notes.length; i++){
            if (lowerNote > notes[i]){
                lowerNote = notes[i];
            }
        }
        return lowerNote;
    }
    /**
     * function calculates the average note
     * @param notes to evalue
     * @return the promedy of a student's notes
     */
    public float averageNote (float [] notes){
        float sumNotes = 0;

        for(int i=0; i<notes.length; i++){
            sumNotes += notes[i];
        }
        return sumNotes/notes.length;
    }
}

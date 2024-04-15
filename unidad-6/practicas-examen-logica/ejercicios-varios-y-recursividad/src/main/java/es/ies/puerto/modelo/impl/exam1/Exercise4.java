package es.ies.puerto.modelo.impl.exam1;

public class Exercise4 {
    public Object[] analizer(String text){
        Object[] result = new Object[4];

        if (text == null){
            result[0] = 0;
            result[1] = 0;
            result[2] = 0;
            result[3] = 0;
            return result;
        }

        String [] words = text.split("\\s+");
        String [] phrases = text.split("\\.");
        double avgLengthWords = 0;
        int totalLetters =0;
        int phrasesCounter = phrases.length;
        String largestWord = words[0];

        for (String word : words){
            totalLetters += word.length();
            if (word.length() > largestWord.length()){
                largestWord = word;
            }
        }
        avgLengthWords = (double) totalLetters / words.length;
        result[0] = words.length;
        result[1] = avgLengthWords;
        result[2] = phrasesCounter;
        result[3] = largestWord;

        return result;
    }
}

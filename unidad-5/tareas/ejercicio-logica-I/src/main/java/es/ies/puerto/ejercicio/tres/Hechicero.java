package es.ies.puerto.ejercicio.tres;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Hechicero {

    public char vocalMasPoderosa(String texto) {
        char vocal = ' ';
        int maxFrecuencia=0;
        texto = texto.toLowerCase();
        Map<Character, Integer> vocalesMap = new HashMap<>();
        vocalesMap.put('a', 0);
        vocalesMap.put('e', 0);
        vocalesMap.put('i', 0);
        vocalesMap.put('o', 0);
        vocalesMap.put('u', 0);

        for (char c : texto.toCharArray()){
            if (vocalesMap.containsKey(c)){
                int count = vocalesMap.get(c) +1;
                vocalesMap.put(c,count);
                if (count > maxFrecuencia || c < vocal){
                    maxFrecuencia = count;
                    vocal = c;
                }
            }
            
        }
        return vocal;
    }
}

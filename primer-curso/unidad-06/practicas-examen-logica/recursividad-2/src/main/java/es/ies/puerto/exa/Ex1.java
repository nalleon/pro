package es.ies.puerto.exa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex1 {

    public static void main(String[] args) {
        List<String> palabras = new ArrayList<>(Arrays.asList("gato", "perro", "elefante", "loro", "tigre"));

        System.out.println(metodoTradicional(palabras));
        System.out.println(metodoRecursivo(palabras));
    }
    public static String metodoTradicional(List<String> palabras) {
      String resultado = null;

        if (palabras == null || palabras.isEmpty()) {
            return null;
        }
        resultado = palabras.get(0);
        if (palabras.size() == 1) {
            return resultado;
        }

         for (String palabra : palabras){
             if (palabra.length() > resultado.length()){
                 resultado = palabra;
             }
         }
        return resultado;
    }

    public static String metodoRecursivo(List<String> palabras) {
        String resultado = null;

        if (palabras == null || palabras.isEmpty()) {
            return null;
        }

        resultado = palabras.get(0);

        if (palabras.size() == 1) {
            return resultado;
        }

        palabras.remove(palabras.get(0));
        String palabraMasLarga = metodoRecursivo(palabras);

        if (palabraMasLarga.length() >= resultado.length()){
            return palabraMasLarga;
        } else {
            return resultado;
        }
    }
}

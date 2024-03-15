package es.ies.puerto.modelo.impl;

import java.util.ArrayList;
import java.util.List;

/*
 * Crea una función que reciba dos array, un booleano y retorne un array.
 * - Si el booleano es verdadero buscará y retornará los elementos comunes
 *   de los dos array.
 * - Si el booleano es falso buscará y retornará los elementos no comunes
 *   de los dos array.
 * - No se pueden utilizar operaciones del lenguaje que
 *   lo resuelvan directamente.
 */
public class Ejercicio16 {
    public static List<Float> commonElements(Float[] numArray1, Float[] numArray2, boolean commmon){
        List<Float> commonElements = new ArrayList<>();
        List<Float>  uncommonElements = new ArrayList<>();
        if (commmon){
            for (int i=0;i < numArray1.length; i++){
                for (int j=0; j< numArray2.length; j++){
                    if (numArray1[i].equals(numArray2[j])){
                        commonElements.add(numArray1[i]);
                    }
                }
            }
        }

        return commonElements;
    }

    public static List<Float> uncommonElements(Float[] numArray1, Float[] numArray2, boolean commmon){
        List<Float> uncommonElements = new ArrayList<>();
        if (commmon){
            for (int i=0;i < numArray1.length; i++){
                for (int j=0; j< numArray2.length; j++){
                    if (!numArray1[i].equals(numArray2[j])){
                        uncommonElements.add(numArray1[i]);
                        uncommonElements.add(numArray2[j]);
                    }
                }
            }
        }

        return uncommonElements;
    }
}

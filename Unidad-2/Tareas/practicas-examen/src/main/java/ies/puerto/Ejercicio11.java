package ies.puerto;

public class Ejercicio11 {

    public String showNumbers(int number) {
         String result = "";

        if (number > 0) {
            for (int i = 1; i < 5; ++i) {
              for (int j = 1; j <= i; ++j) {
                   result += (number++ + " ");

                }
              result += "\n";
            }

        }
        return result;
    }
}
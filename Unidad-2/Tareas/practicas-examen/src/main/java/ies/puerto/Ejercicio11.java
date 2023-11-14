package ies.puerto;

public class Ejercicio11 {

    public int showNumbers(int number) {
        int i = 0;
        int j = 0;
        if (number > 0) {
            for (i = 1; i <=10; i++) {
                number = i;
                if (i % 2 == 0) {
                    System.out.println();
                }
            }
        } else if (number < 0) {
            for (j = 1; j <=10; j++) {
                number = -j;
                if (j % 2 == 0) {
                    System.out.println();
                }
            }

        }
        return number;
    }
}
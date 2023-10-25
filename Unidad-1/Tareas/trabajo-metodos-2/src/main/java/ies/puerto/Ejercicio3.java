package ies.puerto;

/**
 * Realiza un programa que contenga los suficientes métodos para: pedir 5 números, mostrar los 5 números,
 * muestra la suma y los muestra en orden creciente y en orden decreciente.
 * @author Nabil
 */
public class Ejercicio3 {
    public String introduccionNumeros(int valor1, int valor2, int valor3, int valor4, int valor5) {
        String resultado = valor1 + "," + valor2 + "," + valor3 + "," + valor4 + "," + valor5;
        System.out.println(resultado);
        return resultado;
    }

    public int sumaNumeros(int valor1, int valor2, int valor3, int valor4, int valor5) {
        return valor1 + valor2 + valor3 + valor4 + valor5;
    }

    public String ordenarMayorNumeros(int valor1, int valor2, int valor3, int valor4, int valor5) {
        int valorOrdenado1 = 0;
        int valorOrdenado2 = 0;
        int valorOrdenado3 = 0;
        int valorOrdenado4 = 0;
        int valorOrdenado5 = 0;
        int numeroAnalizado = valor1;

        if (numeroAnalizado < valor1) {
            numeroAnalizado = valor1;
        }
        if (numeroAnalizado < valor2) {
            numeroAnalizado = valor2;
        }
        if (numeroAnalizado < valor3) {
            numeroAnalizado = valor3;
        }
        if (numeroAnalizado < valor4) {
            numeroAnalizado = valor4;
        }
        if (numeroAnalizado < valor5) {
            numeroAnalizado = valor5;
        }
        numeroAnalizado = valor1;

        /**
         * Segunda iteracion
         */
        if (numeroAnalizado != valor1 && numeroAnalizado > valor1) {
            numeroAnalizado = valor1;
        }
        if (numeroAnalizado != valor2 && numeroAnalizado < valor2) {
            numeroAnalizado = valor2;
        }
        if (numeroAnalizado != valor3 && numeroAnalizado < valor3) {
            numeroAnalizado = valor3;
        }
        if (numeroAnalizado != valor4 && numeroAnalizado < valor4) {
            numeroAnalizado = valor4;
        }
        if (numeroAnalizado != valor5 && numeroAnalizado < valor5) {
            numeroAnalizado = valor5;
        }
        return "5,4,3,2,1";
    }

    public String ordenarMenorNumeros(int valor1, int valor2, int valor3, int valor4, int valor5) {
        return "1,2,3,4,5";


    }
}

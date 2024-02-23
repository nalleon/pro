package ies.puerto;

/**
 * Realiza un programa que contenga los suficientes métodos para: pedir 5 números, mostrar los 5 números,
 * muestra la suma y los muestra en orden creciente y en orden decreciente.
 * @author Nabil
 */
public class Ejercicio3 {
    /**
     * Funcion que pide cinco numeros y los muestra en pantalla
     * @param valor1 a introducir y mostar
     * @param valor2 a introducir y mostar
     * @param valor3 a introducir y mostar
     * @param valor4 a introducir y mostar
     * @param valor5 a introducir y mostar
     * @return resultado
     */
    public String introduccionNumeros(int valor1, int valor2, int valor3, int valor4, int valor5) {
        String resultado = valor1 + "," + valor2 + "," + valor3 + "," + valor4 + "," + valor5;
        System.out.println(resultado);
        return resultado;
    }

    /**
     * Funcion que suma los cinco numeros
     * @param valor1 para sumar
     * @param valor2 para sumar
     * @param valor3 para sumar
     * @param valor4 para sumar
     * @param valor5 para sumar
     * @return suma de todos los enteros.
     */
    public int sumaNumeros(int valor1, int valor2, int valor3, int valor4, int valor5) {
        return valor1+valor2+valor3+valor4+valor5;
    }

     public int mayorAB (int valorA, int valorB) {
        int resultado= valorA;
        if (valorB>valorA){
            resultado = valorB;
        }
        return resultado;
     }
    public int mayorABC (int valorA, int valorB, int valorC) {
        int resultado= mayorAB(valorA, valorB);
        if (valorC>resultado){
            resultado = valorC;
        }
        return resultado;
    }
    public int mayorABCD (int valorA, int valorB, int valorC, int valorD) {
        int resultado= mayorABC(valorA, valorB, valorC);
        if (valorD>resultado){
            resultado = valorD;
        }
        return resultado;
    }
    public int mayorABCDE (int valorA, int valorB, int valorC, int valorD, int valorE) {
        int resultado= mayorABCD(valorA, valorB, valorC, valorD);
        if (valorE>resultado){
            resultado = valorE;
        }
        return resultado;
    }
    public int ordenarMayorNumeros(int valorA, int valorB, int valorC, int valorD, int valorE) {
        int valorOrdenado1 = mayorAB(valorA, valorB);
        int valorOrdenado2 = mayorABC(valorA, valorB, valorC);
        int valorOrdenado3 = mayorABCD(valorA, valorB, valorC, valorD);
        int valorOrdenado4 = mayorABCDE(valorA, valorB, valorC, valorD, valorE);

        if (){

        }

        return 0;
    }







    /**
     * Funcion que ordena de menor a mayor los cinco numeros
     * @param valor1 para ordenar
     * @param valor2 para ordenar
     * @param valor3 para ordenar
     * @param valor4 para ordenar
     * @param valor5 para ordenar
     * @return numeros ordenados
     */
    public String ordenarMenorNumeros(int valor1, int valor2, int valor3, int valor4, int valor5) {
        return "1,2,3,4,5";

    }
}

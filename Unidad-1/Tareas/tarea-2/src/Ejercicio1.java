/**
 * @author nalleon
 */
public class Ejercicio1 {

    /**
     * Desarrolle un algoritmo que permita leer dos valores distintos, determinar cual de los dos valores es el mayor y escribirlo.
     * @param args
     */
   package org.example;
import java.util.Scanner;
public class ejercicio1 {
	public static void main(String[] args) {

	int A;
	int B;
	Scanner scanner = new Scanner(System.in);
    	System.out.println("Introduzca dos valores distintos:");
    	A = scanner.nextInt();
    	B = scanner.nextInt();
    	while (A==B) {
    	System.out.println("Los valores deben de ser distintos. Por favor introduzca dos valores distintos:");
    	A = scanner.nextInt();
    	B = scanner.nextInt();
    	}
    	if (A<B) {
        	System.out.println(A + "Es el menor");
    	}else {
        	System.out.println(B + "Es el menor");
    	}
	}
}

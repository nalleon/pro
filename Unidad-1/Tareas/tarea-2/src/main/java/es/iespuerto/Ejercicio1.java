package ies.puerto;
import java.util.Scanner;
/**
 * Clase que realiza el ejercicio numero 1 de las tareas
 */
public class Ejercicio1 {
	public static void main(String[] args) {


		int valorA;
		int valorB;
		Scanner lectura = new Scanner (System.in);
		do {
			//Bloque 1: Pide por pantalla y asigna valor
			System.out.println("Ingrese el valor de la variable A: ");
			valorA = lectura.nextInt();
			System.out.println("Valor de la variable A:"+valorA);




			System.out.println("Ingrese el valor de la variable B: ");
			valorB = lectura.nextInt();
			System.out.println("Valor de la variable B:"+valorB);
			if (valorA == valorB) {
				System.out.println("Los valores son iguales");
			}




			//Bloque 2: Verifica si los valores son iguales
		} while (valorA == valorB);
		//Bloque 3: Verifica si A > B
		if (valorA > valorB){
			//Bloque 4: Muestra por pantalla el valor mayor
			System.out.println("El valor de A es mayor");
		} else {
			System.out.println("El valor de B es mayor");
		}
	}
}

package ies.puerto;

import java.util.Scanner;

/**
 * Crea una excepción personalizada llamada NombreInvalidoException que se lance cuando un método reciba
 * un nombre nulo o vacío como argumento. Implementa una clase que contenga un método
 * que acepte un nombre y lance esta excepción si es inválido.
 * @author Nabil
 */
public class Ejercicio10 {
    public static void main(String[] args) throws InvalidNameException {
        boolean condition = true;
        name(condition);

        // Scanner scanner = new Scanner(System.in);
        // String name = null;
        // System.out.println("Enter a name: ");
        // name = scanner.next();
        //    if (name == null | name.isEmpty()){
        //      throw new InvalidNameException(1, "InvalidNameException shows a message");
        //  }
    }

    public static void name (boolean condition) throws InvalidNameException {
        if (condition){
            throw new InvalidNameException(1, "InvalidNameException shows a message");
        }
    }
}

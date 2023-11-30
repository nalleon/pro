package ies.puerto;

import java.util.Scanner;

/**
 * Solicita al usuario ingresar una expresión matemática como texto (por ejemplo, "2 + abc")
 * y trata de evaluarla. Maneja la excepción ArithmeticException u otra excepción adecuada.
 * @author Nabil
 */
public class Ejercicio5 {
    public static void main(String[] args) throws Exception {
    String strMathExpression = askMathExpression();
    int expression = convertStrIntMathExpression(strMathExpression);
        System.out.println("Expression is: " + expression);
    }

    public static String askMathExpression (){
        String expression;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert an expression:");
        expression = scanner.nextLine();

        return expression;
    }

    public static int convertStrIntMathExpression (String strMathExpression) throws Exception {
        int result = 0;

        try {
            result = Integer.parseInt(strMathExpression);
        } catch (ArithmeticException e){
            throw new Exception("Inserted expression: " + strMathExpression + ", is not valid.");
        }
        return result;
    }

}

package ies.puerto.Utilidades;

public class AppCalculadora {
    static Calculadora calculadora;

    public static void main(String[] args) {
        calculadora = new Calculadora(2.5f, 10f);
        System.out.println("> Sum: " + calculadora.sum() + "\n> Difference: " +calculadora.difference()+
                "\n> Multiplication: " + calculadora.multiplication() + "\n> Division Div1: " +
                calculadora.divisionDivNum1() + "\n> Division Div2: " + calculadora.divisionDivNum2());
    }
}

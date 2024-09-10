package ies.puerto.Utilidades;

public class Calculadora extends UtilidadesCal {
    private float num1;
    private float num2;

    /**
     * Default constructor of the class
     */
    public Calculadora (){}

    /**
     * Constructor of the class
     * @param num1
     */
    public Calculadora (float num1){
        super(num1);
    }
    /**
     * Constructor of the class
     * @param num1
     * @param num2
     */
    public Calculadora (float num1, float num2){
        super(num1, num2);
    }
    public float sum (){
        return super.sum();
    }
    public float difference (){
        return super.difference();
    }

    public  float multiplication(){
        return super.multiplication();
    }

    public float divisionDivNum1() {
        return super.divisionDivNum1();
    }
    public float divisionDivNum2() {
        return super.divisionDivNum2();
    }
}

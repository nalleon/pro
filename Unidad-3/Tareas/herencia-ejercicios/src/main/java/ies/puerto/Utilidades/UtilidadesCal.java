package ies.puerto.Utilidades;

/**
 * Crea un paquete llamado utilidades y dentro de él una clase llamada UtilidadesCal
 * con métodos para realizar operaciones matemáticas básicas como suma, resta, multiplicación y división.
 * Crea la clase Calculadora que haga uso de UtilizadasCal a través de herenci
 */
public class UtilidadesCal {
    private float num1;
    private float num2;

    /**
     * Default constructor of the class
     */
    public UtilidadesCal (){}

    /**
     * Constructor of the class
     * @param num1 for calculations
     */
    public UtilidadesCal (float num1){
        this.num1=num1;
    }
    /**
     * Constructor of the class
     * @param num1 for calculations
     * @param num2  for calculations
     */
    public UtilidadesCal(float num1, float num2) {
        this.num1 = num1;
        this.num2 = num2;
    }


    /**
     * Getters and setters
     */
    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }

    /**
     * Sum of the numbers
     * @return sum of num1 and num2
     */
    public float sum (){
        return num1+num2;
    }
    /**
     * Difference of the numbers
     * @return difference of num1 and num2
     */
    public float difference(){
        return num1-num2;
    }
    /**
     * Multiplication of the numbers
     * @return multiplication of num1 and num2
     */
    public float multiplication (){
        return num1*num2;
    }
    /**
     * Division of the numbers
     * @return division of num1 between num2
     */
    public float divisionDivNum1 (){
        return num1/num2;
    }
    /**
     * Division of the numbers
     * @return division of num2 between num1
     */
    public float divisionDivNum2 (){
        return num2/num1;
    }


}

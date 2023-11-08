package ies.puerto;

/**
 *Crea una clase Circulo que tenga una propiedad radio y métodos para calcular el área y la circunferencia. Crea
 * objetos de esta clase y calcula el área y circunferencia de varios círculos
 * @author Nabil
 */
public class Circulo {
    private double radio;

    /**
     * Constructor por defecto de la clase.
     */
    public Circulo() {}
    /**
     * Constructor de la clase.
     * @param radio del circulo
     */
    public Circulo (double radio){
        this.radio = radio;
    }

    /**
     * Funcion para calcular el area
     */

    public double calcularArea () {
        double resultado;
        resultado = (Math.PI * (this.radio*this.radio));
        return resultado;
    }

    /**
     * Funcion para calcular la circunferencia
     */
    public double calcularCircunferencia () {
        double resultado;
        resultado = Math.PI * this.radio;
        return resultado;
    }
}

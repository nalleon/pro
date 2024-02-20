package ies.puerto;

/**
 * Crea una clase Rectangulo con propiedades largo y ancho.
 * Agrega métodos para calcular el área y el perímetro del rectángulo.
 * @author Nabil
 */
public class Rectangulo {
    private float largo;
    private float ancho;

    /**
     * Constructor por defecto de la clase
     */
    public Rectangulo () {}

    /**
     * Constructor de la clase
     * @param largo del rectangulo
     */
    public Rectangulo (float largo) {
        this.largo = largo;
    }
    /**
     * Constructor de la clase con todos sus parametros
     * @param largo del rectangulo
     * @param ancho  del rectangulo
     */
    public Rectangulo (float largo, float ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    /**
     * Funcion que calcula el area del rectangulo
     */

    public float calcularArea () {
        return this.ancho * this.largo;
    }
    /**
     * Funcion que calcula el perimetro del rectangulo
     */
    public float calcularPerimetro () {
        return (this.ancho * 2 + this.largo * 2);
    }
}

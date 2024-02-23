package ies.puerto;

/**
 * Crea una clase Estudiante con propiedades como nombre, edad, carrera, y promedio. Agrega métodos para mostrar
 * detalles, calcular si está aprobado o reprobado, etc.
 * @author Nabil
 */
public class Estudiante {
    private String nombre;
    private int edad;
    private String carrera;
    private float promedio;

    /**
     * Constructor por defecto de la clase
     */

    public Estudiante () {}

    /**
     * Constructor de la clase con todos sus parametros
     * @param nombre  del estudiante
     * @param edad  del estudiante
     * @param carrera del estudiante
     * @param promedio del estudiante
     */
    public Estudiante (String nombre, int edad, String carrera, float promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    /**
     * Funcion para mostar los parametros de cada estudiante
     */

    public String imprimir () {
        return "Nombre:" + nombre + ", Edad:" + edad + ", Carrera:" + carrera + ", Promedio:" + promedio;
    }

    /**
     * Funcion para ver si un estudiante está aprobado
     * @return true si está aprobado, false si no
     */
    boolean aprobado () {
        if (this.promedio >= 5)
            return true;
        return false;
    }
}

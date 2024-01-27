package ies.puerto.ejercicicios.ejercicio.once;

public abstract class Empleado extends  Trabajador {
    /**
     * Default constructor of the class
     */
    public Empleado () {}

    /**
     * Constructor of the class
     * @param name of the employee
     * @param birthDate of the employee
     * @param dni of the employee
     * @param workerName of the employee
     * @param balance of the employee
     */
    public Empleado(String name, String birthDate, String dni, String workerName, float balance) {
        super(name, birthDate, dni, workerName, balance);
    }

}

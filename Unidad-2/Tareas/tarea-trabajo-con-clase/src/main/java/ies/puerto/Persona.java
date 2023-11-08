package ies.puerto;

/**
 * Crea una clase Persona con las siguientes propiedades: nombre, edad, email y telefono.
 * Crea objetos de esta clase y realiza algunas operaciones como imprimir los
 * detalles de las personas, cambiar el nombre, etc.
 * @author Nabil
 */
public class Persona {
    private String nombre;
    private int edad;
    private String email;
    private int telefono;

    /**
     * Constructor por defecto de la clase.
     */
    public Persona() {

    }

    /**
     * Constructor de la clase
     * @param nombre de la persona
     */
    public Persona (String nombre){
        this.nombre = nombre;
    }

    /**
     * Constructor de la clase
     * @param nombre de la persona
     * @param edad de la persona
     */
    public Persona (String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Constructor de la clase
     * @param nombre de la persona
     * @param edad de la persona
     * @param email de la persona
     */
    public Persona (String nombre, int edad, String email){
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
    }

    /**
     * Constructor de la clase
     * @param nombre de la persona
     * @param edad de la persona
     * @param email de la persona
     * @param telefono de la persona
     */
    public Persona (String nombre, int edad, String email, int telefono){
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
        this.telefono = telefono;
    }

    /**
     * Getters/Setters de la clase
     */

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getEmail() {
        return email;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     *     public void imprimir(){
     *         System.out.println("Nombre" + nombre);
     *         System.out.println("Edad" + edad);
     *         System.out.println("Email" + email);
     *         System.out.println("Teléfono" + telefono);
     *     }
     */


    public String imprimir(){

        return "Nombre:" + nombre + ", Edad:" + edad + ", Email:" + email + ", Telefono:" + telefono;
    }
}


package ies.puerto;
/**
 * @author Nabil
 */
import java.util.Arrays;

public class Ejercicio2 {

    private String nombre;

    private int edad;
    private double peso;
    private double altura;

    public Ejercicio2 (){}

    public Ejercicio2(String nombre) {
        this.nombre = nombre;
    }

    public Ejercicio2(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Ejercicio2(String nombre, int edad, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    public Ejercicio2(String nombre, int edad, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double imc(){
        return peso/(altura*altura);
    }

    public String print(){
        return "";
    }
}

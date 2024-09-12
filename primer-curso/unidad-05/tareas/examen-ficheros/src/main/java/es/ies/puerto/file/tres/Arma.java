package es.ies.puerto.file.tres;

import es.ies.puerto.file.utilities.Utilities;

import java.util.Objects;

public class Arma extends Utilities {
    private String id;
    private String nombre;
    private String descripcion;
    private String origen;
    private int fuerza;

    /**
     * Constructors of the class
     */

    public Arma() {
    }

    public Arma(String id) {
        this.id = id;
    }

    public Arma(String id, String nombre, String descripcion, String origen, int fuerza) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.origen = origen;
        this.fuerza = fuerza;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripion) {
        this.descripcion = descripion;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    /**
     * Method toString
     */
    @Override
    public String toString() {
        return "Arma{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", origen='" + origen + '\'' +
                ", fuerza=" + fuerza +
                '}';
    }

    /**
     * Method equals and hashcode
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Arma arma = (Arma) o;
        return Objects.equals(id, arma.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    /**
     * Method to have a format of a csv
     */

    public String toCsv(){
        return id+delimiter+nombre+delimiter+descripcion+delimiter+origen+delimiter+fuerza+"\n";
    }
}

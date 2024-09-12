package es.ies.puerto.file.cuatro;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
@Root(name ="pokemon")
public class Pokemon {
    @Element(name = "id")
    private String id;
    @Element(name = "nombre")
    private String nombre;
    @ElementList(name = "tipos")
    private List<String> tipos;
    @Element(name = "descripcion")
    private String descripcion;

    /**
     * Constructors of the class
     */
    public Pokemon() {
        tipos = new ArrayList<>();
    }

    public Pokemon(String id) {
        this.id = id;
    }

    public Pokemon(String id, String nombre, List<String> tipos, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.tipos = tipos;
        this.descripcion = descripcion;
    }

    /**
     * Getters and setters
     */
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

    public List<String> getTipos() {
        return tipos;
    }

    public void setTipos(List<String> tipos) {
        this.tipos = tipos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Method toString
     */

    @Override
    public String toString() {
        return "Pokemon{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", tipos=" + tipos +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }

    /**
     * Method equals and hashcode
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pokemon pokemon = (Pokemon) o;
        return Objects.equals(id, pokemon.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

package es.ies.puerto.modelo.db.entidades;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name="Poder")
public class Poder implements Serializable {
    @Id
    String id;

    @Column(name="nombre")
    String nombre;

    @ManyToMany(mappedBy = "poderes", cascade = CascadeType.ALL)
    Set<Personaje> personaje;

    public Poder() {
    }

    public Poder(String id) {
        this.id = id;
    }

    public Poder(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
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

    public Set<Personaje> getPersonaje() {
        return personaje;
    }

    public void setPersonaje(Set<Personaje> personaje) {
        this.personaje = personaje;
    }

    @Override
    public String toString() {
        return "Poder{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Poder poder = (Poder) o;
        return Objects.equals(id, poder.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

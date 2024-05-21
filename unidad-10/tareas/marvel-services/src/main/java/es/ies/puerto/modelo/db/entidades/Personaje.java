package es.ies.puerto.modelo.db.entidades;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;
import java.util.Set;
@Entity
@Table(name = "Personaje")
public class Personaje implements Serializable {
    @Id
    private String id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "genero")
    private String genero;
    @OneToOne(mappedBy = "personaje", cascade = CascadeType.ALL, orphanRemoval = true)
    private Alias alias;
    @OneToMany(mappedBy = "personaje", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Equipamiento> equipamientos;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "Personaje_Poder",joinColumns =
    @JoinColumn(name="personaje_id",referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name="poder_id",referencedColumnName = "id"))
    private Set<Poder> poderes;

    public Personaje() {
    }

    public Personaje(String id) {
        this.id = id;
    }

    public Personaje(String id, String nombre, String genero, Alias alias, Set<Equipamiento> equipamientos, Set<Poder> poderes) {
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
        this.alias = alias;
        this.equipamientos = equipamientos;
        this.poderes = poderes;
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Alias getAlias() {
        return alias;
    }

    public void setAlias(Alias alias) {
        this.alias = alias;
    }

    public Set<Equipamiento> getEquipamientos() {
        return equipamientos;
    }

    public void setEquipamientos(Set<Equipamiento> equipamientos) {
        this.equipamientos = equipamientos;
    }

    public Set<Poder> getPoderes() {
        return poderes;
    }

    public void setPoderes(Set<Poder> poderes) {
        this.poderes = poderes;
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                ", alias=" + alias +
                ", equipamientos=" + equipamientos +
                ", poderes=" + poderes +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personaje personaje = (Personaje) o;
        return Objects.equals(id, personaje.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}


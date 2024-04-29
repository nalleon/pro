package es.ies.puerto.modelo.db.entidades;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

public class Personaje implements Serializable {
    private String id;
    private String nombre;
    private String genero;

    private AliasEntity aliasEntity;
    private Set<EquipamientoEntity> equipamientoEntities;
    private Set<Poder> poderes;

    public Personaje() {
    }

    public Personaje(String id) {
        this.id = id;
    }

    public Personaje(String id, String nombre, String genero, AliasEntity aliasEntity, Set<EquipamientoEntity> equipamientoEntities, Set<Poder> poderes) {
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
        this.aliasEntity = aliasEntity;
        this.equipamientoEntities = equipamientoEntities;
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

    public AliasEntity getAlias() {
        return aliasEntity;
    }

    public void setAlias(AliasEntity aliasEntity) {
        this.aliasEntity = aliasEntity;
    }

    public Set<EquipamientoEntity> getEquipamientos() {
        return equipamientoEntities;
    }

    public void setEquipamientos(Set<EquipamientoEntity> equipamientoEntities) {
        this.equipamientoEntities = equipamientoEntities;
    }

    public Set<Poder> getPoderes() {
        return poderes;
    }

    public void setPoderes(Set<Poder> poderes) {
        this.poderes = poderes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Personaje)) return false;
        Personaje personaje = (Personaje) o;
        return Objects.equals(id, personaje.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}


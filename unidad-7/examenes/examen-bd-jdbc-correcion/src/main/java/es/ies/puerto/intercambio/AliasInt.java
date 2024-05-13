package es.ies.puerto.intercambio;

import java.util.Objects;

public class AliasInt {
    String id;
    String descripcion;

    public AliasInt() {
    }

    public AliasInt(String id) {
        this.id = id;
    }

    public AliasInt(String id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "AliasInt{" +
                "id='" + id + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AliasInt aliasInt = (AliasInt) o;
        return Objects.equals(id, aliasInt.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

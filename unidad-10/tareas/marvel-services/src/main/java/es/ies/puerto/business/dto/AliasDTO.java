package es.ies.puerto.business.dto;

import java.util.Objects;

public class AliasDTO {
    String id;
    String descripcion;

    public AliasDTO() {
    }

    public AliasDTO(String id) {
        this.id = id;
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
        return "AliasDTO{" +
                "id='" + id + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AliasDTO aliasDTO = (AliasDTO) o;
        return Objects.equals(id, aliasDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

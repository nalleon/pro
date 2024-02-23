package es.ies.puerto.presentacion.abstracts;

import java.util.Objects;

public abstract class ArticuloAbstracts {
    private String name;
    private String id;
    private String dEntrance;
    private float price;
    private String dExpiration;

    public ArticuloAbstracts (){
    }

    public ArticuloAbstracts(String name, String id, float price, String dEntrance, String dExpiration) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.dEntrance = dEntrance;
        this.dExpiration = dExpiration;
    }

    @Override
    public String toString() {
        return "ArticuloAbstracts{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", dEntrance='" + dEntrance + '\'' +
                ", price=" + price +
                ", dExpiration='" + dExpiration + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArticuloAbstracts that = (ArticuloAbstracts) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public String toCSV(){
        return name + id + dEntrance + price + dExpiration;
    }
}

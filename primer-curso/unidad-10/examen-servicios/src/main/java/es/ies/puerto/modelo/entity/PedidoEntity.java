package es.ies.puerto.modelo.entity;

import java.io.Serializable;
import java.util.Objects;

public class PedidoEntity implements Serializable {
    private int id;
    private int clienteId;
    private String producto;
    private int cantidad;

    public PedidoEntity() {
    }

    public PedidoEntity(int id) {
        this.id = id;
    }

    public PedidoEntity(int id, int clienteId, String producto, int cantidad) {
        this.id = id;
        this.clienteId = clienteId;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PedidoEntity that = (PedidoEntity) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "PedidoEntity{" +
                "id=" + id +
                ", clienteId=" + clienteId +
                ", producto='" + producto + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
}

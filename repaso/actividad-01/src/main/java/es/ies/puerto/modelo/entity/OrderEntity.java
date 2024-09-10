package es.ies.puerto.modelo.entity;

import java.io.Serializable;
import java.util.Objects;

public class PedidoEntity implements Serializable {
    private int id;
    private int clienteId;
    private String producto;
    private int cantidad;


}

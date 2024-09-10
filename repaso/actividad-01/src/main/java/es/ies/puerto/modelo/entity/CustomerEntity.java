package es.ies.puerto.modelo.entity;

import java.io.Serializable;
import java.util.Objects;

public class ClienteEntity implements Serializable {

    /**
     * Properties
     */
    private int id;
    private String name;
    private String email;

    /**
     * Default constructor of the class
     */

    public ClienteEntity() {
    }

    public ClienteEntity(int id) {
        this.id = id;
    }
}

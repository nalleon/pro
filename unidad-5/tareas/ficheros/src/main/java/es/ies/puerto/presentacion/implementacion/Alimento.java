package es.ies.puerto.presentacion.implementacion;

import es.ies.puerto.presentacion.abstracts.ArticuloAbstracts;

public class Alimento extends ArticuloAbstracts {
    public Alimento() {
    }

    public Alimento(String name, String id, float price, String dEntrance, String dExpiration) {
        super(name, id, price, dEntrance, dExpiration);
    }
}

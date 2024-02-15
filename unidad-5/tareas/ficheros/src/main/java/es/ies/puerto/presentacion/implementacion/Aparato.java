package es.ies.puerto.presentacion.implementacion;

import es.ies.puerto.presentacion.abstracts.ArticuloAbstracts;

public class Aparato extends ArticuloAbstracts {
    public Aparato() {
    }

    public Aparato(String name, String id, float price, String dEntrance, String dExpiration) {
        super(name, id, price, dEntrance, dExpiration);
    }
}

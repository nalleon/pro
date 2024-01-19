package ies.puerto.impl;

import ies.puerto.abstrac.GuitarraAbstract;
import ies.puerto.interfaz.IInstrumentoMusical;

public class Guitarra extends GuitarraAbstract implements IInstrumentoMusical {
    public Guitarra() {
    }

    public Guitarra(String note) {
        super(note);
    }
}

package ies.puerto.impl;

import ies.puerto.abstrac.ConductorAbstract;
import ies.puerto.interfaz.IConductor;

/**
 * Crea una interfaz Conductor con dos métodos abstractos: arrancar() y detener(). Implementa la interfaz en una clase
 * Automovil que proporciona una implementación concreta para ambos métodos. Además,
 * agrega un método adicional conducir() que sea específico de la clase Automovil.
 */
public class Automovil extends ConductorAbstract implements IConductor {

    /**
     * Default constructor of the class
     */
    public Automovil (){}

    public Automovil(String brand, String model, int speed) {
        super(brand, model, speed);
    }

}


package ies.puerto.app;

import ies.puerto.abstrac.ConductorAbstract;
import ies.puerto.impl.Automovil;
import ies.puerto.interfaz.IConductor;

/**
 * Crea una interfaz Conductor con dos métodos abstractos: arrancar() y detener(). Implementa la interfaz en una clase
 * Automovil que proporciona una implementación concreta para ambos métodos. Además,
 * agrega un método adicional conducir() que sea específico de la clase Automovil.
 */
public class AppAutomovil {
    static ConductorAbstract automovil;

    public static void main(String[] args) {
        automovil = new Automovil("Opel", "Corsa", 40);
        System.out.println(automovil.toString());
        System.out.println(automovil.start());
        System.out.println(automovil.drive());
        System.out.println(automovil.stop());

        automovil.setBrand("Ford");
        automovil.setModel("Fiesta");
        automovil.setSpeed(50);
        System.out.println("> Data updated: " +automovil.getBrand()+ ", " +automovil.getModel()+ ", "
                + automovil.getSpeed() + "km/h");
        System.out.println(automovil.start());
        System.out.println(automovil.drive());
        System.out.println(automovil.stop());
    }
}

package ies.puerto.interfaz;

/**
 * Crea una interfaz Conductor con dos métodos abstractos: arrancar() y detener(). Implementa la interfaz en una clase
 * Automovil que proporciona una implementación concreta para ambos métodos. Además,
 * agrega un método adicional conducir() que sea específico de la clase Automovil.
 */
public interface IConductor {

    public String start();
    public String stop();

    public String toString ();
}

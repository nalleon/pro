package ies.puerto;

/**
 * Crea una interfaz Conductor con dos métodos abstractos: arrancar() y detener(). Implementa la interfaz en una clase
 * Automovil que proporciona una implementación concreta para ambos métodos. Además,
 * agrega un método adicional conducir() que sea específico de la clase Automovil.
 */
public interface Conductor {

    void start();
    void stop();

    public String toString ();
}

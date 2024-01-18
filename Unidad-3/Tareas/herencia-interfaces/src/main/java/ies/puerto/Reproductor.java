package ies.puerto;
/**
 * Crea una interfaz llamada Reproductor que contenga dos métodos abstractos: reproducir() y detener(). Luego,
 * implementa la interfaz en una clase ReproductorMP3 que proporciona una implementación concreta para ambos métodos.
 */
public interface Reproductor {

    void play ();

    void stop();
    @Override
    public String toString ();
}

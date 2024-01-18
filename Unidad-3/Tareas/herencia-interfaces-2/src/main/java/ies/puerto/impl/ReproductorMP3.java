package ies.puerto.impl;

import ies.puerto.interfaz.IReproductor;

/**
 * Crea una interfaz llamada Reproductor que contenga dos métodos abstractos: reproducir() y detener(). Luego,
 * implementa la interfaz en una clase ReproductorMP3 que proporciona una implementación concreta para ambos métodos.
 */
public class ReproductorMP3 implements IReproductor {
    private String name;
    private String duration;
    public static void main(String[] args) {
        ReproductorMP3 reproductorMP3;
        reproductorMP3 = new ReproductorMP3("Return to Oblivion", "5:35");

        reproductorMP3.play();
        System.out.println();
        reproductorMP3.stop();
    }

    /**
     * Default constructor of the class
     */
    public ReproductorMP3(){}
    /**
     * Constructor of the class
     * @param name of the song
     */
    public ReproductorMP3(String name){
        this.name = name;
    }
    /**
     * Default constructor of the class
     * @param name of the song
     * @param duration of the song
     */
    public ReproductorMP3(String name, String duration){
        this.name = name;
        this.duration = duration;
    }

    /**
     * Getters and Setters
     * @return
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    /**
     * Method to play the song
     */
    @Override
    public String play() {
        return "Playing " + name +".mp3 \nDuration:" + duration;
    }

    /**
     * Method to stop playing the song
     */
    @Override
    public String stop() {
      return "Stopping " +name+".mp3 file";
    }

    @Override
    public String toString () {
        return "> Song's name: " +name+ "\n> Song's duration: " + duration;
    }
}

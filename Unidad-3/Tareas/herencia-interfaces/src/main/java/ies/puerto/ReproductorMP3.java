package ies.puerto;

/**
 * Crea una interfaz llamada Reproductor que contenga dos métodos abstractos: reproducir() y detener(). Luego,
 * implementa la interfaz en una clase ReproductorMP3 que proporciona una implementación concreta para ambos métodos.
 */
public class ReproductorMP3 implements Reproductor {
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
    public  ReproductorMP3 (){}
    /**
     * Constructor of the class
     * @param name of the song
     */
    public ReproductorMP3 (String name){
        this.name = name;
    }
    /**
     * Default constructor of the class
     * @param name of the song
     * @param duration of the song
     */
    public ReproductorMP3 (String name, String duration){
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
    public void play() {
        System.out.println("Playing " + name +".mp3 \nDuration:" + duration );
    }

    /**
     * Method to stop playing the song
     */
    @Override
    public void stop() {
        System.out.println("Stopping " +name+".mp3 file playback");
    }

    @Override
    public String toString () {
        return "> Song's name: " +name+ "\n> Song's duration: " + duration;
    }
}

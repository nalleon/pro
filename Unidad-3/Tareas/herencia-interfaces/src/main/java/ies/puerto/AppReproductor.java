package ies.puerto;

public class AppReproductor {

    static ReproductorMP3 reproductorMP3;
    public static void main(String[] args) {
        reproductorMP3 = new ReproductorMP3("Heartbeat, Heartbreak", "2:15");

        System.out.println("Info:\n" + reproductorMP3.toString());
        reproductorMP3.play();
        reproductorMP3.stop();
        System.out.println();

        reproductorMP3.setName("I'll Face Myself");
        reproductorMP3.setDuration("2:59");
        System.out.println("New info:\n" + reproductorMP3.toString());
        System.out.println("> New name: " + reproductorMP3.getName());
        System.out.println("> New duration: " + reproductorMP3.getDuration());
        reproductorMP3.play();
        reproductorMP3.stop();

    }
}

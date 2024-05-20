package ies.puerto.app;

import ies.puerto.impl.ReproductorMP3;
import ies.puerto.interfaz.IReproductor;

public class AppReproductor {

    static IReproductor reproductorMP3;
    public static void main(String[] args) {
        reproductorMP3 = new ReproductorMP3("Heartbeat, Heartbreak", "2:15");

        System.out.println("Info:\n" + reproductorMP3.toString());
        System.out.println(reproductorMP3.play());
        System.out.println(reproductorMP3.stop());
            type(reproductorMP3);


    }

    public static void type(IReproductor reproductor) {
        System.out.println(reproductor.getClass());
    }
}

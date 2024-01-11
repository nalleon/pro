package ies.puerto;

import javax.management.monitor.StringMonitor;

public class Loro extends Especie implements IAnimal {
    public Loro(String nombre, int chip){
        super(nombre, chip);
    }

    public String suSonido (){
        return "A que huele una jirafa";
    }
}

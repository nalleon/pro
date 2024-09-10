package ies.puerto;

public class Gato extends Especie {
    public Gato (String nombre, int chip) {
        super(nombre, chip);
    }

    @Override
    public String suSonido (){
        return "Miauuuu";
    }
}

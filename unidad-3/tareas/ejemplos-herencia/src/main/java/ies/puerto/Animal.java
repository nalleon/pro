package ies.puerto;

public abstract class Animal {
    private String nombre;
    private int chip;

    public Animal (){}
    public Animal (String nombre, int chip){
        this.nombre = nombre;
        this.chip = chip;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getChip() {
        return chip;
    }

    public void setChip(int chip) {
        this.chip = chip;
    }

    public String suSonido(){
        return "Soy un sonido de Animal";
    }

    @Override
    public String toString(){
        return "Nombre: " + nombre + "\nChip: " + chip;
    }
}

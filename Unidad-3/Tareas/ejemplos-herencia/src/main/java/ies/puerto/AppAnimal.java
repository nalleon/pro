package ies.puerto;

public class AppAnimal {
  //  static Animal animal;
    static Loro loro;
    static Gato gato;
    static Perro perro;
    static Serpiente serpiente;

    public static void main(String[] args) {
        // animal = new Animal();
        // System.out.println("Sonido Animal: " +animal.suSonido());
        gato = new Gato("L'eif", 1234);
        System.out.println("Sonido Gato: "+ gato.suSonido());
        System.out.println(gato.toString());
        perro = new Perro("Kimbo", 23468);
        System.out.println("Sonido Perro: " + perro.suSonido());
        System.out.println(perro.toString());
        loro = new Loro("Juanito", 367905);
        System.out.println("Sonido Loro: "+ loro.suSonido());
        System.out.println(loro.toString());
        serpiente = new Serpiente();
        System.out.println("Sonido Seriente: " + serpiente.suSonido());
    }
}

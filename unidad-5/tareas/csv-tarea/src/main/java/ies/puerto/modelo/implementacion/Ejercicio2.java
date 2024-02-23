package ies.puerto.modelo.implementacion;

public class Ejercicio2 {
    private String name;
    private int edad;
    private  double weight;
    private double height;

    /**
     * Default constructor of the class
     */
    public Ejercicio2() {
    }

    /**
     * Constructor of the class
     * @param name of the student
     * @param edad of the student
     * @param weight of the student
     * @param height of the student
     */
    public Ejercicio2(String name, int edad, double weight, double height) {
        this.name = name;
        this.edad = edad;
        this.weight = weight;
        this.height = height;
    }

    /**
     * Getters y setters
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Method toString
     */
    @Override
    public String toString() {
        return "Ejercicio2{" +
                "name='" + name + '\'' +
                ", edad=" + edad +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }

    public double calculateIMC (){
        return  getWeight() / (getWeight()*getWeight());
    }

    public String showInformation(){
        return toString() + "\nIMC: " + calculateIMC();
    }
}

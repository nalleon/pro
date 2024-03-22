package es.ies.puerto.tarea4.impl;

import com.google.gson.annotations.SerializedName;
import es.ies.puerto.tarea4.utilities.Utilities;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import java.util.Objects;

@Root(name = "alimento")
public class Food extends Utilities {
    @SerializedName("ID")
    @Element(name = "ID")
    private int id;
    @SerializedName("Nombre")
    @Element(name = "Nombre")
    private String name;
    @SerializedName("Tipo")
    @Element(name = "Tipo")
    private String type;
    @SerializedName("Calorías")
    @Element(name = "Calorías")
    private float calories;
    @SerializedName("Proteínas")
    @Element(name = "Proteínas")
    private float proteins;
    @SerializedName("Grasas")
    @Element(name = "Grasas")
    private float fat;
    @SerializedName("Carbohidratos")
    @Element(name = "Carbohidratos")
    private float carbohydrates;

    public Food (){}

    public Food(int id) {
        this.id = id;
    }

    public Food(int id, String name, String type, float calories, float proteins, float fat, float carbohydrates) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.calories = calories;
        this.proteins = proteins;
        this.fat = fat;
        this.carbohydrates = carbohydrates;
    }

    /**
     * Getters and setters
     */

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getCalories() {
        return calories;
    }

    public void setCalories(float calories) {
        this.calories = calories;
    }

    public float getProteins() {
        return proteins;
    }

    public void setProteins(float proteins) {
        this.proteins = proteins;
    }

    public float getFat() {
        return fat;
    }

    public void setFat(float fat) {
        this.fat = fat;
    }

    public float getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(float carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    /**
     * toString
     */

    @Override
    public String toString() {
        return "Food{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", calories=" + calories +
                ", proteins=" + proteins +
                ", fat=" + fat +
                ", carbohydrates=" + carbohydrates +
                '}';
    }


    /**
     * Equals and hashcode
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Food food = (Food) o;
        return id == food.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    public String toCSV(){
        return id+DELIMITER+name+DELIMITER+type+DELIMITER+calories+DELIMITER+proteins+
                DELIMITER+fat+DELIMITER +carbohydrates;
    }
}

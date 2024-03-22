package es.ies.puerto.tarea4.impl;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

@Root(name = "alimentos")
public class FoodList {

    @ElementList(inline = true)
    private List<Food> foodList;

    public FoodList() {
    }

    public FoodList(List<Food> foodList) {
        this.foodList = foodList;
    }

    public List<Food> getFoodList() {
        return foodList;
    }

    public void setFoodList(List<Food> foodList) {
        this.foodList = foodList;
    }
}

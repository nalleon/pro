package es.ies.puerto.tarea4.interfaces;

import es.ies.puerto.tarea4.impl.Food;

import java.util.List;

public interface ICrud {

    public List<Food> obtainFoodList();

    public Food obtainFood(Food food);

    public boolean addFood(Food food);

    public boolean deleteFood(Food food);

    public boolean updateFood(Food food);

    public void  saveFile(List<Food> foodList);

    public void loadBackUp();
}

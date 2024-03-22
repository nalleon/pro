package es.ies.puerto.tarea4.file;

import es.ies.puerto.tarea4.abstracts.FileAbstracts;
import es.ies.puerto.tarea4.impl.Food;
import es.ies.puerto.tarea4.impl.FoodList;
import es.ies.puerto.tarea4.interfaces.ICrud;
import org.simpleframework.xml.core.Persister;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileXml extends FileAbstracts implements ICrud {
    List <Food> foodList;
    List <Food> foodListBackUp = obtainFoodList();

    @Override
    public List<Food> obtainFoodList() {
        foodList = new ArrayList<>();
        if (!fileExists(pathXml)){
            return foodList;
        }
        Persister serializer = new Persister();
        try{
            File file = new File(pathXml);
            FoodList foodListAux = serializer.read(FoodList.class, file);
            foodList = foodListAux.getFoodList();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return foodList;
    }

    @Override
    public Food obtainFood(Food food) {
        if (!foodList.contains(food)){
            return null;
        }
        int position = foodList.indexOf(food);
        return foodList.get(position);
    }

    @Override
    public boolean addFood(Food food) {
        if (foodList.contains(food)){
            return false;
        }
        foodList.add(food);
        saveFile(foodList);
        return true;
    }

    @Override
    public boolean deleteFood(Food food) {
        if (!foodList.contains(food)){
            return false;
        }
        foodList.remove(food);
        saveFile(foodList);
        return true;
    }

    @Override
    public boolean updateFood(Food food) {
        if (!foodList.contains(food)){
            return false;
        }
        int position = foodList.indexOf(food);
        foodList.set(position, food);
        saveFile(foodList);
        return true;
    }

    @Override
    public void saveFile(List<Food> foodList) {
        FoodList foodListAux = new FoodList(foodList);
        Persister serializer = new Persister();
        try {
            serializer.write(foodListAux, new File(pathXml));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void loadBackUp() {
        saveFile(foodListBackUp);
    }
}

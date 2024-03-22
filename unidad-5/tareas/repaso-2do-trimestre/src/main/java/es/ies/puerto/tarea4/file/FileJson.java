package es.ies.puerto.tarea4.file;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import es.ies.puerto.tarea4.abstracts.FileAbstracts;
import es.ies.puerto.tarea4.impl.Food;
import es.ies.puerto.tarea4.interfaces.ICrud;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileJson extends FileAbstracts implements ICrud {
    List <Food> foodList;
    List <Food> foodListBackUp = obtainFoodList();

    public FileJson(){
        foodList = new ArrayList<>();
    }
    @Override
    public List<Food> obtainFoodList() {
        if (!fileExists(pathJson)){
            return foodList;
        }

        try{
            String json = new String(Files.readAllBytes(Paths.get(pathJson)));
            Type listType = new TypeToken<ArrayList<Food>>(){}.getType();
            foodList = new Gson().fromJson(json, listType);

        } catch (IOException e) {
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
        int position = foodListBackUp.indexOf(food);
        foodList.set(position,food);
        saveFile(foodList);
        return true;
    }

    @Override
    public void saveFile(List<Food> foodList) {
        try(FileWriter writer = new FileWriter(pathJson)){
            new GsonBuilder().setPrettyPrinting().create().toJson(foodList,writer);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void loadBackUp() {
        saveFile(foodListBackUp);
    }
}

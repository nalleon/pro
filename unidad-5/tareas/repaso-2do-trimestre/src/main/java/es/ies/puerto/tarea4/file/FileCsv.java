package es.ies.puerto.tarea4.file;

import es.ies.puerto.tarea4.abstracts.FileAbstracts;
import es.ies.puerto.tarea4.impl.Food;
import es.ies.puerto.tarea4.interfaces.ICrud;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileCsv extends FileAbstracts implements ICrud {
    List<Food> foodList;
    List<Food> foodListBackUp = obtainFoodList();;

    @Override
    public List<Food> obtainFoodList() {
        foodList = new ArrayList<>();
        if (!fileExists(pathCsv)) {
            return foodList;
        }
            try (BufferedReader br = new BufferedReader(new FileReader(pathCsv))) {
                boolean firstLine = true;
                String str;
                while ((str = br.readLine()) != null) {
                    if (firstLine){
                        firstLine = false;
                        continue;
                    }
                    String[] data = str.split(DELIMITER);
                    foodList.add(splitElements(data));
                }
            } catch(IOException e){
            throw new RuntimeException(e);
        }
        return foodList;
    }

    public Food splitElements(String [] data){
        int id = Integer.parseInt(data[0]);
        String name = data[1];
        String type = data[2];
        float calories = Float.parseFloat(data[3]);
        float proteins = Float.parseFloat(data[4]);
        float fat = Float.parseFloat(data[5]);
        float carbohydrates = Float.parseFloat(data[6]);
        return new Food(id,name,type,calories,proteins,fat, carbohydrates);
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
        int positon = foodList.indexOf(food);
        foodList.set(positon, food);
        saveFile(foodList);
        return true;
    }

    @Override
    public void saveFile(List<Food> foodList) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(pathCsv))){
               writer.write("ID,Nombre,Tipo,Calorías,Proteínas,Grasas,Carbohidratos\n");
                for (Food food : foodList){
                     writer.write(food.toCSV()+"\n");
                }
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public void loadBackUp() {
        saveFile(foodListBackUp);
    }
}

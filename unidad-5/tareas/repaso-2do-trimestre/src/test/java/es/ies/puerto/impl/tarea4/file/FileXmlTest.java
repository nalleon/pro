package es.ies.puerto.impl.tarea4.file;

import es.ies.puerto.tarea4.file.FileXml;
import es.ies.puerto.tarea4.impl.Food;
import es.ies.puerto.tarea4.interfaces.ICrud;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class FileXmlTest {
        int id = 11;
        String name = "nameAdd";
        String type = "typeAdd";
        float calories = 1.5f;
        float proteins= 1.5f;
        float fat= 1.5f;
        float carbohydrates= 1.5f;

        List<Food> foodList;
        ICrud persistence;

        @BeforeEach
        public void beforeEach(){
            persistence = new FileXml();
            foodList = persistence.obtainFoodList();
        }

        @Test
        public void obtainFoodListTest(){
            Assertions.assertFalse(foodList.isEmpty(), "Expected result not found");
        }

        @Test
        public void obtainFoodTest(){
            Food foodFind = new Food(1);
            foodFind = persistence.obtainFood(foodFind);
            Assertions.assertEquals(foodFind.getId(), 1, "Expected result not found");
            Assertions.assertNotNull(foodFind.getName(), "Expected result not found");
            Assertions.assertNotNull(foodFind.getType(), "Expected result not found");
            Assertions.assertNotNull(foodFind.getCalories(), "Expected result not found");
            Assertions.assertNotNull(foodFind.getProteins(), "Expected result not found");
            Assertions.assertNotNull(foodFind.getCarbohydrates(), "Expected result not found");

            foodFind = new Food(11);
            foodFind = persistence.obtainFood(foodFind);

            Assertions.assertFalse(foodList.contains(foodFind), "Expected result not found");
        }

        @Test
        public void addDeleteFood(){
            int ogSize = foodList.size();
            Food foodAdd = new Food(id,name,type,calories,proteins,fat,carbohydrates);
            persistence.addFood(foodAdd);
            foodList = persistence.obtainFoodList();

            Assertions.assertTrue(foodList.contains(foodAdd), "Expected result not found");
            int updatedSize = foodList.size();
            Assertions.assertEquals(ogSize+1, updatedSize, "Expected result not found");

            persistence.addFood(foodAdd);
            foodList = persistence.obtainFoodList();
            updatedSize = foodList.size();
            Assertions.assertTrue(foodList.contains(foodAdd), "Expected result not found");
            Assertions.assertEquals(ogSize+1, updatedSize, "Expected result not found");

            persistence.deleteFood(foodAdd);
            foodList = persistence.obtainFoodList();
            updatedSize = foodList.size();
            Assertions.assertEquals(updatedSize, ogSize, "Expected result not found");

            persistence.deleteFood(foodAdd);
            foodList = persistence.obtainFoodList();
            updatedSize = foodList.size();
            Assertions.assertEquals(updatedSize, ogSize, "Expected result not found");
        }

        @Test
        public void updateFoodTest(){
            Food foodFind= new Food(10);
            foodFind = persistence.obtainFood(foodFind);

            Food foodUpdate =persistence.obtainFood(foodFind);

            foodUpdate.setName(name);
            foodUpdate.setType(type);
            foodUpdate.setCalories(calories);
            foodUpdate.setProteins(proteins);
            foodUpdate.setFat(fat);
            foodUpdate.setCarbohydrates(carbohydrates);

            persistence.updateFood(foodUpdate);
            foodFind = persistence.obtainFood(foodUpdate);
            Assertions.assertEquals(foodFind.toString(), foodUpdate.toString(), "Expected result not found");

            persistence.loadBackUp();
        }
    }

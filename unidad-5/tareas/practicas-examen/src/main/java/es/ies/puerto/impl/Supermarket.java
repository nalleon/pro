package es.ies.puerto.impl;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Supermarket {
    private HashSet<Food> foodHashSet;
    private List<Electronic> electronicList;
    private HashMap<String, Souvenir> souvenirHashMap;

    /**
     * Constructor of the class
     */
    public Supermarket (){
        this.foodHashSet = new HashSet<>();
        this.electronicList = new ArrayList<>();
        this.souvenirHashMap = new HashMap<>();
    }

    public Supermarket(HashSet<Food> foodHashSet, List<Electronic> electronicList, HashMap<String,
            Souvenir> souvenirHashMap) {
        this.foodHashSet = foodHashSet;
        this.electronicList = electronicList;
        this.souvenirHashMap = souvenirHashMap;
    }

    /**
     * Getters and setters
     */
    public HashSet<Food> getFoodHashSet() {
        return foodHashSet;
    }

    public void setFoodHashSet(HashSet<Food> foodHashSet) {
        this.foodHashSet = foodHashSet;
    }

    public List<Electronic> getElectronicList() {
        return electronicList;
    }

    public void setElectronicList(List<Electronic> electronicList) {
        this.electronicList = electronicList;
    }

    public HashMap<String, Souvenir> getSouvenirHashMap() {
        return souvenirHashMap;
    }

    public void setSouvenirHashMap(HashMap<String, Souvenir> souvenirHashMap) {
        this.souvenirHashMap = souvenirHashMap;
    }

    /**
     * Method toString
     */
    @Override
    public String toString() {
        return "Supermarket{" +
                "foodHashSet=" + foodHashSet +
                ", electronicList=" + electronicList +
                ", souvenirHashMap=" + souvenirHashMap +
                '}';
    }

    public boolean addFood (Food food){
        if (foodHashSet.contains(food)){
            return false;
        }
        return foodHashSet.add(food);
    }

    public boolean removeFood (Food food){
        if (foodHashSet.isEmpty() || !foodHashSet.contains(food)){
            return false;
        }
        return foodHashSet.remove(food);
    }

    public Food searchFood (String udi){
        for (Food food : foodHashSet){
            if (food.getUdi().equals(udi)){
                return food;
            }
        }
        return null;
    }

    public boolean addElectronic (Electronic electronic){
        if (electronicList.contains(electronic)){
            return false;
        }
        return electronicList.add(electronic);
    }

    public boolean removeElectronic (Electronic electronic){
        if (electronicList.isEmpty() || !electronicList.contains(electronic)){
            return false;
        }
        return electronicList.remove(electronic);
    }

    public Electronic searchElectronic (String udi){
        for (Electronic electronic : electronicList){
            if (electronic.getUdi().equals(udi)){
                return electronic;
            }
        }
        return null;
    }
    public boolean addSouvenir (Souvenir souvenir){
        if (!souvenirHashMap.containsKey(souvenir.getUdi())){
            souvenirHashMap.put(souvenir.getUdi(), souvenir);
            return true;
        }
        return false;
    }

    public boolean removeSouvenir (Souvenir souvenir){
        if (souvenirHashMap.isEmpty() || !souvenirHashMap.containsKey(souvenir.getUdi())){
            return false;
        }
        return souvenirHashMap.remove(souvenir.getUdi(),souvenir);
    }

    public Souvenir searchSouvenir (String udi) {
        for (Souvenir souvenir: souvenirHashMap.values()){
            if (souvenir.getUdi().equals(udi)){
                return souvenir;
            }
        }
        return null;
    }

    public HashSet<Food> obtainExpiredFood () throws ParseException {
        if (foodHashSet.isEmpty()){
            return null;
        }
        HashSet <Food> expiredFood = new HashSet<>();
        for (Food food : foodHashSet){
            if (food.expiredFood()) {
                expiredFood.add(food);
            }
        }
        return expiredFood;
    }

    public HashSet<Float> foodPrice(){
        if (foodHashSet.isEmpty()){
            return null;
        }
        HashSet<Float> hashSetPrice = new HashSet<>();
        for (Food food : foodHashSet){
            hashSetPrice.add(food.getPrice());
        }
        return hashSetPrice;
    }

    public HashSet<Float> electronicsPrice(){
        if (electronicList.isEmpty()){
            return null;
        }
        HashSet<Float> hashSetPrice = new HashSet<>();
        for (Electronic electronic : electronicList){
            hashSetPrice.add(electronic.getPrice());
        }
        return hashSetPrice;
    }
    public HashSet<Float> souvenirsPrice(){
        if (souvenirHashMap.isEmpty()){
            return null;
        }
        HashSet<Float> hashSetPrice = new HashSet<>();
        for (Souvenir souvenir : souvenirHashMap.values()){
            hashSetPrice.add(souvenir.getPrice());
        }
        return hashSetPrice;
    }
    public HashSet<Float> productsPrice(){
        HashSet<Float> foodPrices = foodPrice();
        HashSet<Float> electronicsPrices = electronicsPrice();
        HashSet<Float> souvenirPrices = souvenirsPrice();

        HashSet<Float> hashSetPrice = new HashSet<>();
        hashSetPrice.addAll(foodPrices);
        hashSetPrice.addAll(electronicsPrices);
        hashSetPrice.addAll(souvenirPrices);

        return hashSetPrice;

    }

}

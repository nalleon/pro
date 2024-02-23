package es.ies.puerto.impl;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class SuperMarket {
    private HashSet<Aliment> alimentHash;
    private List<Electronics> electronicsList;
    private HashMap<String, Souvenir> souvenirHashMap;

    /**
     * Default constructor of the class
     */
    public SuperMarket() {
        this.alimentHash = new HashSet<>();
        this.electronicsList = new ArrayList<>();
        this.souvenirHashMap = new HashMap<>();
    }

    /**
     * Constructor of the class
     * @param alimentHash of the supermarket
     * @param electronicsList of the supermarket
     * @param souvenirHashMap of the supermarket
     */
    public SuperMarket(HashSet<Aliment> alimentHash, List<Electronics> electronicsList,
                       HashMap<String, Souvenir> souvenirHashMap) {
        this.alimentHash = alimentHash;
        this.electronicsList = electronicsList;
        this.souvenirHashMap = souvenirHashMap;
    }

    /**
     * Getters and setters
     */
    public HashSet<Aliment> getAlimentHash() {
        return alimentHash;
    }

    public SuperMarket setAlimentHash(HashSet<Aliment> alimentHash) {
        this.alimentHash = alimentHash;
        return this;
    }

    public List<Electronics> getElectronicsList() {
        return electronicsList;
    }

    public SuperMarket setElectronicsList(List<Electronics> electronicsList) {
        this.electronicsList = electronicsList;
        return this;
    }

    public HashMap<String, Souvenir> getSouvenirHashMap() {
        return souvenirHashMap;
    }

    public SuperMarket setSouvenirHashMap(HashMap<String, Souvenir> souvenirHashMap) {
        this.souvenirHashMap = souvenirHashMap;
        return this;
    }

    /**
     * Method toString
     */
    @Override
    public String toString() {
        return "SuperMarket{" +
                "alimentHash=" + alimentHash +
                ", electronicsList=" + electronicsList +
                ", souvenirHashMap=" + souvenirHashMap +
                '}';
    }

    /**
     * Method to add an aliment to the hashset
     * @param aliment to add
     * @return true if added, false if it exists in the hashset
     */
    public boolean addAliment (Aliment aliment){
        if (!alimentHash.contains(aliment)){
            alimentHash.add(aliment);
            return true;
        }
        return false;
    }

    /**
     * Method to  remove an aliment from the hashset
     * @param aliment to remove
     * @return true if successfully removed, false if aliment does not exist in hashset
     */
    public boolean removeAliment (Aliment aliment){
        if (!alimentHash.contains(aliment)){
            return false;
        }
        alimentHash.remove(aliment);
        return true;
    }

    /**
     * Method to obtain the info of an aliment
     * @param udi of the aliment
     * @return the aliment if it exists, null if not
     */
    public Aliment obtainAliment (String udi){
        Aliment aliment = new Aliment(udi);

        if (alimentHash.contains(aliment)){
            String name = aliment.getName();
            float price = aliment.getPrice();
            String dateEntrance = aliment.getDateEntrance();
            aliment = new Aliment(name, price, dateEntrance, udi);
            return aliment;
        }

        return null;
    }
    /**
     * Method to add an electronic product to the list
     * @param electronic product  to add
     * @return true if added, false if it exists in the list
     */
    public boolean addElectronic (Electronics electronic){
        if (electronicsList.isEmpty() || !electronicsList.contains(electronic)){
            electronicsList.add(electronic);
            return true;
        }
        return false;
    }

    /**
     * Method to  remove an electronic product from the hashset
     * @param electronic product to remove
     * @return true if successfully removed, false if electronic product does not exist in hashset
     */
    public boolean removeElectronic  (Electronics electronic){
        if (!electronicsList.contains(electronic)){
            return false;
        }
        electronicsList.remove(electronic);
        return true;
    }

    /**
     * Method to obtain the info of an electronic product
     * @param udi of the electronic product
     * @return the electronic product if it exists, null if not
     */
    public Electronics obtainElectronic  (String udi){
        Electronics electronics = new Electronics(udi);

        if (electronicsList.contains(electronics)){
            String name = electronics.getName();
            float price = electronics.getPrice();
            String dateEntrance = electronics.getDateEntrance();
            electronics = new Electronics(name, price, dateEntrance, udi);
            return electronics;
        }

        return null;
    }

    /**
     * Method to add a souvenir to the hashset
     * @param souvenir to add
     * @return true if added, false if it exists in the hashmap
     */
    public boolean addSouvenir (Souvenir souvenir){
        if (!souvenirHashMap.containsKey(souvenir.getUdi())){
            souvenirHashMap.put(souvenir.getUdi(), souvenir);
            return true;
        }
        return false;
    }

    /**
     * Method to  remove a souvenir from the hashset
     * @param souvenir to remove
     * @return true if successfully removed, false if souvenir does not exist in hashmap
     */
    public boolean removeSouvenir(Souvenir souvenir){
        if (souvenirHashMap.isEmpty() || !souvenirHashMap.containsKey(souvenir.getUdi())){
            return false;
        }
        souvenirHashMap.remove(souvenir.getUdi(), souvenir);
        return true;
    }

    /**
     * Method to obtain the info of a souvenir
     * @param udi of the souvenir
     * @return the souvenir if it exists, null if not
     */
    public Souvenir obtainSouvenir (String udi){
        Souvenir souvenir = new Souvenir(udi);
        if (souvenirHashMap.isEmpty()){
            return null;
        }

        if (souvenirHashMap.containsKey(udi)){
            String name = souvenir.getName();
            float price = souvenir.getPrice();
            String dateEntrance = souvenir.getDateEntrance();
            souvenir = new Souvenir(name, price, dateEntrance, udi);
            return souvenir;
        }

        return null;
    }
    /**
     * Method to obtain a list of passed aliments
     * @return a hashset with only passed products
     */
    public HashSet <Aliment> obtainPassedAliments () throws ParseException {
        HashSet <Aliment> passedProduct = new HashSet<>();
        if (alimentHash.isEmpty()) {
            return null;
        }
        for (Aliment aliment : alimentHash){
            if (aliment.passedProduct(aliment.getDateEntrance())){
                passedProduct.add(aliment);
            }
        }

        return passedProduct;
    }

    /**
     * Method to calculate the total price of the aliments section in the supermarket
     * @return sum of the prices of the products
     */
    public float priceOfAliments (){
        float result = 0f;
        if (alimentHash.isEmpty()){
            return result;
        }

        for (Aliment aliment : alimentHash) {
            result += aliment.getPrice();
        }

        return result;
    }

    /**
     * Method to calculate the total price of the electronics section in the supermarket
     * @return sum of the prices of the products
     */
    public float priceOfElectronics (){
        float result = 0f;
        if (electronicsList.isEmpty()){
            return result;
        }

        for (Electronics electronics : electronicsList) {
            result += electronics.getPrice();
        }

        return result;
    }

    /**
     * Method to calculate the total price of the souvenir section in the supermarket
     * @return sum of the prices of the products
     */
    public float priceOfSouvenirs (){
        float result = 0f;
        if (souvenirHashMap.isEmpty()){
            return result;
        }

        for (Souvenir souvenir : souvenirHashMap.values()) {
            result += souvenir.getPrice();
        }

        return result;
    }


}

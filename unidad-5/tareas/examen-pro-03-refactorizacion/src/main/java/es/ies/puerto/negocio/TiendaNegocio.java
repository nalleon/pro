package es.ies.puerto.negocio;

import es.ies.puerto.modelo.abstracts.ProductoAbstracts;
import es.ies.puerto.modelo.fichero.csv.implementation.FileCSV;
import es.ies.puerto.modelo.impl.Alimento;
import es.ies.puerto.modelo.impl.Aparato;
import es.ies.puerto.modelo.impl.CuidadoPersonal;
import es.ies.puerto.modelo.impl.Souvenir;

import java.text.ParseException;
import java.util.*;

public class TiendaNegocio {
    FileCSV fileCSV;
    private List<ProductoAbstracts> productoAbstractsList;
    private Set<ProductoAbstracts> alimentoList ;
    private List<ProductoAbstracts> aparatoList;
    private Map<String, ProductoAbstracts> souvenirHashMap;
    private List<ProductoAbstracts> cuidadoPersonalList;

    /**
     * Constructors of the class
     */
    public TiendaNegocio(){
        this.fileCSV = new FileCSV();
        this.productoAbstractsList = new ArrayList<>();
        this.alimentoList = new HashSet<>();
        this.aparatoList=new ArrayList<>();
        this.souvenirHashMap=new HashMap<>();
        this.cuidadoPersonalList=new ArrayList<>();
    }

    public TiendaNegocio(FileCSV fileCSV, List<ProductoAbstracts> productoAbstractsList, Set<ProductoAbstracts>
            alimentoList, List<ProductoAbstracts> aparatoList, HashMap<String, ProductoAbstracts> souvenirHashMap,
                         List<ProductoAbstracts> cuidadoPersonalList) {

        this.fileCSV = fileCSV;
        this.productoAbstractsList = productoAbstractsList;
        this.alimentoList = alimentoList;
        this.aparatoList = aparatoList;
        this.souvenirHashMap = souvenirHashMap;
        this.cuidadoPersonalList = cuidadoPersonalList;
    }

    /**
     * Getters and setters
     */

    public FileCSV getFileCSV() {
        return fileCSV;
    }

    public void setFileCSV(FileCSV fileCSV) {
        this.fileCSV = fileCSV;
    }

    public List<ProductoAbstracts> getProductoAbstractsList() {
        return productoAbstractsList;
    }

    public void setProductoAbstractsList(List<ProductoAbstracts> productoAbstractsList) {
        this.productoAbstractsList = productoAbstractsList;
    }

    public Set<ProductoAbstracts> getAlimentoList() {
        return alimentoList;
    }

    public void setAlimentoList(Set<ProductoAbstracts> alimentoList) {
        this.alimentoList = alimentoList;
    }

    public List<ProductoAbstracts> getAparatoList() {
        return aparatoList;
    }

    public void setAparatoList(List<ProductoAbstracts> aparatoList) {
        this.aparatoList = aparatoList;
    }

    public Map<String, ProductoAbstracts> getSouvenirHashMap() {
        return souvenirHashMap;
    }

    public void setSouvenirHashMap(HashMap<String, ProductoAbstracts> souvenirHashMap) {
        this.souvenirHashMap = souvenirHashMap;
    }

    public List<ProductoAbstracts> getCuidadoPersonalList() {
        return cuidadoPersonalList;
    }

    public void setCuidadoPersonalList(List<ProductoAbstracts> cuidadoPersonalList) {
        this.cuidadoPersonalList = cuidadoPersonalList;
    }

    /**
     * Method toString
     */
    @Override
    public String toString() {
        return "TiendaNegocio{" +
                "fileCSV=" + fileCSV +
                ", productoAbstractsList=" + productoAbstractsList +
                ", alimentoList=" + alimentoList +
                ", aparatoList=" + aparatoList +
                ", souvenirHashMap=" + souvenirHashMap +
                ", cuidadoPersonalList=" + cuidadoPersonalList +
                '}';
    }

    /**
     * Method to obtain the full list of food products
     * @return the full list of food (Alimento)
     */

    public Set<ProductoAbstracts> obtainAlimentosList() {
        return new HashSet<>(fileCSV.obtainAlimentos());
    }
    /**
     * Method to obtain the full list of objects products
     * @return the full list of objects (Aparato)
     */
    public List<ProductoAbstracts> obtainAparatosList() {
        return new ArrayList<>(fileCSV.obtainAparatos());
    }
    /**
     * Method to obtain the full list of self-care products
     * @return the full list of self-care (CuidadoPersonal)
     */
    public List<ProductoAbstracts> obtainCuidadosPersonalesList() {
        return new ArrayList<>(fileCSV.obtainCuidadosPersonales());
    }
    /**
     * Method to obtain the full list of souvenirs products
     * @return the full list of souvenirs (Souvenir)
     */
    public Map<String, ProductoAbstracts> obtainSouvernirsList() {
        List<ProductoAbstracts> souvernirList = fileCSV.obtainSouvenirs();
        Map<String, ProductoAbstracts> souvenirHashMap = new HashMap<>();

        for (ProductoAbstracts productoAbstracts : souvernirList){
            souvenirHashMap.put(productoAbstracts.getUdi(), productoAbstracts);
        }
        return souvenirHashMap;
    }

    /**
     * Method to obtain the full list of products
     * @return the full list of products
     */
    public List<ProductoAbstracts> obtainProducts() {
        List<ProductoAbstracts> allProductsList = new ArrayList<>();
        allProductsList.addAll(obtainAlimentosList());
        allProductsList.addAll(obtainAparatosList());
        allProductsList.addAll(obtainCuidadosPersonalesList());
        allProductsList.addAll(obtainSouvernirsList().values());
        return allProductsList;
    }

    /**
     * Method to obtain a certain product
     * @param udi to search in the list
     * @return the product if it exists, null if not
     */
    public  ProductoAbstracts obtainCertainProduct(String udi) {
        for (ProductoAbstracts productoAbstracts : obtainProducts()) {
            if (productoAbstracts.getUdi().equals(udi)) {
                return productoAbstracts;
            }
        }
        return null;
    }

    /**
     * Method to add a product to the list
     * @param productoAbstracts to add
     * @return true if product added, false if the list did contain the product
     */
    public boolean addProducts(ProductoAbstracts productoAbstracts){
        if (obtainProducts().contains(productoAbstracts)){
            return true;
        }
        return obtainProducts().add(productoAbstracts);
    }

    /**
     * Method to remove a product of the list
     * @param productoAbstracts to remove
     * @return true if product is removed, false if list is null or product does not exist in it
     */
    public boolean removeProducts(ProductoAbstracts productoAbstracts){
        if (!productoAbstractsList.contains(productoAbstracts)){
            return false;
        }
        return productoAbstractsList.remove(productoAbstracts);
    }

    /**
     * Method to calculate the total price of each type of products
     * @return a list of floats with the total price of each type of products
     */
    public List<Float> totalOfEachProduct() throws ParseException {
        return new ArrayList<>(Arrays.asList(totalPriceFromAlimentos(), totalPriceFromAparatos(),
                totalPriceFromCuidadoPersonal(), totalPriceFromSouvenirs()));
    }

    /**
     * Method to calculate the total price of products of food type (Alimento)
     * @return a float with the total price of each
     */
    public Float totalPriceFromAlimentos() throws ParseException {
        float sum = 0f;
            for (ProductoAbstracts productoAbstracts : obtainAlimentosList()){
                Alimento alimento = (Alimento) productoAbstracts;
                if (!alimento.isProductExpired()){
                    sum += alimento.maxPrice();
                }
            }
        return sum;
    }

    /**
     * Method to calculate the total price of products of objects type (Aparato)
     * @return a float with the total price of each
     */
    public Float totalPriceFromAparatos(){
        float sum=0f;
        for (ProductoAbstracts productoAbstracts : obtainAparatosList()){
            sum += productoAbstracts.maxPrice();
        }
        return sum;
    }

    /**
     * Method to calculate the total price of products of self-care type (CuidadoPersonal)
     * @return a float with the total price of each
     */
    public Float totalPriceFromCuidadoPersonal(){
        float sum=0f;
        for (ProductoAbstracts productoAbstracts : obtainCuidadosPersonalesList()){
            sum += productoAbstracts.maxPrice();
        }
        return sum;
    }

    /**
     * Method to calculate the total price of products of souvenirs type (Souvenir)
     * @return a float with the total price of each
     */
    public Float totalPriceFromSouvenirs() {
        float sum = 0f;

        for (ProductoAbstracts productoAbstracts : obtainSouvernirsList().values()) {
                sum += productoAbstracts.maxPrice();
        }
        return sum;
    }

    /**
     * Method to calculate the total earning of the shop
     * @return a float with the total
     */
        public float totalEarning () throws ParseException {
            return totalEarningAlimento()+totalEarningSouvenir()+totalEarningAparato()+totalEarningCuidadoPersonal();
        }

    /**
     * Method to calculate the total earning of the food
     * @return a float with the total
     */
    public float totalEarningAlimento () throws ParseException {
        float sumEarning = 0f;
        float sumNormal = 0f;
        for (ProductoAbstracts productoAbstracts : obtainAlimentosList()){
            Alimento alimento = (Alimento) productoAbstracts;
            if (!alimento.isProductExpired()){
            sumNormal+= productoAbstracts.getPrice();
            sumEarning += productoAbstracts.maxPrice();
            }
        }
        return sumEarning - sumNormal;
    }

    /**
     * Method to calculate the total earning of the items
     * @return a float with the total
     */
    public float totalEarningAparato () {
        float sumEarning = 0f;
        float sumNormal = 0f;
        for (ProductoAbstracts productoAbstracts : obtainAparatosList()){
            sumNormal+= productoAbstracts.getPrice();
            sumEarning += productoAbstracts.maxPrice();
        }

        return sumEarning - sumNormal;
    }

    /**
     * Method to calculate the total earning of the souvenirs
     * @return a float with the total
     */
    public float totalEarningSouvenir() {
        float sumEarning = 0f;
        float sumNormal = 0f;
        for (ProductoAbstracts productoAbstracts : obtainSouvernirsList().values()){
            sumNormal+= productoAbstracts.getPrice();
            sumEarning += productoAbstracts.maxPrice();
        }

        return sumEarning - sumNormal;
    }

    /**
     * Method to calculate the total earning of the self-care items
     * @return a float with the total
     */
    public float totalEarningCuidadoPersonal () {
        float sumEarning = 0f;
        float sumNormal = 0f;
        for (ProductoAbstracts productoAbstracts : obtainCuidadosPersonalesList()){
            sumNormal+= productoAbstracts.getPrice();
            sumEarning += productoAbstracts.maxPrice();
        }
        return sumEarning - sumNormal;
    }
    /**
     * Method to show the self-care items with a popularity if 7 or more
     * @return a list with the items that meet that conditions
     */
    public List<ProductoAbstracts> popularity() {
            List<ProductoAbstracts> popularItems = new ArrayList<>();
        for (ProductoAbstracts productoAbstracts : obtainCuidadosPersonalesList()){
            CuidadoPersonal cuidadoPersonal = (CuidadoPersonal) productoAbstracts;
            if (cuidadoPersonal.recommendProduct()){
                popularItems.add(cuidadoPersonal);
            }
        }
        return popularItems;
    }

    /**
     * Method to show the available products of each type
     * @return a list with the products
     * @throws ParseException if the food's expiration date does not meet the format
     */
    public List<ProductoAbstracts> showAvailableProducts() throws ParseException {
        List<ProductoAbstracts> availableProducts = new ArrayList<>();
        for (ProductoAbstracts productoAbstracts: obtainAlimentosList()){
            Alimento alimento = (Alimento) productoAbstracts;
            if (!alimento.isProductExpired()){
                availableProducts.add(alimento);
            }
        }
        availableProducts.addAll(obtainAparatosList());
        availableProducts.addAll(obtainCuidadosPersonalesList());
        availableProducts.addAll(obtainSouvernirsList().values());
        return availableProducts;
    }

    /**
     * Method to obtain the size of the list of food
     * @return the size of the list
     */
    public int lengthAlimentoList(){
        return obtainAlimentosList().size();
    }

    /**
     * Method to obtain the size of the list of items
     * @return the size of the list
     */
    public int lengthAparatosList(){
        return obtainAparatosList().size();
    }
    /**
     * Method to obtain the size of the list of souvenirs
     * @return the size of the list
     */
    public int lengthSouvenirsList(){
        return obtainSouvernirsList().size();
    }
    /**
     * Method to obtain the size of the list of self-care items
     * @return the size of the list
     */
    public int lengthCuidadosList(){
        return obtainCuidadosPersonalesList().size();
    }
    /**
     * Method to obtain the size of the list of products
     * @return the size of the list
     */
    public int lengthAllProductsList(){
        return obtainProducts().size();
    }
}

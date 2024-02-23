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
    private FileCSV fileCSV;
    private List<ProductoAbstracts> productoAbstractsList;

    /**
     * Constructors of the class
     */
    public TiendaNegocio(){
        this.fileCSV = new FileCSV();
        this.productoAbstractsList = new ArrayList<>();
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

    /**
     * Method toString
     */
    @Override
    public String toString() {
        return "TiendaNegocio{" +
                "fileCSV=" + fileCSV +
                ", productoAbstractsList=" + productoAbstractsList +
                '}';
    }

    public List<ProductoAbstracts> obtainAlimentosList() {
        return new ArrayList<>(fileCSV.obtainAlimentos());
    }
    public List<ProductoAbstracts> obtainAparatosList() {
        return new ArrayList<>(fileCSV.obtainAparatos());
    }
    public List<ProductoAbstracts> obtainCuidadosPersonalesList() {
        return new ArrayList<>(fileCSV.obtainCuidadosPersonales());
    }
    public List<ProductoAbstracts> obtainSouvernirsList() {
        return new ArrayList<>(fileCSV.obtainSouvenirs());
    }


    /**
     * Auxiliar method to obtain the full list of products
     * @return the full list of products
     */
    public List<ProductoAbstracts> obtainProducts() {
        List<ProductoAbstracts> allProductsList = new ArrayList<>();
        allProductsList.addAll(obtainAlimentosList());
        allProductsList.addAll(obtainAparatosList());
        allProductsList.addAll(obtainCuidadosPersonalesList());
        allProductsList.addAll(obtainSouvernirsList());
        return allProductsList;
    }

    /**
     * Method to obtain a certains product
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
            return false;
        }
        return obtainProducts().add(productoAbstracts);
    }

    /**
     * Method to remove a product of the list
     * @param productoAbstracts to remove
     * @return true if product is removed, false if list is null or product does not exist in it
     */
    public boolean removeProducts(ProductoAbstracts productoAbstracts){
        if (productoAbstractsList == null ||
                !productoAbstractsList.contains(productoAbstracts)){
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

    public Float totalPriceFromAparatos(){
        float sum=0f;
        for (ProductoAbstracts productoAbstracts : obtainAparatosList()){
            Aparato aparato = (Aparato) productoAbstracts;
            sum += aparato.maxPrice();
        }
        return sum;
    }

    public Float totalPriceFromCuidadoPersonal(){
        float sum=0f;
        for (ProductoAbstracts productoAbstracts : obtainCuidadosPersonalesList()){
            CuidadoPersonal cuidadoPersonal = (CuidadoPersonal) productoAbstracts;
            sum += cuidadoPersonal.maxPrice();
        }
        return sum;
    }

    public Float totalPriceFromSouvenirs() {
        float sum = 0f;
        for (ProductoAbstracts productoAbstracts : obtainSouvernirsList()) {
            if (productoAbstracts instanceof Souvenir) {
                Souvenir souvenir = (Souvenir) productoAbstracts;
                sum += souvenir.maxPrice();
            }
        }
        return sum;
    }

        /**
         * Method to calculate the total earning of teh shop
         * @return a float with the total
         */
        public float totalEarning () {
            float sumEarning = 0f;
            float sumNormal = 0f;


            return sumEarning - sumNormal;
        }
    }


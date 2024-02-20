package es.ies.puerto.negocio;

import es.ies.puerto.modelo.impl.Alimento;
import es.ies.puerto.modelo.impl.Aparato;
import es.ies.puerto.modelo.impl.CuidadoPersonal;
import es.ies.puerto.modelo.impl.Souvenir;

import java.text.ParseException;
import java.util.*;

public class Tienda {
    private HashSet <Alimento> alimentoHashSet;
    private List <Aparato> aparatoList;
    private HashMap <String, Souvenir> souvenirHashMap;
    private List<CuidadoPersonal> cuidadoPersonalList;

    /**
     * Constructors of the class
     */
    public Tienda (){
        this.alimentoHashSet = new HashSet<>();
        this.aparatoList = new ArrayList<>();
        this.cuidadoPersonalList = new ArrayList<>();
        this.souvenirHashMap = new HashMap<>();
    }

    public Tienda(HashSet<Alimento> alimentoHashSet, List<Aparato> aparatoList, HashMap<String,
            Souvenir> souvenirHashMap, List<CuidadoPersonal> cuidadoPersonalList) {
        this.alimentoHashSet = alimentoHashSet;
        this.aparatoList = aparatoList;
        this.souvenirHashMap = souvenirHashMap;
        this.cuidadoPersonalList = cuidadoPersonalList;
    }

    /**
     * Getters and setters
     */

    public HashSet<Alimento> getAlimentoHashSet() {
        return alimentoHashSet;
    }

    public void setAlimentoHashSet(HashSet<Alimento> alimentoHashSet) {
        this.alimentoHashSet = alimentoHashSet;
    }

    public List<Aparato> getAparatoList() {
        return aparatoList;
    }

    public void setAparatoList(List<Aparato> aparatoList) {
        this.aparatoList = aparatoList;
    }

    public HashMap<String, Souvenir> getSouvenirHashMap() {
        return souvenirHashMap;
    }

    public void setSouvenirHashMap(HashMap<String, Souvenir> souvenirHashMap) {
        this.souvenirHashMap = souvenirHashMap;
    }

    public List<CuidadoPersonal> getCuidadoPersonalList() {
        return cuidadoPersonalList;
    }

    public void setCuidadoPersonalList(List<CuidadoPersonal> cuidadoPersonalList) {
        this.cuidadoPersonalList = cuidadoPersonalList;
    }

    /**
     * Method toString
     */
    @Override
    public String toString() {
        return "Tienda{" +
                "alimentoHashSet=" + alimentoHashSet +
                ", aparatoList=" + aparatoList +
                ", souvenirHashMap=" + souvenirHashMap +
                ", cuidadoPersonalList=" + cuidadoPersonalList +
                '}';
    }

    public boolean addAlimento(Alimento alimento) {
        if (alimentoHashSet.contains(alimento)){
            return false;
        }
        return alimentoHashSet.add(alimento);
    }

    public boolean removeAlimento(Alimento alimento){
        if (alimentoHashSet == null || !alimentoHashSet.contains(alimento)){
            return false;
        }
        return alimentoHashSet.remove(alimento);
    }

    public Alimento obtainAlimento(String udi){
        for (Alimento alimento : alimentoHashSet){
            if (alimento.getUdi().equals(udi)){
                return alimento;
            }
        }
        return null;
    }

    public boolean addAparato (Aparato aparato){
        if (aparatoList.contains(aparato)){
            return false;
        }
        return addAparato(aparato);
    }

    public boolean removeAparato(Aparato aparato){
        if (aparatoList == null || !aparatoList.contains(aparato)){
            return false;
        }
        return aparatoList.remove(aparato);
    }

    public Aparato obtainAparato(String udi){
        for (Aparato aparato : aparatoList){
            if (aparato.getUdi().equals(udi)){
                return aparato;
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

    public boolean removeSouvenir(Souvenir souvenir){
        if (souvenirHashMap.containsKey(souvenir.getUdi())){
            souvenirHashMap.remove(souvenir.getUdi(), souvenir);
            return true;
        }
        return false;
    }
    public Souvenir obtainSouvenir(String udi){
        for (Souvenir souvenir : souvenirHashMap.values()){
            if (souvenir.getUdi().equals(udi)){
                return souvenir;
            }
        }
        return null;
    }

    public boolean addCuidadoPersonal (CuidadoPersonal cuidadoPersonal){
        if (cuidadoPersonalList.contains(cuidadoPersonal)){
            return false;
        }
        return cuidadoPersonalList.add(cuidadoPersonal);
    }

    public boolean removeCuidadoPersonal(CuidadoPersonal cuidadoPersonal){
        if (cuidadoPersonalList == null || !cuidadoPersonalList.contains(cuidadoPersonal)){
            return false;
        }
        return cuidadoPersonalList.remove(cuidadoPersonal);
    }
    public CuidadoPersonal obtainCuidadoPersonal(String udi){
        for (CuidadoPersonal cuidadoPersonal : cuidadoPersonalList){
            if (cuidadoPersonal.getUdi().equals(udi)){
                return cuidadoPersonal;
            }
        }
        return null;
    }

    /**
     * Method to calculate the total price of each type of products
     * @return a list of floats with the total price of each type of products
     * @throws ParseException if dateformat is incorrect
     */
    public List<Float> totalOfEachProduct() throws ParseException {
        return new ArrayList<>(Arrays.asList(totalPriceFromAlimentos(), totalPriceFromAparatos(),
                totalPriceFromCuidadoPersonal(), totalPriceFromSouvenirs()));
    }

    public Float totalPriceFromAlimentos() throws ParseException {
        float sum = 0f;
        for (Alimento alimento : alimentoHashSet){
            if (!alimento.isProductExpired()){
                sum += alimento.getPrice();
            }
        }
        return sum;
    }

    public Float totalPriceFromAparatos(){
        float sum=0f;
        for (Aparato aparato : aparatoList){
            sum+= aparato.getPrice();
        }
        return sum;
    }

    public Float totalPriceFromCuidadoPersonal(){
        float sum=0f;
        for (CuidadoPersonal cuidadoPersonal : cuidadoPersonalList){
            sum+= cuidadoPersonal.getPrice();
        }
        return sum;
    }

    public Float totalPriceFromSouvenirs(){
        float sum=0f;
        for (Souvenir souvenir : souvenirHashMap.values()){
            sum+= souvenir.getPrice();
        }
        return sum;
    }
    /**
     * Methods to calculate the total earning for each type
     * @return a float with the total earning for each type
     */
    public Float totalEarningAlimentos(){
        float sumEarning = 0f;
        float sumNormal = 0f;
        for (Alimento alimento : alimentoHashSet){
               sumNormal += alimento.getPrice();
               sumEarning += alimento.maxPrice();
        }
        return sumEarning - sumNormal;
    }

    public Float totalEarningAparatos(){
        float sumEarning = 0f;
        float sumNormal = 0f;
        for (Aparato aparato : aparatoList){
            sumNormal += aparato.getPrice();
            sumEarning += aparato.maxPrice();
        }
        return sumEarning - sumNormal;
    }
    public Float totalEarningCuidadoPersonal(){
        float sumEarning = 0f;
        float sumNormal = 0f;
        for (CuidadoPersonal cuidadoPersonal : cuidadoPersonalList){
            sumNormal += cuidadoPersonal.getPrice();
            sumEarning += cuidadoPersonal.maxPrice();
        }
        return sumEarning - sumNormal;
    }

    public Float totalEarningSouvenirs(){
        float sumEarning = 0f;
        float sumNormal = 0f;
        for (Souvenir souvenir : souvenirHashMap.values()){
            sumNormal += souvenir.getPrice();
            sumEarning += souvenir.maxPrice();
        }
        return sumEarning - sumNormal;
    }

    /**
     * Method to calculate the total earning of teh shop
     * @return a float with the total
     */
    public float totalEarning (){
        return totalEarningAlimentos() + totalEarningAparatos() + totalEarningSouvenirs()
                + totalEarningCuidadoPersonal();
    }
}

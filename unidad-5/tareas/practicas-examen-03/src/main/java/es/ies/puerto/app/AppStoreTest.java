package es.ies.puerto.app;

import es.ies.puerto.impl.Electronic;
import es.ies.puerto.impl.Food;
import es.ies.puerto.impl.Souvenir;
import es.ies.puerto.impl.Supermarket;

import java.text.ParseException;
import java.util.*;

public class AppStoreTest {
    public static void main(String[] args) throws ParseException {
        gettersSettersTest();
        addTest();
        removeTest();
        searchTest();
        priceTest();
        System.out.println(supermarket.obtainExpiredFood()+"\n");
    }

    public static void gettersSettersTest (){
        supermarket.setFoodHashSet(new HashSet<>(Arrays.asList(Food4, Food5, Food6)));
        supermarket.setElectronicList( new ArrayList<>(Arrays.asList(Electronic4, Electronic5, Electronic6)));
        supermarket.setSouvenirHashMap(new HashMap<String, Souvenir>() {{
            put(souvenir4.getUdi(), souvenir4);
            put(souvenir5.getUdi(), souvenir5);
            put(souvenir6.getUdi(), souvenir6);
        }});

        System.out.println(supermarket.getFoodHashSet()+"\n");
        System.out.println(supermarket.getElectronicList()+"\n");
        System.out.println(supermarket.getSouvenirHashMap()+"\n");
    }

    public static void  addTest (){
        System.out.println(supermarket.addFood(Food1)+"\n");
        System.out.println(supermarket.addElectronic(Electronic1)+"\n");
        System.out.println(supermarket.addSouvenir(souvenir1)+"\n");
    }

    public static void removeTest(){
        System.out.println(supermarket.removeFood(Food1)+"\n");
        System.out.println(supermarket.removeElectronic(Electronic1)+"\n");
        System.out.println(supermarket.removeSouvenir(souvenir1)+"\n");
    }

    public static void searchTest(){
        System.out.println(supermarket.searchFood(Food2.getUdi())+"\n");
        System.out.println(supermarket.searchElectronic(Electronic2.getUdi())+"\n");
        System.out.println(supermarket.searchSouvenir(souvenir2.getUdi())+"\n");
    }

    public static void priceTest(){
        System.out.println(supermarket.foodPrice()+"\n");
        System.out.println(supermarket.electronicsPrice()+"\n");
        System.out.println(supermarket.souvenirsPrice()+"\n");
        System.out.println(supermarket.productsPrice()+"\n");
    }
    static Food Food1 = new Food("Food1",2.50f,"2024-01-01","udi1");
    static Food Food2 = new Food("Food2",3.50f,"2024-01-02","udi2");
    static Food Food3 = new Food("Food3",4.50f,"2024-01-03","udi3");
    static Food Food4 = new Food("Food4",2.50f,"2024-01-01","udi4");
    static Food Food5 = new Food("Food5",3.50f,"2024-01-02","udi5");
    static Food Food6 = new Food("Food6",4.50f,"2024-01-03","udi6");
    static Electronic Electronic1 = new Electronic("Electronico1", 500.00f, "2022-02-01",
            "udi1");
    static Electronic Electronic2 = new Electronic("Electronico1", 501.00f, "2022-02-02",
            "udi2");
    static Electronic Electronic3 = new Electronic("Electronico1", 502.00f, "2022-02-03",
            "udi3");
    static Electronic Electronic4 = new Electronic("Electronico1", 503.00f, "2022-02-04",
            "udi4");
    static Electronic Electronic5 = new Electronic("Electronico1", 504.00f, "2022-02-05",
            "udi5");
    static Electronic Electronic6 = new Electronic("Electronico1", 505.00f, "2022-02-06",
            "udi6");
    static Souvenir souvenir1 = new Souvenir("Soubenir1", 10.00f, "2022-03-01", "udi");
    static Souvenir souvenir2 = new Souvenir("Soubenir2", 11.00f, "2022-03-02", "udi1");
    static Souvenir souvenir3 = new Souvenir("Soubenir3", 12.00f, "2022-03-03", "udi2");
    static Souvenir souvenir4 = new Souvenir("Soubenir4", 13.00f, "2022-03-04", "udi3");
    static  Souvenir souvenir5 = new Souvenir("Soubenir5", 14.00f, "2022-03-05", "udi4");
    static Souvenir souvenir6 = new Souvenir("Soubenir6", 15.00f, "2022-03-06", "udi5");
    static Supermarket supermarket = new Supermarket(
            new HashSet<>(Arrays.asList(Food1, Food2, Food3)),
            new ArrayList<>(Arrays.asList(Electronic1, Electronic2, Electronic3)),
            new HashMap<String, Souvenir>() {{
                put(souvenir1.getUdi(), souvenir1);
                put(souvenir2.getUdi(), souvenir2);
                put(souvenir3.getUdi(), souvenir3);
            }}
    );
}

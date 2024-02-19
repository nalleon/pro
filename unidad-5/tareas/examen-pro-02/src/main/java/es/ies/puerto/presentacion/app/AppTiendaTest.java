package es.ies.puerto.presentacion.app;

import es.ies.puerto.impl.*;
import es.ies.puerto.modelo.impl.*;
import es.ies.puerto.negocio.Tienda;

import java.text.ParseException;
import java.util.*;

public class AppTiendaTest {

    public static void main(String[] args) throws ParseException {
     setGetTest();
     addTest();
     removeTest();
     searchTest();
     totalPriceTest();
     totalEarningTest();
    }

    public static void setGetTest(){
        tienda.setAlimentoHashSet(new HashSet<>(Arrays.asList(alimento1, alimento2, alimento3)));
        tienda.setAparatoList(new ArrayList<>(Arrays.asList(aparato1,aparato2,aparato3)));
        tienda.setCuidadoPersonalList(new ArrayList<>(Arrays.asList(cuidadoPersonal1, cuidadoPersonal2
                ,cuidadoPersonal3)));

        souvenirHashMap.put(souvenir1.getUdi(), souvenir1);
        souvenirHashMap.put(souvenir2.getUdi(), souvenir2);
        souvenirHashMap.put(souvenir3.getUdi(), souvenir3);

        tienda.setSouvenirHashMap(souvenirHashMap);

        System.out.println(tienda.getAlimentoHashSet());
        System.out.println(tienda.getAparatoList());
        System.out.println(tienda.getSouvenirHashMap());
        System.out.println(tienda.getCuidadoPersonalList());
    }

    public static void addTest (){
        System.out.println(tienda.addAlimento(alimento1));
        System.out.println(tienda.addSouvenir(souvenir1));
        System.out.println(tienda.addAparato(aparato1));
        System.out.println(tienda.addCuidadoPersonal(cuidadoPersonal1));
    }

    public static void removeTest(){
        System.out.println(tienda.removeAlimento(alimento1));
        System.out.println(tienda.removeAparato(aparato1));
        System.out.println(tienda.removeSouvenir(souvenir1));
        System.out.println(tienda.removeCuidadoPersonal(cuidadoPersonal1));
    }

    public static void searchTest(){
        System.out.println(tienda.obtainAlimento(alimento2.getUdi()));
        System.out.println(tienda.obtainAparato(aparato2.getUdi()));
        System.out.println(tienda.obtainSouvenir(souvenir2.getUdi()));
        System.out.println(tienda.obtainCuidadoPersonal(cuidadoPersonal2.getUdi()));
    }

    public static void totalPriceTest() throws ParseException {
        System.out.println(tienda.totalPriceFromAlimentos());
        System.out.println(tienda.totalPriceFromAparatos());
        System.out.println(tienda.totalPriceFromSouvenirs());
        System.out.println(tienda.totalPriceFromCuidadoPersonal());
        System.out.println(tienda.totalOfEachProduct());
    }

    public static void totalEarningTest(){
        System.out.println(tienda.totalEarningAlimentos());
        System.out.println(tienda.totalEarningAparatos());
        System.out.println(tienda.totalEarningSouvenirs());
        System.out.println(tienda.totalEarningCuidadoPersonal());
        System.out.println(tienda.totalEarning());
    }
    static Alimento alimento1 = new Alimento("Manzanas",2.50f,"2024-01-09","ALM001",
            "2024-01-15");
    static Alimento alimento2 = new Alimento("Leche",1.99f,"2024-02-09","ALM002",
            "2024-02-14");
    static Alimento alimento3 = new Alimento("Arroz",3.75f,"2024-01-15","ALM003",
            "2024-01-27");
    static Aparato aparato1 = new Aparato("Televisor LED",499.99f,"2024-02-09","APA001");
    static  Aparato aparato2 = new Aparato("Smartphone",799.99f,"2024-02-09","APA002");
    static  Aparato aparato3 = new Aparato("Cafetera",39.99f,"2024-02-09","APA003");

    static Souvenir souvenir1 = new Souvenir("Imán de nevera",1.99f,"2024-02-09","SOU001");
    static Souvenir souvenir2 = new Souvenir("Llavero",0.99f,"2024-02-09","SOU002");
    static Souvenir souvenir3 = new Souvenir("Taza de cafe",3.49f,"2024-02-09","SOU003");

    static CuidadoPersonal cuidadoPersonal1 = new CuidadoPersonal("Champú",3.99f,"2024-02-09",
            "CUI001", 7);
    static CuidadoPersonal cuidadoPersonal2 = new CuidadoPersonal("Crema hidratante",5.49f,
            "2024-02-09", "CUI002",8);

    static CuidadoPersonal cuidadoPersonal3 = new CuidadoPersonal("Cepillo de dientes",2.29f,
            "2024-02-09", "CUI003",6);
    static HashSet<Alimento> alimentoHashSet;
    static List<Aparato> aparatoList = new ArrayList<>(Arrays.asList(aparato1,aparato2,aparato3));
    static HashMap<String, Souvenir> souvenirHashMap = new HashMap<>();
    public static void addHashMap(){
        souvenirHashMap.put(souvenir1.getUdi(), souvenir1);
        souvenirHashMap.put(souvenir2.getUdi(), souvenir2);
        souvenirHashMap.put(souvenir3.getUdi(), souvenir3);
    }
    static List<CuidadoPersonal> cuidadoPersonalList = new ArrayList<>(Arrays.asList(cuidadoPersonal1, cuidadoPersonal2
    ,cuidadoPersonal3));
    static Tienda tienda = new Tienda(alimentoHashSet, aparatoList, souvenirHashMap,cuidadoPersonalList);

}

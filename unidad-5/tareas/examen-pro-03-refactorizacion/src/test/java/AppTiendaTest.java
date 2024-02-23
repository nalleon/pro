import es.ies.puerto.modelo.impl.Alimento;
import es.ies.puerto.modelo.impl.Aparato;
import es.ies.puerto.modelo.impl.CuidadoPersonal;
import es.ies.puerto.modelo.impl.Souvenir;
import es.ies.puerto.negocio.TiendaNegocio;
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
        tiendaNegocio.setAlimentoHashSet(new HashSet<>(Arrays.asList(alimento1, alimento2, alimento3)));
        tiendaNegocio.setAparatoList(new ArrayList<>(Arrays.asList(aparato1,aparato2,aparato3)));
        tiendaNegocio.setCuidadoPersonalList(new ArrayList<>(Arrays.asList(cuidadoPersonal1, cuidadoPersonal2
                ,cuidadoPersonal3)));

        souvenirHashMap.put(souvenir1.getUdi(), souvenir1);
        souvenirHashMap.put(souvenir2.getUdi(), souvenir2);
        souvenirHashMap.put(souvenir3.getUdi(), souvenir3);

        tiendaNegocio.setSouvenirHashMap(souvenirHashMap);

        addHashMap();
        System.out.println(tiendaNegocio.getAlimentoHashSet());
        System.out.println(tiendaNegocio.getAparatoList());
        System.out.println(tiendaNegocio.getSouvenirHashMap());
        System.out.println(tiendaNegocio.getCuidadoPersonalList());
    }

    public static void addTest (){
        System.out.println(tiendaNegocio.addAlimento(alimento1));
        System.out.println(tiendaNegocio.addSouvenir(souvenir1));
        System.out.println(tiendaNegocio.addAparato(aparato1));
        System.out.println(tiendaNegocio.addCuidadoPersonal(cuidadoPersonal1));
    }

    public static void removeTest(){
        System.out.println(tiendaNegocio.removeAlimento(alimento1));
        System.out.println(tiendaNegocio.removeAparato(aparato1));
        System.out.println(tiendaNegocio.removeSouvenir(souvenir1));
        System.out.println(tiendaNegocio.removeCuidadoPersonal(cuidadoPersonal1));
    }

    public static void searchTest(){
        System.out.println(tiendaNegocio.obtainAlimento(alimento2.getUdi()));
        System.out.println(tiendaNegocio.obtainAparato(aparato2.getUdi()));
        System.out.println(tiendaNegocio.obtainSouvenir(souvenir2.getUdi()));
        System.out.println(tiendaNegocio.obtainCuidadoPersonal(cuidadoPersonal2.getUdi()));
    }

    public static void totalPriceTest() throws ParseException {
        System.out.println(tiendaNegocio.totalPriceFromAlimentos());
        System.out.println(tiendaNegocio.totalPriceFromAparatos());
        System.out.println(tiendaNegocio.totalPriceFromSouvenirs());
        System.out.println(tiendaNegocio.totalPriceFromCuidadoPersonal());
        System.out.println(tiendaNegocio.totalOfEachProduct());
    }

    public static void totalEarningTest(){
        System.out.println(tiendaNegocio.totalEarningAlimentos());
        System.out.println(tiendaNegocio.totalEarningAparatos());
        System.out.println(tiendaNegocio.totalEarningSouvenirs());
        System.out.println(tiendaNegocio.totalEarningCuidadoPersonal());
        System.out.println(tiendaNegocio.totalEarning());
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
    static TiendaNegocio tiendaNegocio = new TiendaNegocio(alimentoHashSet, aparatoList, souvenirHashMap,cuidadoPersonalList);

}

package es.ies.puerto.presentacion.app;
import es.ies.puerto.modelo.abstracts.ProductoAbstracts;
import es.ies.puerto.modelo.fichero.csv.implementation.FileCSV;
import es.ies.puerto.modelo.impl.Alimento;
import es.ies.puerto.modelo.impl.Aparato;
import es.ies.puerto.modelo.impl.CuidadoPersonal;
import es.ies.puerto.modelo.impl.Souvenir;
import es.ies.puerto.negocio.TiendaNegocio;

import java.util.*;
public class AppTienda {
    static ProductoAbstracts productoAbstracts;
    static TiendaNegocio tiendaNegocio = new (alimentoHashSet, aparatoList, souvenirHashMap,cuidadoPersonalList,
    productoAbstractsList, fileCSV);

    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("***********************************\n" +
                "* Welcome! What would you do?\n" +
                "* 1. Add a Product\n" +
                "* 2. Remove a Product\n" +
                "* 3. Modify a Product\n" +
                "* 4. Show a Product\n" +
                "***********************************\n");
        int answer = scanner.nextInt();

        switch (answer){
            case 1:
                addProdructMenu();
                break;
            case 2:
                removeProductMenu();
                break;
            case 3:
                modifyProdructMenu();
                break;
            case 4:
                showProdructMenu();
                break;
            default:
                System.out.println("Incorrect option. Type a valid one (1,2,3,4)");
        }
    }

    public static void addProdructMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("***********************************\n" +
                "* What will you add?\n" +
                "* 1. Food\n" +
                "* 2. Objects\n" +
                "* 3. Self-care product\n" +
                "* 4. Souvenir\n" +
                "***********************************\n");
        int answer = scanner.nextInt();

        switch (answer){
            case 1:
                 productoAbstracts = new Alimento(askName(),askPrice(), askDateOfEntrance(),
                         askUDI(), askDateOfExpiration());
                 tiendaNegocio.addProducts(productoAbstracts);
                break;
            case 2:
                productoAbstracts = new Aparato(askName(), askPrice(), askUDI(), askDateOfExpiration());
                tiendaNegocio.addProducts(productoAbstracts);
                break;
            case 3:
                productoAbstracts = new CuidadoPersonal(askName(), askPrice(), askDateOfEntrance(),
                        askUDI(), askPopularity());
                tiendaNegocio.addProducts(productoAbstracts);
                break;
            case 4:
                productoAbstracts = new Souvenir(askName(), askPrice(), askDateOfEntrance(), askUDI());
                tiendaNegocio.addProducts(productoAbstracts);
                break;
            default:
                System.out.println("Incorrect option. Type a valid one (1,2,3,4)");
        }
    }

    public static void removeProductMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("***********************************\n" +
                "* What will you remove?\n" +
                "* 1. Food\n" +
                "* 2. Objects\n" +
                "* 3. Self-care product\n" +
                "* 4. Souvenir\n" +
                "***********************************\n");
        int answer = scanner.nextInt();

        switch (answer){
            case 1:
                Alimento alimento = new Alimento(askName(), askPrice(), askDateOfEntrance(), askUDI(),
                        askDateOfExpiration());
                break;
            case 2:
                Aparato aparato = new Aparato(askName(), askPrice(), askDateOfEntrance(), askUDI());

                break;
            case 3:
                CuidadoPersonal cuidadoPersonal = new CuidadoPersonal(askName(), askPrice(), askDateOfEntrance(),
                        askUDI(), askPopularity());
                break;
            case 4:
                Souvenir souvenir = new Souvenir(askName(), askPrice(), askDateOfEntrance(),
                        askUDI());
                break;
            default:
                System.out.println("Incorrect option. Type a valid one (1,2,3,4)");
        }
    }

    public static void modifyProdructMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("***********************************\n" +
                "* What will you remove?\n" +
                "* 1. Food\n" +
                "* 2. Objects\n" +
                "* 3. Self-care product\n" +
                "* 4. Souvenir\n" +
                "***********************************\n");
        int answer = scanner.nextInt();
        System.out.println("Please, insert the udi value of the item you want to modify: ");
        String udi = askUDI();

        switch (answer){
            case 1:
                Alimento alimento = new Alimento();

                    alimento = new Alimento(askName(), askPrice(), askDateOfEntrance(), udi,
                            askDateOfExpiration());

                break;
            case 2:
                Aparato aparato = new Aparato();


                    aparato = new Aparato(askName(), askPrice(), askDateOfEntrance(), udi);

                break;
            case 3:
                CuidadoPersonal cuidadoPersonal = new CuidadoPersonal();

                    cuidadoPersonal = new CuidadoPersonal(askName(), askPrice(), askDateOfEntrance(), udi,
                            askPopularity());

                break;
            case 4:
                Souvenir souvenir = new Souvenir();

                    souvenir = new Souvenir(askName(), askPrice(), askDateOfEntrance(), udi);

                break;
            default:
                System.out.println("Incorrect option. Type a valid one (1,2,3,4)");
        }
    }

    public static void showProdructMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("***********************************\n" +
                "* What will you show?\n" +
                "* 1. Food\n" +
                "* 2. Objects\n" +
                "* 3. Self-care product\n" +
                "* 4. Souvenir\n" +
                "* 5. All\n" +
                "***********************************\n");
        int answer = scanner.nextInt();
        switch (answer){
            case 1:
                System.out.println(tiendaNegocio);
                break;
            case 2:

                break;
            case 3:

                break;
            case 4:
                break;
            case 5:
                break;
            default:
                System.out.println("Incorrect option. Type a valid one (1,2,3,4,5)");
        }
    }

    public static String askName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name (string): ");
        return scanner.next();
    }

    public static float askPrice(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Price (Float): ");
        return scanner.nextFloat();
    }

    public static String askDateOfEntrance(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Date of entrance (string): ");
        return scanner.next();
    }

    public static String askUDI(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("UDI (string): ");
        return scanner.next();
    }
    public static String askDateOfExpiration(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Date of expiration (string): ");
        return scanner.next();
    }

    public static int askPopularity(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Popularity (int): ");
        return scanner.nextInt();
    }
    /**
     * Initialization of variables
     */
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
    static HashSet<Alimento> alimentoHashSet = new HashSet<>(Arrays.asList(alimento1,alimento2,alimento3));
    static List<Aparato> aparatoList = new ArrayList<>(Arrays.asList(aparato1,aparato2,aparato3));
    static HashMap<String, Souvenir> souvenirHashMap = new HashMap<String, Souvenir>() {{
        put(souvenir1.getUdi(), souvenir1);
        put(souvenir2.getUdi(), souvenir2);
        put(souvenir3.getUdi(), souvenir3);
    }};

    static List<CuidadoPersonal> cuidadoPersonalList = new ArrayList<>(Arrays.asList(cuidadoPersonal1, cuidadoPersonal2
            ,cuidadoPersonal3));

    static FileCSV fileCSV = new FileCSV();
    static  List<ProductoAbstracts> productoAbstractsList = new ArrayList<>();

}


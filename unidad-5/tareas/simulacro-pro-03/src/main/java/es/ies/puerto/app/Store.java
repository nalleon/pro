package es.ies.puerto.app;

import es.ies.puerto.impl.Aliment;
import es.ies.puerto.impl.Electronics;
import es.ies.puerto.impl.Souvenir;
import es.ies.puerto.impl.SuperMarket;

import java.text.ParseException;
import java.util.HashSet;
import java.util.Scanner;

public class Store {

    static SuperMarket superMarket = new SuperMarket();

    public static void main(String[] args) throws ParseException {
        addAliments();
        addElectronic();
        addSouvenirs();

        menu();
    }

    public static void addAliments (){
        Aliment aliment1 = new Aliment("Alimento1",2.50f,"2024-01-01","udi1");
        Aliment aliment2 = new Aliment("Alimento2",3.50f,"2024-01-02","udi2");
        Aliment aliment3 = new Aliment("Alimento3",4.50f,"2024-01-03","udi3");
        Aliment aliment4 = new Aliment("Alimento4",5.50f,"2024-01-04","udi4");
        Aliment aliment5 = new Aliment("Alimento5",6.50f,"2024-01-05","udi5");
        Aliment aliment6 = new Aliment("Alimento5",7.50f,"2024-01-06","udi6");
        Aliment aliment7 = new Aliment("Alimento5",8.50f,"2024-01-07","udi7");
        Aliment aliment8 = new Aliment("Alimento5",9.50f,"2024-01-08","udi8");
        Aliment aliment9 = new Aliment("Alimento5",10.50f,"2024-01-09","udi9");
        Aliment aliment10 = new Aliment("Alimento5",11.50f,"2024-01-10","udi10");

        superMarket.addAliment(aliment1);
        superMarket.addAliment(aliment2);
        superMarket.addAliment(aliment3);
        superMarket.addAliment(aliment4);
        superMarket.addAliment(aliment5);
        superMarket.addAliment(aliment6);
        superMarket.addAliment(aliment7);
        superMarket.addAliment(aliment8);
        superMarket.addAliment(aliment9);
        superMarket.addAliment(aliment10);
    }

    public static void addElectronic (){
     Electronics electronics1 = new Electronics("Electronico1", 500.00f, "2022-02-01",
             "udi1");
     Electronics electronics2 = new Electronics("Electronico1", 501.00f, "2022-02-02",
                "udi2");
     Electronics electronics3 = new Electronics("Electronico1", 502.00f, "2022-02-03",
                "udi3");
     Electronics electronics4 = new Electronics("Electronico1", 503.00f, "2022-02-04",
                "udi4");
     Electronics electronics5 = new Electronics("Electronico1", 504.00f, "2022-02-05",
                "udi5");
     Electronics electronics6 = new Electronics("Electronico1", 505.00f, "2022-02-06",
                "udi6");
     Electronics electronics7 = new Electronics("Electronico1", 506.00f, "2022-02-07",
                "udi7");
     Electronics electronics8 = new Electronics("Electronico1", 507.00f, "2022-02-08",
                "udi8");
     Electronics electronics9 = new Electronics("Electronico1", 508.00f, "2022-02-09",
                "udi9");
     Electronics electronics10 = new Electronics("Electronico1", 509.00f, "2022-02-10",
                "udi10");

        superMarket.addElectronic(electronics1);
        superMarket.addElectronic(electronics2);
        superMarket.addElectronic(electronics3);
        superMarket.addElectronic(electronics4);
        superMarket.addElectronic(electronics5);
        superMarket.addElectronic(electronics6);
        superMarket.addElectronic(electronics7);
        superMarket.addElectronic(electronics8);
        superMarket.addElectronic(electronics9);
        superMarket.addElectronic(electronics10);
    }

    public static void addSouvenirs (){
        Souvenir souvenir1 = new Souvenir("Soubenir1", 10.00f, "2022-03-01", "udi");
        Souvenir souvenir2 = new Souvenir("Soubenir2", 11.00f, "2022-03-02", "udi1");
        Souvenir souvenir3 = new Souvenir("Soubenir3", 12.00f, "2022-03-03", "udi2");
        Souvenir souvenir4 = new Souvenir("Soubenir4", 13.00f, "2022-03-04", "udi3");
        Souvenir souvenir5 = new Souvenir("Soubenir5", 14.00f, "2022-03-05", "udi4");
        Souvenir souvenir6 = new Souvenir("Soubenir6", 15.00f, "2022-03-06", "udi5");
        Souvenir souvenir7 = new Souvenir("Soubenir7", 16.00f, "2022-03-07", "udi6");
        Souvenir souvenir8 = new Souvenir("Soubenir8", 17.00f, "2022-03-08", "udi7");
        Souvenir souvenir9 = new Souvenir("Soubenir9", 18.00f, "2022-03-09", "udi8");
        Souvenir souvenir10 = new Souvenir("Soubenir19", 19.00f, "2022-03-10", "udi9");



        superMarket.addSouvenir(souvenir1);
        superMarket.addSouvenir(souvenir2);
        superMarket.addSouvenir(souvenir3);
        superMarket.addSouvenir(souvenir4);
        superMarket.addSouvenir(souvenir5);
        superMarket.addSouvenir(souvenir6);
        superMarket.addSouvenir(souvenir7);
        superMarket.addSouvenir(souvenir8);
        superMarket.addSouvenir(souvenir9);
        superMarket.addSouvenir(souvenir10);
    }

    public static void menu () throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "*************************\n" +
                "* Welcome. What would you do?\n" +
                "* 1. Add a product\n" +
                "* 2. Show a product\n" +
                "* 3. Remove a product\n" +
                "*************************\n");

        int answer = scanner.nextInt();

        switch (answer){
            case 1:
                addProductMenu();
                break;
            case 2:
                showProductMenu();
                break;
            case 3:
                removeProductMenu();
                break;
            case 4:
                modifyProductMenu();
                break;
        }
    }

    public static void addProductMenu () {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "*************************\n" +
                "* Which type would you add?\n" +
                "* 1. Aliment\n" +
                "* 2. Electronic\n" +
                "* 3. Souvenir\n" +
                "*************************\n");

        int answer = scanner.nextInt();
        System.out.println("Insert the new data for the product: (name/price/dateEntrance/udi)");
        String name = scanner.next();
        float price = scanner.nextFloat();
        String dateEntrance = scanner.next();
        String udi = scanner.next();

        switch (answer){
            case 1:
                Aliment aliment = new Aliment(name, price, dateEntrance, udi);
                superMarket.addAliment(aliment);
                System.out.println(superMarket.obtainAliment(aliment.getUdi()));
                break;
            case 2:
                Electronics electronics = new Electronics(name, price, dateEntrance, udi);
                superMarket.addElectronic(electronics);
                System.out.println(superMarket.obtainElectronic(electronics.getUdi()));
                break;
            case 3:
                Souvenir souvenir = new Souvenir(name, price, dateEntrance, udi);
                superMarket.addSouvenir(souvenir);
                System.out.println(superMarket.obtainSouvenir(souvenir.getUdi()));
                break;

            default:
                System.out.println("Type a valid option (1,2,3)");
        }
    }

    public static void showProductMenu () throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "*************************\n" +
                "* Which type would you show?\n" +
                "* 1. Aliment\n" +
                "* 2. Electronic\n" +
                "* 3. Souvenir\n" +
                "* 4. Passed Aliments\n" +
                "* 5. All\n" +
                "*************************");

        int answer = scanner.nextInt();

        switch (answer){
            case 1:
                System.out.println(superMarket.getAlimentHash());
                break;
            case 2:
                System.out.println(superMarket.getElectronicsList());
                break;
            case 3:
                System.out.println(superMarket.getSouvenirHashMap());
                break;
            case 4:
                System.out.println(superMarket.obtainPassedAliments());
            case 5:
                System.out.println(superMarket);
                break;
            default:
                System.out.println("Type a valid option (1,2,3,4,5)");
        }

    }
    public static void removeProductMenu (){
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "*************************\n" +
                "* Which type would you remove?\n" +
                "* 1. Aliment\n" +
                "* 2. Electronic\n" +
                "* 3. Souvenir\n"+
                "*************************\n" );

        int answer = scanner.nextInt();
        System.out.println("Insert the new data for the product: (name/price/dateEntrance/udi)");
        String name = scanner.next();
        float price = scanner.nextFloat();
        String dateEntrance = scanner.next();
        String udi = scanner.next();

        switch (answer){
            case 1:
                Aliment aliment = new Aliment(name, price, dateEntrance, udi);
                superMarket.removeAliment(aliment);
                System.out.println(aliment);
                break;
            case 2:
                Electronics electronics = new Electronics(name, price, dateEntrance, udi);
                superMarket.removeElectronic(electronics);
                System.out.println(electronics);
                break;
            case 3:
                Souvenir souvenir = new Souvenir(name, price, dateEntrance, udi);
                superMarket.removeSouvenir(souvenir);
                System.out.println(souvenir);
                break;

            default:
                System.out.println("Type a valid option (1,2,3)");
        }

    }

    public static void modifyProductMenu (){
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "*************************\n" +
                "* Which type would you modify?\n" +
                "* 1. Aliment\n" +
                "* 2. Electronic\n" +
                "* 3. Souvenir\n" +
                "*************************\n");

        int answer = scanner.nextInt();
        System.out.println("Introduce the udi of the product: ");
        String udi = scanner.next();
        System.out.println("Insert the new data for the product: (name/price/dateEntrance)");
        String name = scanner.next();
        float price = scanner.nextFloat();
        String dateEntrance = scanner.next();


        switch (answer){
            case 1:
                superMarket.obtainAliment(udi);
                Aliment aliment = new Aliment(name, price, dateEntrance, udi);
                superMarket.addAliment(aliment);
                System.out.println(aliment);
                break;
            case 2:
                superMarket.obtainElectronic(udi);
                Electronics electronics = new Electronics(name, price, dateEntrance, udi);
                superMarket.addElectronic(electronics);
                System.out.println(electronics);
                break;
            case 3:
                superMarket.obtainSouvenir(udi);
                Souvenir souvenir = new Souvenir(name, price, dateEntrance, udi);
                superMarket.addSouvenir(souvenir);
                System.out.println(souvenir);
                break;

            default:
                System.out.println("Type a valid option (1,2,3)");
        }
    }
}


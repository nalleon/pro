package es.ies.puerto.app;

import es.ies.puerto.abstracts.ProductAbstrac;
import es.ies.puerto.impl.Food;
import es.ies.puerto.impl.Electronic;
import es.ies.puerto.impl.Souvenir;
import es.ies.puerto.impl.Supermarket;

import java.text.ParseException;
import java.util.*;

public class Store {

    static Supermarket Supermarket = new Supermarket();

    public static void main(String[] args) throws ParseException {
        addFoods();
        addElectronic();
        addSouvenirs();

        menu();
    }

    public static void addFoods (){
        Food Food1 = new Food("Food1",2.50f,"2024-01-01","udi1");
        Food Food2 = new Food("Food2",3.50f,"2024-01-02","udi2");
        Food Food3 = new Food("Food3",4.50f,"2024-01-03","udi3");
        Food Food4 = new Food("Food4",5.50f,"2024-01-04","udi4");
        Food Food5 = new Food("Food5",6.50f,"2024-01-05","udi5");
        Food Food6 = new Food("Food5",7.50f,"2024-01-06","udi6");
        Food Food7 = new Food("Food5",8.50f,"2024-01-07","udi7");
        Food Food8 = new Food("Food5",9.50f,"2024-01-08","udi8");
        Food Food9 = new Food("Food5",10.50f,"2024-01-09","udi9");
        Food Food10 = new Food("Food5",11.50f,"2024-01-10","udi10");

        Supermarket.addFood(Food1);
        Supermarket.addFood(Food2);
        Supermarket.addFood(Food3);
        Supermarket.addFood(Food4);
        Supermarket.addFood(Food5);
        Supermarket.addFood(Food6);
        Supermarket.addFood(Food7);
        Supermarket.addFood(Food8);
        Supermarket.addFood(Food9);
        Supermarket.addFood(Food10);
    }

    public static void addElectronic (){
        Electronic Electronic1 = new Electronic("Electronico1", 500.00f, "2022-02-01",
                "udi1");
        Electronic Electronic2 = new Electronic("Electronico1", 501.00f, "2022-02-02",
                "udi2");
        Electronic Electronic3 = new Electronic("Electronico1", 502.00f, "2022-02-03",
                "udi3");
        Electronic Electronic4 = new Electronic("Electronico1", 503.00f, "2022-02-04",
                "udi4");
        Electronic Electronic5 = new Electronic("Electronico1", 504.00f, "2022-02-05",
                "udi5");
        Electronic Electronic6 = new Electronic("Electronico1", 505.00f, "2022-02-06",
                "udi6");
        Electronic Electronic7 = new Electronic("Electronico1", 506.00f, "2022-02-07",
                "udi7");
        Electronic Electronic8 = new Electronic("Electronico1", 507.00f, "2022-02-08",
                "udi8");
        Electronic Electronic9 = new Electronic("Electronico1", 508.00f, "2022-02-09",
                "udi9");
        Electronic Electronic10 = new Electronic("Electronico1", 509.00f, "2022-02-10",
                "udi10");

        Supermarket.addElectronic(Electronic1);
        Supermarket.addElectronic(Electronic2);
        Supermarket.addElectronic(Electronic3);
        Supermarket.addElectronic(Electronic4);
        Supermarket.addElectronic(Electronic5);
        Supermarket.addElectronic(Electronic6);
        Supermarket.addElectronic(Electronic7);
        Supermarket.addElectronic(Electronic8);
        Supermarket.addElectronic(Electronic9);
        Supermarket.addElectronic(Electronic10);
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



        Supermarket.addSouvenir(souvenir1);
        Supermarket.addSouvenir(souvenir2);
        Supermarket.addSouvenir(souvenir3);
        Supermarket.addSouvenir(souvenir4);
        Supermarket.addSouvenir(souvenir5);
        Supermarket.addSouvenir(souvenir6);
        Supermarket.addSouvenir(souvenir7);
        Supermarket.addSouvenir(souvenir8);
        Supermarket.addSouvenir(souvenir9);
        Supermarket.addSouvenir(souvenir10);
    }

    public static void menu () throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                *************************
                * Welcome. What would you do?
                * 1. Add a product
                * 2. Show a product
                * 3. Remove a product
                * 4. Modify a product
                *************************
                """);

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
        System.out.println("""
                *************************
                * Which type would you add?
                * 1. Food
                * 2. Electronic
                * 3. Souvenir
                *************************
                """);

        int answer = scanner.nextInt();

        switch (answer){
            case 1:
                Food food = new Food(auxiliarMethodAskName(), auxiliarMethodAskPrice(), auxiliarMethodAskDate(),
                        auxiliarMethodAskUDI());
                Supermarket.addFood(food);
                System.out.println(food);
                break;
            case 2:
                Electronic electronic = new Electronic(auxiliarMethodAskName(), auxiliarMethodAskPrice(),
                        auxiliarMethodAskDate(), auxiliarMethodAskUDI());
                Supermarket.addElectronic(electronic);
                System.out.println(electronic);
                break;
            case 3:
                Souvenir souvenir = new Souvenir(auxiliarMethodAskName(), auxiliarMethodAskPrice(),
                        auxiliarMethodAskDate(), auxiliarMethodAskUDI());
                Supermarket.addSouvenir(souvenir);
                System.out.println(souvenir);
                break;

            default:
                System.out.println("Type a valid option (1,2,3)");
        }
    }

    public static void showProductMenu () throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                *************************
                * Which type would you show?
                * 1. Food
                * 2. Electronic
                * 3. Souvenir
                * 4. Passed Foods
                * 5. All
                *************************""");

        int answer = scanner.nextInt();

        switch (answer){
            case 1:
                System.out.println(Supermarket.getFoodHashSet());
                break;
            case 2:
                System.out.println(Supermarket.getElectronicList());
                break;
            case 3:
                System.out.println(Supermarket.getSouvenirHashMap());
                break;
            case 4:
                System.out.println(Supermarket.obtainExpiredFood());
            case 5:
                System.out.println(Supermarket);
                break;
            default:
                System.out.println("Type a valid option (1,2,3,4,5)");
        }

    }
    public static void removeProductMenu (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                *************************
                * Which type would you remove?
                * 1. Food
                * 2. Electronic
                * 3. Souvenir
                *************************
                """);

        int answer = scanner.nextInt();

        switch (answer){
            case 1:
                Food Food = new Food(auxiliarMethodAskName(), auxiliarMethodAskPrice(), auxiliarMethodAskDate(),
                        auxiliarMethodAskUDI());
                Supermarket.removeFood(Food);
                System.out.println(Food);
                break;
            case 2:
                Electronic Electronic = new Electronic(auxiliarMethodAskName(), auxiliarMethodAskPrice(),
                        auxiliarMethodAskDate(), auxiliarMethodAskUDI());
                Supermarket.removeElectronic(Electronic);
                System.out.println(Electronic);
                break;
            case 3:
                Souvenir souvenir = new Souvenir(auxiliarMethodAskName(), auxiliarMethodAskPrice(),
                        auxiliarMethodAskDate(), auxiliarMethodAskUDI());
                Supermarket.removeSouvenir(souvenir);
                System.out.println(souvenir);
                break;

            default:
                System.out.println("Type a valid option (1,2,3)");
        }

    }

    public static void modifyProductMenu (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                *************************
                * Which type would you modify?
                * 1. Food
                * 2. Electronic
                * 3. Souvenir
                *************************
                """);

        int answer = scanner.nextInt();
        String udi = auxiliarMethodAskUDI();

        switch (answer){
            case 1:
                Supermarket.searchFood(udi);
                Food Food = new Food(auxiliarMethodAskName(), auxiliarMethodAskPrice(), auxiliarMethodAskDate(), udi);
                Supermarket.addFood(Food);
                System.out.println(Food);
                break;
            case 2:
                Supermarket.searchElectronic(udi);
                Electronic Electronic = new Electronic(auxiliarMethodAskName(), auxiliarMethodAskPrice(),
                        auxiliarMethodAskDate(), udi);
                Supermarket.addElectronic(Electronic);
                System.out.println(Electronic);
                break;
            case 3:
                Supermarket.searchSouvenir(udi);
                Souvenir souvenir = new Souvenir(auxiliarMethodAskName(), auxiliarMethodAskPrice(),
                        auxiliarMethodAskDate(), udi);
                Supermarket.addSouvenir(souvenir);
                System.out.println(souvenir);
                break;

            default:
                System.out.println("Type a valid option (1,2,3)");
        }

    }

    public static String auxiliarMethodAskName (){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert the new data for the product:\n" +
                "Name (string): ");
        return scanner.next();
    }
    public static Float auxiliarMethodAskPrice(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Price (float): ");
        return scanner.nextFloat();
    }
    public static String auxiliarMethodAskDate (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Date of entrance (string, yyyy-MM-dd): ");
        return scanner.next();
    }

    public static String auxiliarMethodAskUDI (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("UDI (string): ");
        return scanner.next();
    }
}


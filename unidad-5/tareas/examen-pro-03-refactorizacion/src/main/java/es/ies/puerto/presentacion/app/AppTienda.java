package es.ies.puerto.presentacion.app;

import es.ies.puerto.modelo.abstracts.ProductoAbstracts;
import es.ies.puerto.modelo.impl.Alimento;
import es.ies.puerto.modelo.impl.Aparato;
import es.ies.puerto.modelo.impl.CuidadoPersonal;
import es.ies.puerto.modelo.impl.Souvenir;
import es.ies.puerto.negocio.TiendaNegocio;

import java.text.ParseException;
import java.util.Scanner;
public class AppTienda {
    static ProductoAbstracts productoAbstracts;
    static TiendaNegocio tiendaNegocio = new TiendaNegocio();

    public static void main(String[] args) throws ParseException {
        tiendaNegocio.obtainProducts();
        menu();

    }

    public static void menu() throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println
                ("***********************************\n" +
                "* Welcome! What would you do?\n" +
                "* 1. Add a Product\n" +
                "* 2. Remove a Product\n" +
                "* 3. Modify a Product\n" +
                "* 4. Show a Product\n" +
                "* 5. Show prices of each section\n" +
                "* 6. Show earning of each section\n" +
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
            case 5:
                priceMenu();
                break;
            case 6:
                earningMenu();
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
                "* 2. Items\n" +
                "* 3. Self-care product\n" +
                "* 4. Souvenir\n" +
                "***********************************\n");
        int answer = scanner.nextInt();

        switch (answer){
            case 1:
                 productoAbstracts = new Alimento(askName(),askPrice(), askDateOfEntrance(),
                         askUDI(), askDateOfExpiration());
                System.out.println(tiendaNegocio.addProducts(productoAbstracts));
                break;
            case 2:
                productoAbstracts = new Aparato(askName(), askPrice(), askUDI(), askDateOfExpiration());
                System.out.println(tiendaNegocio.addProducts(productoAbstracts));
                break;
            case 3:
                productoAbstracts = new CuidadoPersonal(askName(), askPrice(), askDateOfEntrance(),
                        askUDI(), askPopularity());
                System.out.println(tiendaNegocio.addProducts(productoAbstracts));
                break;
            case 4:
                productoAbstracts = new Souvenir(askName(), askPrice(), askDateOfEntrance(), askUDI());
                System.out.println(tiendaNegocio.addProducts(productoAbstracts));
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
                "* 2. Items\n" +
                "* 3. Self-care product\n" +
                "* 4. Souvenir\n" +
                "***********************************\n");
        int answer = scanner.nextInt();

        switch (answer){
            case 1:
                productoAbstracts = new Alimento(askName(), askPrice(), askDateOfEntrance(), askUDI(),
                        askDateOfExpiration());
                System.out.println(tiendaNegocio.removeProducts(productoAbstracts));

                break;
            case 2:
                productoAbstracts = new Aparato(askName(), askPrice(), askDateOfEntrance(), askUDI());
                System.out.println(tiendaNegocio.removeProducts(productoAbstracts));

                break;
            case 3:
                productoAbstracts = new CuidadoPersonal(askName(), askPrice(), askDateOfEntrance(),
                        askUDI(), askPopularity());
                System.out.println(tiendaNegocio.removeProducts(productoAbstracts));

                break;
            case 4:
                productoAbstracts = new Souvenir(askName(), askPrice(), askDateOfEntrance(),
                        askUDI());
                System.out.println(tiendaNegocio.removeProducts(productoAbstracts));

                break;
            default:
                System.out.println("Incorrect option. Type a valid one (1,2,3,4)");
        }
    }

    public static void modifyProdructMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("***********************************\n" +
                "* What will you modify?\n" +
                "* 1. Food\n" +
                "* 2. Items\n" +
                "* 3. Self-care product\n" +
                "* 4. Souvenir\n" +
                "***********************************\n");
        int answer = scanner.nextInt();
        System.out.println("Please, insert the udi value of the item you want to modify: ");
        String udi = askUDI();

        productoAbstracts = tiendaNegocio.obtainCertainProduct(udi);
        if (productoAbstracts != null){
        switch (answer){
            case 1:
                tiendaNegocio.removeProducts(productoAbstracts);
                productoAbstracts = new Alimento(askName(), askPrice(), askDateOfEntrance(), udi,
                            askDateOfExpiration());
                tiendaNegocio.removeProducts(productoAbstracts);
                break;
            case 2:
                tiendaNegocio.removeProducts(productoAbstracts);
                productoAbstracts = new Aparato(askName(), askPrice(), askDateOfEntrance(), udi);
                tiendaNegocio.removeProducts(productoAbstracts);
                break;
            case 3:
                tiendaNegocio.removeProducts(productoAbstracts);
                productoAbstracts = new CuidadoPersonal(askName(), askPrice(), askDateOfEntrance(), udi,
                            askPopularity());
                tiendaNegocio.removeProducts(productoAbstracts);
                break;
            case 4:
                tiendaNegocio.removeProducts(productoAbstracts);
                productoAbstracts = new Souvenir(askName(), askPrice(), askDateOfEntrance(), udi);
                tiendaNegocio.removeProducts(productoAbstracts);
                break;
            default:
                System.out.println("Incorrect option. Type a valid one (1,2,3,4)");
        }
            System.out.println("Product successfully modified!");
        } else {
            System.out.println("The product you want to modify does not exist.");
        }
    }

    public static void showProdructMenu() throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("***********************************\n" +
                "* What will you show?\n" +
                "* 1. Food\n" +
                "* 2. Items\n" +
                "* 3. Self-care product\n" +
                "* 4. Recommended products only\n" +
                "* 5. Souvenir\n" +
                "* 6. All\n" +
                "* 7. Only available products\n" +
                "***********************************\n");
        int answer = scanner.nextInt();
        switch (answer){
            case 1:
                System.out.println(tiendaNegocio.obtainAlimentosList());
                break;
            case 2:
                System.out.println(tiendaNegocio.obtainAparatosList());
                break;
            case 3:
                System.out.println(tiendaNegocio.obtainCuidadosPersonalesList());
                break;
            case 4:
                System.out.println(tiendaNegocio.popularity());
                break;
            case 5:
                System.out.println(tiendaNegocio.obtainSouvernirsList());
                break;
            case 6:
                System.out.println(tiendaNegocio.obtainProducts());
                break;
            case 7:
                System.out.println(tiendaNegocio.showAvailableProducts());
            default:
                System.out.println("Incorrect option. Type a valid one (1,2,3,4,5)");
        }
    }

    public static void priceMenu() throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("***********************************\n" +
                "* What total price do you want to show?\n" +
                "* 1. Food\n" +
                "* 2. Items\n" +
                "* 3. Self-care product\n" +
                "* 4. Souvenir\n" +
                "* 5. All\n" +
                "***********************************\n");
        int answer = scanner.nextInt();
        switch (answer){
            case 1:
                System.out.println(tiendaNegocio.totalPriceFromAlimentos());
                break;
            case 2:
                System.out.println(tiendaNegocio.totalPriceFromAparatos());
                break;
            case 3:
                System.out.println(tiendaNegocio.totalPriceFromCuidadoPersonal());
                break;
            case 4:
                System.out.println(tiendaNegocio.totalPriceFromSouvenirs());
                break;
            case 5:
                System.out.println(tiendaNegocio.totalOfEachProduct());
                break;
            default:
                System.out.println("Incorrect option. Type a valid one (1,2,3,4,5,6)");
        }
    }

    public static void earningMenu() throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("***********************************\n" +
                "* What earning do you want to show?\n" +
                "* 1. Food\n" +
                "* 2. Items\n" +
                "* 3. Self-care product\n" +
                "* 4. Souvenir\n" +
                "* 5. Earnings of the shop\n" +
                "***********************************\n");
        int answer = scanner.nextInt();
        switch (answer){
            case 1:
                System.out.println(tiendaNegocio.totalEarningAlimento());
                break;
            case 2:
                System.out.println(tiendaNegocio.totalEarningAparato());
                break;
            case 3:
                System.out.println(tiendaNegocio.totalEarningCuidadoPersonal());
                break;
            case 4:
                System.out.println(tiendaNegocio.totalEarningSouvenir());
                break;
            case 5:
                System.out.println(tiendaNegocio.totalEarning());
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

}


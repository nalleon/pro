package es.ies.puerto.presentacion.app;

import es.ies.puerto.modelo.impl.Alimento;
import es.ies.puerto.modelo.impl.Aparato;
import es.ies.puerto.modelo.impl.CuidadoPersonal;
import es.ies.puerto.modelo.impl.Souvenir;
import es.ies.puerto.negocio.Tienda;

import java.util.Scanner;

public class AppMenuTienda {

    public static void main(String[] args) {
        menu();
    }
    static Tienda tienda = new Tienda();

    public static void menu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("***********************************\n" +
                "* Welcome! What would you do?\n" +
                "* 1. Add a Product\n" +
                "* 2. Remove a Product\n" +
                "* 3. Modify a Product" +
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
                "* 3. Self-care product" +
                "* 4. Souvenir\n" +
                "***********************************\n");
        int answer = scanner.nextInt();

        switch (answer){
            case 1:
                Alimento alimento = new Alimento(askName(), askPrice(), askDateOfEntrance(), askUDI(),
                        askDateOfExpiration());
                tienda.addAlimento(alimento);
                break;
            case 2:
                Aparato aparato = new Aparato(askName(), askPrice(), askUDI(),
                        askDateOfExpiration());
                tienda.addAparato(aparato);
                break;
            case 3:
                CuidadoPersonal cuidadoPersonal = new CuidadoPersonal(askName(), askPrice(), askDateOfEntrance(),
                        askUDI(), askPopularity());
                tienda.addCuidadoPersonal(cuidadoPersonal);
                break;
            case 4:
                Souvenir souvenir = new Souvenir(askName(), askPrice(), askDateOfEntrance(), askUDI());
                tienda.addSouvenir(souvenir);
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
                "* 3. Self-care product" +
                "* 4. Souvenir\n" +
                "***********************************\n");
        int answer = scanner.nextInt();

        switch (answer){
            case 1:
                Alimento alimento = new Alimento(askName(), askPrice(), askDateOfEntrance(), askUDI(),
                        askDateOfExpiration());
                tienda.removeAlimento(alimento);
                break;
            case 2:
                Aparato aparato = new Aparato(askName(), askPrice(), askDateOfEntrance(), askUDI());
                tienda.removeAparato(aparato);
                break;
            case 3:
                CuidadoPersonal cuidadoPersonal = new CuidadoPersonal(askName(), askPrice(), askDateOfEntrance(),
                        askUDI(), askPopularity());
                tienda.removeCuidadoPersonal(cuidadoPersonal);
                break;
            case 4:
                Souvenir souvenir = new Souvenir(askName(), askPrice(), askDateOfEntrance(),
                        askUDI());
                tienda.removeSouvenir(souvenir);
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
                "* 3. Self-care product" +
                "* 4. Souvenir\n" +
                "***********************************\n");
        int answer = scanner.nextInt();
        System.out.println("Please, insert the udi value of the item you want to modify: ");
        String udi = askUDI();

        switch (answer){
            case 1:
                Alimento alimento = new Alimento();

                if (tienda.obtainAlimento(udi) != null){
                     alimento = new Alimento(askName(), askPrice(), askDateOfEntrance(), udi,
                            askDateOfExpiration());
                        tienda.addAlimento(alimento);
                }
                break;
            case 2:
                Aparato aparato = new Aparato();

                if (tienda.obtainAparato(udi) != null){
                    aparato = new Aparato(askName(), askPrice(), askDateOfEntrance(), udi);
                    tienda.addAparato(aparato);
                }
                break;
            case 3:
                CuidadoPersonal cuidadoPersonal = new CuidadoPersonal();
                if (tienda.obtainCuidadoPersonal(udi) != null){
                    cuidadoPersonal = new CuidadoPersonal(askName(), askPrice(), askDateOfEntrance(), udi,
                            askPopularity());
                    tienda.addCuidadoPersonal(cuidadoPersonal);
                }
                break;
            case 4:
                Souvenir souvenir = new Souvenir();
                if (tienda.obtainSouvenir(udi) != null){
                    souvenir = new Souvenir(askName(), askPrice(), askDateOfEntrance(), udi);
                    tienda.addSouvenir(souvenir);
                }
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
                "* 3. Self-care product" +
                "* 4. Souvenir\n" +
                "* 5. All" +
                "***********************************\n");
        int answer = scanner.nextInt();
        switch (answer){
            case 1:
                System.out.println(tienda.getAlimentoHashSet());
                break;
            case 2:
                System.out.println(tienda.getAparatoList());
                break;
            case 3:
                System.out.println(tienda.getCuidadoPersonalList());
            case 4:
                System.out.println(tienda.getSouvenirHashMap());
            case 5:
                System.out.println(tienda);
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

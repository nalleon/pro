package es.ies.puerto.app;

import es.ies.puerto.vehicles.AuthorisedDealer;

import java.util.Scanner;

public class AppMenuAuthorisedDealer {

    AuthorisedDealer authorisedDealer = new AuthorisedDealer();
    public static void menu (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("***************************\n" +
                "*\n" +
                "*    Choose an option: \n" +
                "*\n" +
                "* 1. Insert vehicle\n" +
                "* 2. Modify a vehicle\n" +
                "* 3. Delete a vehicle\n" +
                "* 4. Show average speed\n" +
                "***************************");
        int result = scanner.nextInt();

        switch (result){
            case 1:

        }


    }


}

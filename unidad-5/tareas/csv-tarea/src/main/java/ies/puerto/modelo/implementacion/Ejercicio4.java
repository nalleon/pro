package ies.puerto.modelo.implementacion;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {
    private boolean[] door;

    /**
     * Default constructor of the class
     */
    public Ejercicio4 (){
        this.door = new boolean[5];
        for (int i =0; i< door.length; i++){
            door[i] = false;
        }
    }

    /**
     * Constructor of the class
     * @param door of the game
     */
    public Ejercicio4 (boolean [] door){
        this.door = door;
    }


    /**
     * Method toString
     */

    @Override
    public String toString() {
        return "Ejercicio4{" +
                "door=" + Arrays.toString(door) +
                '}';
    }


    public int askNum(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What door would you operate with?");
        return scanner.nextInt();
    }
    public void doorActions(String action){
        switch (action){
            case "open":
                    openDoor(askNum());
                break;
            case "close":
                closeDoor(askNum());
                break;
            case "change":
                changeStatusDoor(askNum());
                break;
            case "show":
                showStatusDoor();
                break;
        }
    }

    public String openDoor (int num){
        if (num < 1 || num > door.length){
            return "Door does not exist";
        }
        boolean status = door[num-1] = true;

        return "Door " + num + " is open ("+ status+ ") now";
    }

    public String closeDoor (int num){
        if (num < 1|| num > door.length){
            return "Door does not exist";
        } else if (!door[num - 1]) {
            return "Door is closed at the moment";
        }
        boolean status = door[num-1] = false;
        return "Door " + num + " is closed (" + status +")now";
    }

    public String changeStatusDoor (int num) {
        if (num < 1 || num > door.length) {
            return "Door does not exist";
        }

        if (!door[num - 1]){
            openDoor(num);
        } else {
            closeDoor(num);
        }
        return "Door " + num + " has changed it status to the opposite";
    }

    public String showStatusDoor (){
        return toString();
    }
}

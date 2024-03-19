package es.ies.puerto.listas;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {

    private List<String> userList;

    /**
     * Constructors of the class
     */

    public Ejercicio2 (){
        userList = new ArrayList<>();
    }

    public Ejercicio2(List<String> userList) {
        this.userList = userList;
    }

    /**
     * Getters and setters
     */
    public List<String> getUserList() {
        return userList;
    }

    public void setUserList(List<String> userList) {
        this.userList = userList;
    }

    /**
     * Method to look for a name in a list
     * @param name to check
     * @return true if name is found, false if not
     */
    public boolean nameOnList (String name){
       boolean found = false;

       if (userList == null || userList.isEmpty()){
           return found;
       }
       if (name == null){
           return found;
       }

        for (String str : userList){
            if (str.equals(name)){
                found = true;
                return found;
            }
        }

        return found;
    }

    /**
     * Method to show a message if the name is found
     * @param nameOnList to check
     * @return if false = name was not found, if true = name was found.
     */
    public String message (boolean nameOnList){
        if (!nameOnList){
            return "Name was not found in list";
        }

        return "Name is in list";
    }
}

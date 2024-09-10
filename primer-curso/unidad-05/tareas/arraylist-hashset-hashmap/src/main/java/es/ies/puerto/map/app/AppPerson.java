package es.ies.puerto.map.app;

import es.ies.puerto.map.impl.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AppPerson {

    static HashMap<String, Person> personHashMap;
    static List<Person> personList;
    public static void main(String[] args) {
        personHashMap = new HashMap<>();
        personList = new ArrayList<>();

        Person person1 = new Person("Claus", "12345678P");
        System.out.println(addPersonList(person1));
        addPersonHashMap(person1);
    }


    public static boolean addPersonList (Person person){
        if (!existPersonList(person)){
            return addPersonList(person);
        }
        return false;
    }

    public static boolean existPersonList (Person person){
        if (personList.isEmpty()){
            return false;
        }
        return personList.contains(person);
    }

    public static void addPersonHashMap (Person person){
        if (!existPersonHashMap(person)){
            personHashMap.put(person.getDni(), person);
        }
    }

    public static boolean existPersonHashMap (Person person){
        if (personHashMap.isEmpty()){
            return false;
        }
        return personHashMap.containsKey(person.getDni());
    }
}

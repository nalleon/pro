package es.ies.puerto.model.impl;

import org.simpleframework.xml.Root;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
@Root(name = "personaje")
public class Character {
    int id;
    String name;

     String alias;

     String gender;

     Set<String> powers;


    /**
     * Default constructor of the class
     */
    public Character (){
        powers = new HashSet<>();
    }

    /**
     * Constructor of the class
     * @param id of the character
     */
    public Character (int id){
        this.id = id;
    }


    public Character(int id, String alias, String name, String gender, Set<String> powers) {
        this.id = id;
        this.alias = alias;
        this.name = name;
        this.gender = gender;
        this.powers = powers;
    }


    /**
     * Getter and setters
     */

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Set<String> getPowers() {
        return powers;
    }

    public void setPowers(Set<String> powers) {
        this.powers = powers;
    }

    @Override
    public String toString() {
        return "Character{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", alias='" + alias + '\'' +
                ", gender='" + gender + '\'' +
                ", powers=" + powers +
                '}';
    }

    /**
     * Method toString
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Character character = (Character) o;
        return id == character.id;
    }

    /**
     * Method equals and hashcode
     */
    @Override
    public int hashCode() {
        return Objects.hash(alias);
    }

}

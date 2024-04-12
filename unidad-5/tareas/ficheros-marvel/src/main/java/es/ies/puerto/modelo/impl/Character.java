package es.ies.puerto.modelo.impl;
import es.ies.puerto.modelo.utilidades.Utilities;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
@Root(name = "personaje")
public class Character extends Utilities {
    @Element(name = "nombre")
    String name;
    @Element(name = "alias")
     String alias;
    @Element(name = "genero")
     String gender;
    @ElementList(name = "poderes")
     Set<String> powers;

    /**
     * Default constructor of the class
     */
    public Character (){
        powers = new HashSet<>();
    }

    /**
     * Constructor of the class
     * @param alias of the character
     */
    public Character (String alias){
        this.alias = alias;
    }

    /**
     * Constructor of the class
     * @param name of the character
     * @param alias of the character
     * @param gender of the character
     * @param powers of the character
     */
    public Character(String alias, String name, String gender, Set<String> powers) {
        this.alias = alias;
        this.name = name;
        this.gender = gender;
        this.powers = powers;
    }

    /**
     * Getter and setters
     */
    public String getName() {
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

    /**
     * Method toString
     */
    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", alias='" + alias + '\'' +
                ", gender='" + gender + '\'' +
                ", powers=" + powers +
                '}';
    }

    /**
     * Method equals and hashcode
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Character character = (Character) o;
        return Objects.equals(alias, character.alias);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alias);
    }

    public String toCsv(){
        String powerStr = String.join(", ", powers);
        powerStr = powerStr.replace("\"",  "");

        return name+DELIMITER+alias+DELIMITER+gender+DELIMITER+"\""+powerStr+"\"";
    }
}

package es.ies.puerto.model.impl;
import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
@Entity
@Table(name="Personajes")
public class Character implements Serializable {

    private static final long serialVersionUID = -7250234396452258822L;
    @Id
    @GeneratedValue(generator = "gen_person", strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int characterId;

    @Column(name = "nombre")
    private String name;
    @Column(name = "genero")
    private  String gender;
    /**
     * Cambiar orden de los mapped
     */
    @OneToOne(mappedBy = "character", cascade = CascadeType.ALL)
    private Alias alias;

    @ManyToMany
    @JoinTable(name = "Personajes_Poderes", joinColumns = {
    @JoinColumn(name = "personaje_id",referencedColumnName = "id") },
            inverseJoinColumns = { @JoinColumn(name = "poder_id",referencedColumnName = "id")})
    private Set<Power> powers;


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
        this.characterId = id;
    }

    /**
     * Full constructor of the class
     * @param characterId of the character
     * @param name of the character
     * @param gender of the character
     * @param alias of the character
     * @param powers of the character
     */
    public Character(int characterId, String name, String gender, Alias alias, Set<Power> powers) {
        this.characterId = characterId;
        this.name = name;
        this.gender = gender;
        this.alias = alias;
        this.powers = powers;
    }

    /**
     * Getter and setters
     */
    public int getCharacterId() {
        return characterId;
    }

    public void setCharacterId(int characterId) {
        this.characterId = characterId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Alias getAlias() {
        return alias;
    }

    public void setAlias(Alias alias) {
        this.alias = alias;
    }

    public Set<Power> getPowers() {
        return powers;
    }

    public void setPowers(Set<Power> powers) {
        this.powers = powers;
    }

    /**
     * Method toString
     */
    @Override
    public String toString() {
        return "Character{" +
                "characterId=" + characterId +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", alias=" + alias +
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
        return characterId == character.characterId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(characterId);
    }
}

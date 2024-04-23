package es.ies.puerto.model.impl;

import javax.persistence.*;
import java.util.Objects;
@Entity
@Table(name="Alias")
public class Alias {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int aliasId;
    @JoinColumn(name = "personaje_id")
    @OneToOne()
    private int characterId;
    @Column(name = "alias")
    private String alias;

    /**
     * Default constructor of the class
     */
    public Alias (){}

    /**
     * Constructor of the class
     * @param aliasId of the character's alias
     */
    public Alias(int aliasId) {
        this.aliasId = aliasId;
    }

    /**
     * Constructor of the class
     * @param aliasId of the character's alias
     * @param characterId of the character
     * @param alias
     */
    public Alias(int aliasId, int characterId, String alias) {
        this.aliasId = aliasId;
        this.characterId = characterId;
        this.alias = alias;
    }


    /**
     * Getters and setters
     */
    public int getAliasId() {
        return aliasId;
    }

    public void setAliasId(int aliasId) {
        this.aliasId = aliasId;
    }

    public int getCharacterId() {
        return characterId;
    }

    public void setCharacterId(int characterId) {
        this.characterId = characterId;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * Method toString
     */
    @Override
    public String toString() {
        return "Alias{" +
                "aliasId=" + aliasId +
                ", characterId=" + characterId +
                ", alias='" + alias + '\'' +
                '}';
    }

    /**
     * Method equals and hashcode
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alias alias = (Alias) o;
        return aliasId == alias.aliasId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(aliasId);
    }
}

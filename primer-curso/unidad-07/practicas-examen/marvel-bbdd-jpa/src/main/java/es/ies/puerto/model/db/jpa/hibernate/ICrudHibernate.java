package es.ies.puerto.model.db.jpa.hibernate;

import es.ies.puerto.model.impl.HeroCharacter;

import java.util.List;

public interface ICrudHibernate {
    public List<HeroCharacter> obtainCharacters();
    public HeroCharacter obtainCharacter(HeroCharacter heroCharacter);
    public void addCharacter(HeroCharacter heroCharacter);
    public void removeCharacter(HeroCharacter heroCharacter);
    public void updateCharacter(HeroCharacter heroCharacter);
}

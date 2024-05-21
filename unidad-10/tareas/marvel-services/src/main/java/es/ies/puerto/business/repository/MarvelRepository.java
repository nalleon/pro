package es.ies.puerto.business.repository;

import es.ies.puerto.modelo.db.entidades.Alias;
import es.ies.puerto.modelo.db.entidades.Equipamiento;
import es.ies.puerto.modelo.db.entidades.Personaje;
import es.ies.puerto.modelo.db.entidades.Poder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class MarvelRepository {
    private List<Personaje> lista;

    public MarvelRepository(){
        lista = new ArrayList<>();
        lista.add(new Personaje("idPersonaje"));
    }

    public Personaje getPersonajeById(String id) {
        Personaje personaje = new Personaje(id);
        int index = lista.indexOf(personaje);

        if(index >=0){
            return lista.get(index);
        }
        return null;
    }

    public List<Personaje> getPersonajes() {
        return lista;
    }

    public boolean savePersonaje(Personaje personaje) {
        if (lista.contains(personaje)) {
            return false;
        }

        return lista.add(personaje);
    }

    public boolean deletePersonajeById(String id) {
        Personaje personaje = new Personaje(id);
        return lista.remove(personaje);
    }
}

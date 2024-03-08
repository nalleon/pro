package es.ies.puerto.modelo.interfaces;

import es.ies.puerto.modelo.Persona;

import java.util.List;

public interface ICrudMethods {
    public Persona obtainPersona(Persona persona);

    public List<Persona> obtainPersonas();

    public void addPersona(Persona persona);

    public void deletePersona(Persona persona);

    public void update(Persona persona);
}
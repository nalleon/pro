package es.ies.puerto.model.impl;

import es.ies.puerto.model.abstracts.Person;

public class User extends Person {
    public User(String id) {
        super(id);
    }

    public User(String id, String name, int age, String city) {
        super(id, name, age, city);
    }
}

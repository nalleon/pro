package es.ies.puerto.model.abstracts;

import java.util.Objects;

public abstract class Person {
    private String id;
    private String name;
    private int age;
    private String city;


    /**
     * Constructor of the class
     * @param id of the person
     */
    public Person(String id) {
        this.id = id;
    }

    /**
     * Constructor of the class
     * @param id of the person
     * @param name of the person
     * @param age of the person
     * @param city of the person
     */

    public Person(String id, String name, int age, String city) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.city = city;
    }

    /**
     * Getters and setters
     */
    public String getId() {
        return id;
    }

    public Person setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Person setAge(int age) {
        this.age = age;
        return this;
    }

    public String getCity() {
        return city;
    }

    public Person setCity(String city) {
        this.city = city;
        return this;
    }

    @Override
    public String toString() {
        return "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(id, person.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

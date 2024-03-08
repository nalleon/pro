package es.ies.puerto.modelo;

import es.ies.puerto.utilidades.UtilidadesClass;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import java.util.Objects;
@Root(name = "persona")
public class Persona extends UtilidadesClass {

    @Element(name = "id")
    int id;
    @Element(name = "name")
    String name;
    @Element(name = "age")
    int age;
    @Element(name = "email")
    String email;
    /**
     * Default constructor of the class
     */
    public Persona (){
    }
    /**
     * Default constructor of the class
     * @param id of the person
     */
    public Persona (int id){
        this.id = id;
    }

    /**
     * Constructor of the class
     * @param id of the person
     * @param name of the person
     * @param age of the person
     * @param email of the person
     */
    public Persona(int id, String name, int age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }
    /**
    * Getters and setters
    */
    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return id == persona.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public String toCSV(){
        return id+DELIMITATOR+name+DELIMITATOR+age+DELIMITATOR+email;
    }
}

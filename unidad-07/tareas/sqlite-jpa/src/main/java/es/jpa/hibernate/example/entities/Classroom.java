package es.jpa.hibernate.example.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "classroom")
public class Classroom implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_classroom", nullable = false)
    private Integer id;


}

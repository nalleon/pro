package es.jpa.hibernate.example.entities;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "person")
public class Person implements Serializable {

	private static final long serialVersionUID = -7250234396452258822L;

	@Id
	@TableGenerator(name = "gen_person",
			table = "table_keys",
			pkColumnName = "name_table",
			valueColumnName = "cod_key",
			pkColumnValue = "person", allocationSize = 1, initialValue = 1)
	@GeneratedValue(generator = "gen_person", strategy = GenerationType.TABLE)
	@Column(name = "id_person")
	private Integer id;
	private String name;
	private Integer age;
	//@Column(name = "hair_color")
	//private String property1;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

/**
	public String getProperty1() {
		return property1;
	}

	public void setProperty1(String property1) {
		this.property1 = property1;
	}
}
 */
}


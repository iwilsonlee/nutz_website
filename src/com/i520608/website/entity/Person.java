package com.i520608.website.entity;

import java.util.List;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Id;
import org.nutz.dao.entity.annotation.Many;
import org.nutz.dao.entity.annotation.Name;
import org.nutz.dao.entity.annotation.Table;

@Table("t_person")  
public class Person {

	@Id
	private Integer id;
	
	@Name
	private String name;
	
	@Column("age")
	private int age;
	
	@Many(target = Pet.class, field = "personId")
	private List<Pet> pets;


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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Pet> getPets() {
		return pets;
	}

	public void setPets(List<Pet> pets) {
		this.pets = pets;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", id=" + id + ", name=" + name
				+ ", pets=" + pets + "]";
	}
	
	
}

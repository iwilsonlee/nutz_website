package com.i520608.website.entity;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Id;
import org.nutz.dao.entity.annotation.Name;
import org.nutz.dao.entity.annotation.Table;

@Table("t_pet")  
public class Pet {

	@Id
	private Integer id;
	
	@Name
	private String name;
	
	@Column
	private int age;
	
	@Column
	private Integer personId;

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

	public Integer getPersonId() {
		return personId;
	}

	public void setPersonId(Integer personId) {
		this.personId = personId;
	}

	@Override
	public String toString() {
		return "Pet [age=" + age + ", id=" + id + ", name=" + name
				+ ", personId=" + personId + "]";
	}

	
	
	
}

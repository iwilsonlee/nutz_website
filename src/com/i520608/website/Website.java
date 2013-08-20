package com.i520608.website;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import javax.sql.DataSource;

import org.nutz.dao.Dao;
import org.nutz.dao.Sqls;
import org.nutz.dao.impl.NutDao;
import org.nutz.dao.impl.SimpleDataSource;
import org.nutz.dao.sql.Sql;
import org.nutz.dao.sql.SqlCallback;

import com.i520608.website.entity.Person;
import com.i520608.website.entity.Pet;

public class Website {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimpleDataSource ds = new SimpleDataSource();
		ds.setJdbcUrl("jdbc:mysql://localhost:3306/test");
		ds.setUsername("wenson");
		ds.setPassword("wenson");
		
		Dao dao = new NutDao(ds);
		dao.create(Person.class, false);
		dao.create(Pet.class, false);
//		dao.drop(Person.class);
//		dao.delete(Person.class, "211");
		
		/*
		Person p = new Person();
		p.setName("Peter");
		p.setAge(22);
		dao.insert(p);
		System.out.println(p.getId());*/
		
		/*
		Person person = dao.fetch(Person.class, "Peter");
		Pet pet = new Pet();
		pet.setAge(2);
		pet.setName("luler");
		pet.setPersonId(person.getId());
		dao.insert(pet);
		System.out.println(pet.getId());
		*/
		
		Person person = dao.fetch(Person.class, "Peter");
		dao.fetchLinks(person, "pets");
		List<Pet> list = person.getPets();
		if(list == null){
			System.out.println("pet list is null !");
		}else{
		    System.out.println("pet size : " + list.size());
		    for(Pet pet : list){
		    	System.out.println("pet :" + pet.toString());
		    }
		}
	}

}

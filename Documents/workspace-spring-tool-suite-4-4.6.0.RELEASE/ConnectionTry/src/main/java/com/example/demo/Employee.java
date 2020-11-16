package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.json.JSONException;

import org.json.JSONObject;
@Entity
@Table(name="emp")
public class Employee {
	@Id
	private String id;
	private String name;
	public Employee()
	{
	
	}
	
	
	public Employee(String id, String name) {
		super();
		this.id = id;
		this.name = name;
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}



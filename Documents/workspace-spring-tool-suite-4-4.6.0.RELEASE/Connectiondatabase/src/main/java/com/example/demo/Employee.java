package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="emp")
public class Employee {
	@Id
	private String id;
	private String name;
	
	public Employee() {
		super();
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
	
	
//	@Override
//	public String toString()
//	{
//		JSONObject jsonString = null;
//		try {
//			jsonString = new JSONObject();
//					jsonString.put("id", this.id);
//					jsonString.put("name", this.name);
//		} catch (JSONException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}	
//		return jsonString.toString();
//							
//	}

}
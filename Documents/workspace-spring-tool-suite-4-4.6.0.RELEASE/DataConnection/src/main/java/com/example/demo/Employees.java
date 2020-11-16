package com.example.demo;
import org.json.JSONException;
import org.json.JSONObject;
@Entity
@Table(name="emp")
public class Employees {
	@Id
	private String id;
	private String name;
	public Employees()
	{
	
	}
	
	
	public Employees(String id, String name) {
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
	
	@Override
	public String toString() {
		JSONObject jsonString = null;
	try {
			jsonString = new JSONObject()
			        .put("name", this.name)
					.put("id", this.id);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
		e.printStackTrace();
		}
	    return jsonString.toString();
	}


}



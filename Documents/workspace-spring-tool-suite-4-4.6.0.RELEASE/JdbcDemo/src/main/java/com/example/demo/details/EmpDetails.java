package com.example.demo.details;


import org.springframework.jdbc.core.JdbcTemplate;

public class EmpDetails {

	private String id;
	private String name;
	
	public EmpDetails() {
		super();
	}

	public EmpDetails(String id, String name) {
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




//@Override
//public String toString()
//{
//	jdbcTemplate jsonString = null;
//	try {
//		jsonString = new jdbcTemplate();
//				jsonString.put("id", this.id);
//				jsonString.put("name", this.name);
//	} catch (JdbcTemplate e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}	
//	return jsonString.toString();
//						
//}}



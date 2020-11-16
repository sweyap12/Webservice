package com.example.demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//import org.json.simple.JSONArray;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;




@Service
public class EmployeeService { 
	
	@Autowired
	UserRepository userRepository;
	public List<Employees>getAllEmps(){
		return userRepository.findAll();
	}
	public List<Employees>getEmps(String id){
		return userRepository.findById(id);
}
	
	public String addEmp(Employees detail) {
		
		userRepository.save(detail);
		return "Added successfully";
	}
	
	
}
  
	 
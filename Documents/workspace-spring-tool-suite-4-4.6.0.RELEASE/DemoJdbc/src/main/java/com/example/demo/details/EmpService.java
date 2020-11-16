package com.example.demo.details;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repository.JdbcRepository;

@Service
public class EmpService {
 
	   @Autowired
	   JdbcRepository jdbcRepository;
	
    public List<EmpDetails> getAllEmps(){
    	
    	return jdbcRepository.getAllEmps();
    	}
    
    public String deleteEmp(String id)
    {
    	jdbcRepository.delEmp(id);
    	  
		return "Deleted Successfully";
    	
    }
  public List<EmpDetails> getEmps(String id){
    	
    	return jdbcRepository.getEmps(id);
    	}
    
    public String updateEmp(String id, EmpDetails e)
    {
    	jdbcRepository.updateEmp(id, e);
    	  
		return "Updated Successfully";
    	
    }
    public String addEmp(EmpDetails e)
    {
    	jdbcRepository.addEmp(e);
    	  
		return "Added Successfully";
    	
    }}

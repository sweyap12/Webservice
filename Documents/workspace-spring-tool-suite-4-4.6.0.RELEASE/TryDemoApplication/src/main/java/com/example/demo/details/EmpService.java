package com.example.demo.details;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.details.EmpDetails;
import com.example.demo.repository.EmpRepository;

@Service
public class EmpService {
 
	   @Autowired
	   EmpRepository empRepository;
	
    public List<EmpDetails> getAllEmps(){
    	
    	return empRepository.findAll();
    	}
    
    public Optional<EmpDetails> getEmps(String id){
    	
    	return empRepository.findById(id);
    	
    }
	public String addEmp(EmpDetails detail) {
	
		empRepository.save( detail);
		return "Added Successfully";
	
	}
	public String deleteEmp(String id)
	{
		empRepository.deleteById(id);
		return "Deleted successfully";
	}
	
	public String updateEmp(String id, EmpDetails detail) {
		

		empRepository.save(detail);
		return "Updated Successfully";
	}
    
}
 
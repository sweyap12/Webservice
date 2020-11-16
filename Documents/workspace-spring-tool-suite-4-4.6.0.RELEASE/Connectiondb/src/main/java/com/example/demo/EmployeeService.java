package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Employee;
import com.example.demo.Employee;
import com.example.demo.repository.EmpRepository;

@Service
public class EmployeeService {
 
	   @Autowired
	   EmpRepository empRepository;
	
    public List<Employee> getAllEmps(){
    	
    	return empRepository.findAll();
    	}
    
    
public Optional<Employee> getEmps(String id){
    	
    return empRepository.findById(id);
    	
    }
	public String addEmp(Employee detail) {
	
		empRepository.save(detail);
		return "Added Successfully";
	
	}
	
	
	public String deleteEmp(String id)
	{
		empRepository.deleteById(id);
		return "Deleted successfully";
	}
	
	public String updateEmp(String id, Employee detail) {
		

		empRepository.save(detail);
		return "Updated Successfully";
	}
    
}
 
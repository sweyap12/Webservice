package com.details;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Repository.EmployeeRepository;
import com.entity.Employee;

@Service
public class EmployeeService {
 
	   @Autowired
	   EmployeeRepository empRepository;
	
    public List<Employee> getAllEmps(){
    	
    	return (List<Employee>) empRepository.findAll();
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
		
//		List<EmpDetails> existingEmp = empRepository.findById(detail.getId());  
//		
//		for(int i=0;i<existingEmp.size();i++)
//		{
//			EmpDetails emp = existingEmp.get(i);
//			if(emp.getId().equals(id))
//			{
//				existingEmp.set(i,detail);			
//			}
//		}
//		empRepository.save(existingEmp);
		empRepository.save(detail);
		return "Updated Successfully";
	}
    
}
 
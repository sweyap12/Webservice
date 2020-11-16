package com.details;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repository.EmpRepository;

@Service
public class EmpService {
 
	   @Autowired
	   com.demo.Repository.EmpRepository empRepository;
	
    public List<EmpDetails> getAllEmps(){
    	
    	return empRepository.findAll();
    	}
    
    public List<EmpDetails> getEmps(String id){
    	
    	return empRepository.findById(id);
    	
    }
	public String addEmp(EmpDetails detail) {
	
		empRepository.save(detail);
		return "Added Successfully";
	
	}
	public String deleteEmp(String id)
	{
		empRepository.delete(id);
		return "Deleted successfully";
	}
	
	public String updateEmp(String id, EmpDetails detail) {
		
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
  //public void deleteEmp(String id) {
//	
//	details.removeIf(t -> t.getId().equals(id));
//
//}

//	public void addEmp(EmpDetails detail) {
//		
//    	empRepository.addEmp(detail);
//		
//	}

//public EmpDetails getEmp(String id){
//	
//	return details.stream().filter(t -> t.getId().equals(id)).findFirst().get();
//
//}
//
//public void addEmp(EmpDetails detail)
//{
//
//	details.add(detail);
//}
//




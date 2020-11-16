package com.demo.Repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.details.EmpDetails;

@Repository
public interface EmpRepository extends CrudRepository<EmpDetails, String>
{
	List<EmpDetails> findAll();
	
	List<EmpDetails> findById(String id);
	
}
	
//	
//	public List<EmpDetails> getAllEmps() {
//		
//		List<EmpDetails> name = Arrays.asList();
//		
//		String sql="SELECT * FROM EMPLOYEE.EMPLOYE;";
//		name.addAll(jdbctemplate.query(sql,ResultSetExtractor<EmpDetails>));
//		
//
//		
//		return name;
//	}
//
//	public void addEmp(EmpDetails detail) {
//		
//		String sql = "INSERT INTO EMPLOYE (id, name) VALUES (?, ?)";
//        int result = jdbctemplate.update(sql, detail);
//	
//        if (result > 0) {
//            System.out.println("Insert successfully.");
//        } 
//	}


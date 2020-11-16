package com.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.entity.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, String>
{
	List<Employee> findAll();
	
	Optional<Employee> findById(String id);
	
}
	

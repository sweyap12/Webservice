package com.example.demo;

import java.util.List;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Employee;
@Qualifier
@Repository
public interface EmployeeRepository extends CrudRepository<Employee,String>
{
	List<Employee>findAll();
	List<Employee>findById(String id);
	
}
	

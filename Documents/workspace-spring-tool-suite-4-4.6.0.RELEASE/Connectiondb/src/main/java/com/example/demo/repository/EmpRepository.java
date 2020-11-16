package com.example.demo.repository;

import java.util.List;
//import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Employee;

@Repository
public interface EmpRepository extends CrudRepository<Employee,String>
{
	List<Employee>findAll();
	List<Employee>findById();
	
}
	

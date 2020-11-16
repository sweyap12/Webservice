package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository

public interface UserRepository extends CrudRepository<Employees, String> {

	List<Employees> findAll();
	List<Employees> findById(String id);
	

}
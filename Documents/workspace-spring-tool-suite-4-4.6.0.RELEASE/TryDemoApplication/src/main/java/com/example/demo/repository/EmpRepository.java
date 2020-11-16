package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.details.EmpDetails;

@Repository
public interface EmpRepository extends CrudRepository<EmpDetails, String>
{
	List<EmpDetails> findAll();
	
	Optional<EmpDetails> findById(String id);

	Optional<EmpDetails> findByName(String string);
	
}
	

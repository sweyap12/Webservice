package userRepository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Employee;

@Repository

public interface UserRepository extends CrudRepository<Employee, String> {
	
	
	
	List<Employee>findAll();
	List<Employee>findById(String id);
}
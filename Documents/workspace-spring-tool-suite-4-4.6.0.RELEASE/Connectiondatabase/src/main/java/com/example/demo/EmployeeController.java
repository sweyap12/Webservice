package com.example.demo;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Employee;
import com.example.demo.EmployeeService;
//import com.example.demo.details.EmpDetails;
import com.example.demo.Employee;

@RestController
public class EmployeeController {
	@Qualifier
	@Autowired
	private EmployeeService empService;
	
	@RequestMapping(method=RequestMethod.GET ,value="employees")
	public List<Employee> getAllEmps()
	{
		return empService.getAllEmps();
    }
	
	@RequestMapping(method=RequestMethod.GET ,value="employees/{id}")
	public List<Employee> getEmps(@PathVariable String id)
	{
		return empService.getEmps(id);

    }
	@RequestMapping(method=RequestMethod.DELETE , value="employees/{id}")
	public String deleteEmp(@PathVariable String id)
	{
		return empService.deleteEmp(id);
    }

	@RequestMapping(method=RequestMethod.POST , value="employees")
	public String addEmp(@RequestBody Employee detail)
	{
		return empService.addEmp(detail);
    }
	@RequestMapping(method=RequestMethod.PUT , value="employees/{id}")
	public String updateEmp(@PathVariable String id, @RequestBody Employee detail)
	{
		return empService.updateEmp(id, detail);
    }
	
	

}
	
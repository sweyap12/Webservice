package Test.courseapi;

import java.util.Arrays;
import java.util.List;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ComponentScan({ "Test.courseapi.EmployeeService" })
public class TestController {
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("employees/")
	public JSONObject getTopics(){ 
	return employeeService.getemployees();
	}
	
	@RequestMapping(value="employee/{id}",method=RequestMethod.GET)
	public JSONObject getemployee(@PathVariable String id){
		return employeeService.getemployee(id);
	}	
}

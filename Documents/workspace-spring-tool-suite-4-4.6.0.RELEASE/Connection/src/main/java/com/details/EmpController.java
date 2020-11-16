package com.details;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.details.EmpService;;


@RestController
public class EmpController {

	@Autowired
	private EmpService empService;
	
	@RequestMapping(method=RequestMethod.GET ,value="/v1/employee")
	public List<EmpDetails> getAllEmps()
	{
		return empService.getAllEmps();
    }
	
	@RequestMapping(method=RequestMethod.GET ,value="/v1/employee/{id}")
	public List<EmpDetails> getEmps(@PathVariable String id)
	{
		return empService.getEmps(id);

    }
	@RequestMapping(method=RequestMethod.DELETE , value="/v1/employee/{id}")
	public String deleteEmp(@PathVariable String id)
	{
		return empService.deleteEmp(id);
    }

	@RequestMapping(method=RequestMethod.POST , value="/v1/employee")
	public String addEmp(@RequestBody EmpDetails detail)
	{
		return empService.addEmp(detail);
    }
	
	@RequestMapping(method=RequestMethod.PUT , value="/v1/employee/{id}")
	public String updateEmp(@PathVariable String id, @RequestBody EmpDetails detail)
	{
		return empService.updateEmp(id, detail);
    }
	
}

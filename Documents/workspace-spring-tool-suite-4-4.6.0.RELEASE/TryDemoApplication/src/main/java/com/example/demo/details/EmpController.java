package com.example.demo.details;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.details.EmpService;;


@RestController
public class EmpController {

	@Autowired
	private EmpService empService;
	
	@RequestMapping(method=RequestMethod.GET ,value="/employees")
	public List<EmpDetails> getAllEmps()
	{
		return empService.getAllEmps();
    }
	
	@RequestMapping(method=RequestMethod.GET ,value="/employee/{id}")
	public Optional<EmpDetails> getEmps(@PathVariable String id)
	{
		return empService.getEmps(id);

    }
	@RequestMapping(method=RequestMethod.DELETE , value="/delete/{id}")
	public String deleteEmp(@PathVariable String id)
	{
		return empService.deleteEmp(id);
    }
	
	@PostMapping("/add")
	
	public String addEmp(@RequestParam("id") String id, @RequestParam("name") String name)
	{
		EmpDetails detail=new EmpDetails(id,name);
		return empService.addEmp(detail);
    }
   @RequestMapping(method=RequestMethod.PUT , value="/update")
	public String updateEmp(@RequestParam("id") String id, @RequestParam("name") String name)
	{
		EmpDetails detail=new EmpDetails(id,name);
		return empService.updateEmp(id, detail);
    }
	
}

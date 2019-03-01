package com.neosoft.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.model.Employee;
import com.neosoft.repository.EmployeeRepo;

@RestController
@RequestMapping("/employee/api")
@CrossOrigin
public class EmployeeController {
	@Autowired
	private EmployeeRepo repo;
	@RequestMapping("/hi")
	public String welcome()
	{
		return"welcome rest api aplication";
	}
	@PostMapping("/employees")
public Employee createEmployee( @Valid @RequestBody  Employee employee )
{
		
	return repo.save(employee);
}
	@GetMapping("/employees")
	public List<Employee> getAllEmployees()
{
	return repo.findAll();
}
	
	@DeleteMapping("employees/{id}")
	public boolean deleteEmployee(@PathVariable int id)
	{
		Employee employee=repo.getOne(id);
		repo.deleteById(employee.getId());
		return true;
	}
	
	 @GetMapping(path = {"/{id}"})
	    public Employee findOne1(@PathVariable("id") int id){
	        return repo.getOne(id);
	    }
	
	 @PutMapping
	    public Employee update(@RequestBody Employee employee){
	        return repo.save(employee);
	    }
}

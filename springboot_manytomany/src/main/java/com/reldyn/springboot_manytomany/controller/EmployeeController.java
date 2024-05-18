package com.reldyn.springboot_manytomany.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reldyn.springboot_manytomany.entities.Employee;
import com.reldyn.springboot_manytomany.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/save")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee id)
	{
		employeeService.saveEmployeeDetails(id);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	
	@GetMapping("/get")
	public ResponseEntity<Object> getAllusers()
	{
		return employeeService.getAllusers();
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Employee> getUsers(@PathVariable int id)
	{
		return employeeService.getUsers(id);
	}
	
}

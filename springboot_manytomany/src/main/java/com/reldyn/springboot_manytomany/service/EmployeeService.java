package com.reldyn.springboot_manytomany.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.reldyn.springboot_manytomany.dao.EmployeeRepository;
import com.reldyn.springboot_manytomany.entities.Employee;
@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository empRepository;

	public ResponseEntity<Object> saveEmployeeDetails(Employee id) {
	        empRepository.save(id);
			return ResponseEntity.ok(HttpStatus.CREATED);
	}

	public ResponseEntity<Object> getAllusers() {
		List<Employee> findAll = empRepository.findAll();
		if (findAll.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			
		}
		return new ResponseEntity<>(findAll, HttpStatus.FOUND);
	}

	public ResponseEntity<Employee> getUsers(int id) {
		empRepository.findById(id);
		return new ResponseEntity<>(HttpStatus.ACCEPTED);
	}

}

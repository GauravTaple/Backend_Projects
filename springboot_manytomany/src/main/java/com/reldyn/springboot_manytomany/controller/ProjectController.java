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
import com.reldyn.springboot_manytomany.entities.Project;
import com.reldyn.springboot_manytomany.service.ProjectService;

@RestController
@RequestMapping("/project")
public class ProjectController {
	
	@Autowired
	private ProjectService projectService;
	
	@PostMapping("/save")
	public ResponseEntity<Project> CreatedProject(@RequestBody Project idd) {
		projectService.SaveditProject(idd);
		return new ResponseEntity<>(HttpStatus.CREATED);	
	}
	
	@GetMapping("/get")
	public ResponseEntity<Object> getAllusers()
	{
		return projectService.getAllusers();
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Project> getUsers(@PathVariable int id)
	{
		return projectService.getUsers(id);
	}

}

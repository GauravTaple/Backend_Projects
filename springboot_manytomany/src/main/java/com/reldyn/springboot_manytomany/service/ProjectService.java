package com.reldyn.springboot_manytomany.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.reldyn.springboot_manytomany.dao.ProjectRepository;
import com.reldyn.springboot_manytomany.entities.Employee;
import com.reldyn.springboot_manytomany.entities.Project;

@Service
public class ProjectService {
	
	@Autowired
	private ProjectRepository projectRepository;


	public ResponseEntity<Project> SaveditProject(Project idd) {
	    projectRepository.save(idd);
		return ResponseEntity.status(HttpStatus.CREATED).build();
		
	}


	public ResponseEntity<Object> getAllusers() {
		List<Project> findAll = projectRepository.findAll();
		if (findAll.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			
		}
		return new ResponseEntity<>(findAll, HttpStatus.FOUND);
	}

	
	
	public ResponseEntity<Project> getUsers(int id) {
		projectRepository.findById(id);
		return new ResponseEntity<>(HttpStatus.ACCEPTED);
	}


	
	

}

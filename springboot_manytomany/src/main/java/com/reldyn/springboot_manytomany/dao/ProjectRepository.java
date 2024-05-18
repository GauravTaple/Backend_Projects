package com.reldyn.springboot_manytomany.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reldyn.springboot_manytomany.entities.Project;

public interface ProjectRepository extends JpaRepository<Project, Integer> {
	
	List<Project> findALLById(int pId);

}

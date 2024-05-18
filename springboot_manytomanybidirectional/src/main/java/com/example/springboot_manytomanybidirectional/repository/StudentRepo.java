package com.example.springboot_manytomanybidirectional.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot_manytomanybidirectional.entities.Student;

public interface StudentRepo extends JpaRepository<Student, Long> {
	
	List<Student> findByNameContaining(String name);

}

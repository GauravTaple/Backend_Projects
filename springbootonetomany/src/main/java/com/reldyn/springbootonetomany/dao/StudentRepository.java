package com.reldyn.springbootonetomany.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.reldyn.springbootonetomany.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	public Student findById(int id);

}

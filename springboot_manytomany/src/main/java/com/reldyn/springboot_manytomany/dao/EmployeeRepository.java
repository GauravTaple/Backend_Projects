package com.reldyn.springboot_manytomany.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.reldyn.springboot_manytomany.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	List<Employee> findAllByEmpId(int empId);
	

}

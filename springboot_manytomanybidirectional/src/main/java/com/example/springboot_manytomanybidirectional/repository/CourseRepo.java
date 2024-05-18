package com.example.springboot_manytomanybidirectional.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot_manytomanybidirectional.entities.Course;

public interface CourseRepo extends JpaRepository<Course, Long> {

	List<Course> findByFeeLessThan(double fee);
}

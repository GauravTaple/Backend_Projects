package com.example.springboot_manytomanybidirectional.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot_manytomanybidirectional.entities.Course;
import com.example.springboot_manytomanybidirectional.entities.Student;
import com.example.springboot_manytomanybidirectional.repository.CourseRepo;
import com.example.springboot_manytomanybidirectional.repository.StudentRepo;

@RestController
@RequestMapping("/student/course")
public class StudentCourseController {
	
	private StudentRepo studentRepository;
	
	private CourseRepo courseRepository;

	public StudentCourseController(StudentRepo studentRepository, CourseRepo courseRepository) {
		super();
		this.studentRepository = studentRepository;
		this.courseRepository = courseRepository;
	}
	
	@PostMapping("/post")
	public Student saveStudentWithCourse(@RequestBody Student student) {
		return studentRepository.save(student);
		
	}
	
	@GetMapping("/get")
	public List<Student> findAllStudents() {
		return studentRepository.findAll();
		
	}
	
	@GetMapping("/get/{id}")
	public Student finStudent(@PathVariable Long id) {
		return studentRepository.findById(id).orElse(null);
		
	}
	
	@GetMapping("/get/{name}")
	public List<Student> findByNameContaining(@PathVariable String name){
		return studentRepository.findByNameContaining(name);
		
	}

	@GetMapping("/get/{fee}")
	public List<Course> FindCourseLessThan(@PathVariable Double fee) {
		return courseRepository.findByFeeLessThan(fee);
		
	}
}

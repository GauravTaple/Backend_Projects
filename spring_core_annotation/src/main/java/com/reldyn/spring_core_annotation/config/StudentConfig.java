package com.reldyn.spring_core_annotation.config;

import org.springframework.context.annotation.Bean;

import com.reldyn.spring_core_annotation.bean.StudentBean;

public class StudentConfig {
	@Bean
	public StudentBean getStudent()
	{
		StudentBean student=new StudentBean();
		student.setId(1);
		student.setName("Gaurav");
		student.setContact(9876543210L);
		return student;
		
	}
	


}

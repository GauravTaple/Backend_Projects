package com.reldyn.spring_core_annotation.config;

import org.springframework.context.annotation.Bean;

import com.reldyn.spring_core_annotation.bean.StudentBean2;

public class StudentConfig2 {

	@Bean("Stud2")
	public StudentBean2 getStudent()
	{
		return new StudentBean2();
	}
}

package com.reldyn.spring_core_annotation.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.reldyn.spring_core_annotation.bean.StudentBean2;
import com.reldyn.spring_core_annotation.config.StudentConfig2;

public class StudentMain2 {
	public static void main(String[] args) {
		ApplicationContext con= new AnnotationConfigApplicationContext(StudentConfig2.class);
		StudentBean2 bean = (StudentBean2) con.getBean("Stud2");
		System.out.println(bean);
		((AnnotationConfigApplicationContext)con).close();
	}

}

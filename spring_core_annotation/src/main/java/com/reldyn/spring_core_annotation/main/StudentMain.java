package com.reldyn.spring_core_annotation.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.reldyn.spring_core_annotation.bean.StudentBean;
import com.reldyn.spring_core_annotation.config.StudentConfig;

public class StudentMain {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
		StudentBean bean = context.getBean(StudentBean.class);
		System.out.println(bean);
		((AnnotationConfigApplicationContext) context).close();

	}

}

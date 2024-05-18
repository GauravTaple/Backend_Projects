package com.reldyn.springcore_collection.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.reldyn.springcore_collection.entity.Employee;

public class EmployeeMain {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Employee.xml");
		Employee bean = context.getBean(Employee.class);
		System.out.println(bean);        // to print the object
		System.out.println(bean.getPhones().getClass().getName());   //to identify the util type
		System.out.println(bean.getCourses().getClass().getName());  // to identify the util type
		System.out.println(bean.getAddresses().getClass().getName());
		((ClassPathXmlApplicationContext)context).close();
	}
}

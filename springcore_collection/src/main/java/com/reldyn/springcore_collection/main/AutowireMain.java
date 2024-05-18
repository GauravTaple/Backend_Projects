package com.reldyn.springcore_collection.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.reldyn.springcore_collection.entity.Autowire;

public class AutowireMain {
	public static void main(String[] args) {
		ApplicationContext context1=new ClassPathXmlApplicationContext("Autowire.xml") ;
		Autowire bean = context1.getBean("auto",Autowire.class);
		System.out.println(bean);
	}

}

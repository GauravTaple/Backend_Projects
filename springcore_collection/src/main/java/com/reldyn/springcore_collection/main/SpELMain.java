package com.reldyn.springcore_collection.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.reldyn.springcore_collection.entity.SpEL;

public class SpELMain {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("SpEl.xml");
		Object bean =  context.getBean(SpEL.class);
		System.out.println(bean);
	}

}

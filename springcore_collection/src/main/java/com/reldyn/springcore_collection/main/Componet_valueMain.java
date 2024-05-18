package com.reldyn.springcore_collection.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.reldyn.springcore_collection.entity.Component_value;
import com.reldyn.springcore_collection.entity.Prototype_Bean;

public class Componet_valueMain {
	public static void main(String[] args) {
		ApplicationContext cont=new ClassPathXmlApplicationContext("component_value.xml");
		Component_value bean = cont.getBean("comp",Component_value.class);
		//System.out.println(bean);
		//System.out.println(bean.getLocations());
		//System.out.println(bean.getLocations().getClass().getName());  //for getting the list...
	
		
//-----------------------------Spring Bean Scope-------------------------------------------------
		System.out.println("Singleton scope using annotation:");
		System.out.println(bean.hashCode());
		Component_value bean2 = cont.getBean("comp",Component_value.class);
		System.out.println(bean2.hashCode());
		
		System.out.println("Prototype scope:");
		Object bean3 = cont.getBean("prots",Prototype_Bean.class);
		Object bean4 = cont.getBean("prots",Prototype_Bean.class);
		
		System.out.println(bean3.hashCode());
		System.out.println(bean4.hashCode());
		
		
	}

}

package com.reldyn.springcore_collection.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.reldyn.springcore_collection.entity.Annotation_Configuration;
import com.reldyn.springcore_collection.entity.Annotation_JavaConfig;

public class Annotation_configuration_Main {
	public static void main(String[] args) {
		ApplicationContext cont=new AnnotationConfigApplicationContext(Annotation_JavaConfig.class);
		Annotation_Configuration bean = cont.getBean("getStudent",Annotation_Configuration.class);
		System.out.println(bean);
		bean.Study();
	}

}

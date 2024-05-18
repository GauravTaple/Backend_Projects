package com.reldyn.springcore_collection.entity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.reldyn.springcore_collection.entity")
public class Annotation_JavaConfig {

	@Bean
	public samosa getSamosa() {
		return new samosa();
	}

	@Bean    // If we have to use @Bean annotation that time there is no need to use @ComponenetScan...
	public Annotation_Configuration getStudent() {
		Annotation_Configuration student = new Annotation_Configuration(getSamosa());
		return student;
	}

}

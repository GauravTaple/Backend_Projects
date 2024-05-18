package com.reldyn.springcore_collection.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Annotation_Configuration {
	@Autowired
	private samosa sam;
	
	public Annotation_Configuration(samosa samosa) {
		this.sam=samosa;
	}

	public void Study()
	{
		this.sam.display();
		System.out.println("Configuration is Studing");
	}

}

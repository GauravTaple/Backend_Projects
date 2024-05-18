package com.example.spring_mapstruct.builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
//@Builder                //1st way using class
public class Customer {
	
	private int id;
	
	private String name;
	
	private String city;
	
	private int age;

	
	//@Builder                        //2nd way using constructor
	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Builder                          //3rd way using method
	public static Customer Instance(String name,int id) {
		return new Customer(id, name);
		
	}

	
	
	
	
	

}
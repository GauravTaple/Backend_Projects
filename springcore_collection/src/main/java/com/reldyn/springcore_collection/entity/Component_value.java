package com.reldyn.springcore_collection.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor

@Component("comp")
@Scope("prototype")
public class Component_value {
	
	@Value("1")
	private int id;
	
	@Value("Salman")
	private String name;
	
	@Value("Dabang")
	private String movie;
	
	@Value("#{temp}")          //For getting all the list we use "@value("#{}")" annotation
	private List<String> locations;
	
	

}

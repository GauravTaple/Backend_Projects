package com.reldyn.springcore_collection.entity;

import org.springframework.beans.factory.annotation.Value;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Autowire2 {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Value("20000")
	private int price;
	
	@Value("jon")
	private String name;
	
	@Value("7777777777")
	private long contact;

}

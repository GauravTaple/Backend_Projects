package com.reldyn.springcore_collection.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Autowire {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Autowired
//	@Qualifier("bean1")
	private Autowire2 aw;

}

package com.reldyn.springcore_collection.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class SpEL {
	@Value("#{2+3}")
	private int x;
	
	@Value("#{5+5}")
	private int y;
	
	@Value("#{T(java.lang.Math).PI}")
	private int z;
	
	@Value("#{T(java.lang.Math).sqrt(144)}")
	private int A;
	
}

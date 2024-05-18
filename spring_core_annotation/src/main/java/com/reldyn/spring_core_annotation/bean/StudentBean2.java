package com.reldyn.spring_core_annotation.bean;

import org.springframework.beans.factory.annotation.Value;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class StudentBean2 {
	@Id
	@Value("100")
	private int id;
	@Value("rocky")
	private String name;
	@Value("0123456789")
	private long contact;
	
	

}

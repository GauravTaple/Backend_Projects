package com.reldyn.springbootonetomany.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="student")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String name;
	
	private String about;
	
	@OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<Address> address;
	
	
	
	
	
	
	
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name)
//	private List<Address> address;
	

}

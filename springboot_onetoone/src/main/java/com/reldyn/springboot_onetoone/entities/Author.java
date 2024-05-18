package com.reldyn.springboot_onetoone.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "author")
public class Author {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int authorid;
	
	private String name;
	
	
	private String language; 

	@OneToOne(mappedBy = "author")  //using mappedBy we cannot add another column in author table.To reduce the redundancy.
	@JsonBackReference
	private Books book;
	

}

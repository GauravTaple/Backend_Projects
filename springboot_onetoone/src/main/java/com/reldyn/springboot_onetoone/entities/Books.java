package com.reldyn.springboot_onetoone.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="books")
public class Books {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Book_id")
	private int id;
	 
	@Column(name="Book_name")
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL)   //parallelly operations performed for both the table
	@JoinColumn(name="auth_id")
	@JsonManagedReference
	private Author author;

	
}

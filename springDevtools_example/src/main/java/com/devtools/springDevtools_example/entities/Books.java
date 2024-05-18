package com.devtools.springDevtools_example.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Books_Details")
public class Books {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Book_id")
	private int id;
	 
	@Column(name="Book_name")
	private String name;
	
	@Column(name="Book_author")
	private String author;

}

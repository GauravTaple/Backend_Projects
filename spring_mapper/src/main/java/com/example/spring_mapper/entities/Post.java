package com.example.spring_mapper.entities;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@Entity
@Table(name="Post_entity_tbl", uniqueConstraints = {@UniqueConstraint(columnNames = {"title"})})
public class Post {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)   //,generator = "uuid")
	
	//@GenericGenerator(name="uuid",strategy ="uuid2")     //if i used uuid2 so '-' is there && uuid '-' is not there
	@Column(name="p_id")
	private Long id;
	
	@Column(name = "Title",nullable=false,length = 100)
	private String title;
	
	@Column(name="Descriptioned",nullable = false,length = 50)
	private String description;
	
	@Column(name="Contented",length=40)
	private String content;

}

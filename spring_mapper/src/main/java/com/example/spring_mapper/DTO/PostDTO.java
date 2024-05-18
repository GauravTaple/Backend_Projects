	package com.example.spring_mapper.DTO;

import javax.validation.constraints.NotEmpty;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class PostDTO {
	
	private long id;
	
	@NotEmpty
	@Size(min=4,message="character must be 4")
//	@Pattern(regexp = "title")
	private String title;
	
	@NotEmpty(message = "description can not be null")
	private String description;
	
}

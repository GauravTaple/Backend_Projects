package com.example.spring_mapstruct.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
	
	private Long id;
	private String fname;
	private String lname;
	private String email;
	
//	private String emailAddress;


}

package com.example.spring_mapstruct.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring_mapstruct.dto.UserDTO;
import com.example.spring_mapstruct.service.UserService;


@RestController
public class UserController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/getuser")
	public List<UserDTO> getAllUsers()
	{
		List<UserDTO> getAllUser = this.userService.GetAllUser();
//		UserDTO mapToUserDTO = autoUserMapper.mapToUserDTO( getAllUser);
		
		return getAllUser;
		
	}
	

}

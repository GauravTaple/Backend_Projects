package com.example.spring_mapstruct.service;

import java.util.List;

import com.example.spring_mapstruct.dto.UserDTO;

public interface UserService {
	
	List<UserDTO> GetAllUser();

}

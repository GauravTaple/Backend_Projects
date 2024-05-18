package com.example.spring_mapstruct.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring_mapstruct.dto.UserDTO;
import com.example.spring_mapstruct.entities.User;
import com.example.spring_mapstruct.mapper.AutoUserMapper;
import com.example.spring_mapstruct.repository.UserRepo;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepo userrepository;
	
//	@Autowired
//	private ModelMapper modelMapper;
	
	@Autowired
	private AutoUserMapper autoUserMapper;

	@Override
	public List<UserDTO> GetAllUser() {
		List<User> users = this.userrepository.findAll();
		return users.stream().map(u->autoUserMapper.mapToUserDTO(u)).collect(Collectors.toList());
	}

}

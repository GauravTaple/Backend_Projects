package com.example.spring_mapstruct.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

import com.example.spring_mapstruct.dto.UserDTO;
import com.example.spring_mapstruct.entities.User;


@Mapper(componentModel = "spring")
public interface AutoUserMapper{
	
	AutoUserMapper autousermapper=Mappers.getMapper(AutoUserMapper.class);
	
//If i used inside entity class different variable name & dto class different variable
		                                                     //name then we use @Mapping(source=" " ,target=" ")
//		@Mapping(source = "email", target = "emailAddress")
		UserDTO mapToUserDTO(User user);
		    	
//		@Mapping(source = "email", target = "emailAddress")
		User mapToUser(UserDTO userdto);

}

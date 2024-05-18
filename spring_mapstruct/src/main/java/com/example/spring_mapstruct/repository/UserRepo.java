package com.example.spring_mapstruct.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.spring_mapstruct.entities.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

}

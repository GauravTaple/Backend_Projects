package com.example.spring_mapper.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.spring_mapper.entities.Post;
@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

}

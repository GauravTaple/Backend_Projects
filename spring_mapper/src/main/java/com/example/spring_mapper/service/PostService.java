package com.example.spring_mapper.service;

import java.util.List;

import com.example.spring_mapper.entities.Post;

public interface PostService {
	
	List<Post> getAllPosts();
	
	Post getPostById(long id);
	
	Post CreatePost(Post post);
	
	String DeletePostById(long id);
	
	Post updatePost(long id,Post post);
	
//	PostDTO updatePost(Long id, PostDTO postdto);

}

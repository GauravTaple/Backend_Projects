package com.example.spring_mapper.Controller;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring_mapper.DTO.PostDTO;
import com.example.spring_mapper.entities.Post;
import com.example.spring_mapper.service.PostService;

@RestController
public class PostController {

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private PostService postService;

	public PostController(PostService postService) {
		super();
		this.postService = postService;
		
	}

	//----------------------Get all the data --------------------------
	@GetMapping("/get")
	public  List<PostDTO> getAllPosts() {
		return postService.getAllPosts().stream().map(post -> modelMapper.map(post, PostDTO.class))
				.collect(Collectors.toList());

	}
	
	
	//------------------Get the data with id -------------------------------
	@GetMapping("/get/{id}")
	public PostDTO getPostById(@PathVariable(name="id") Long id)
	{
		Post postById2 = postService.getPostById(id);
	
		//Convert Entity to DTO
		return this.modelMapper.map(postById2,PostDTO.class);
	}
	
	
	//--------------------Create the data -------------------------------------
	@PostMapping("/post")
	public PostDTO CreatePost(@Valid @RequestBody PostDTO postdto)
	{
		//Convert DTO to Entity
		Post cp = this.modelMapper.map(postdto, Post.class);
		Post createPost = postService.CreatePost(cp);
		
		//Convert Entity to DTO
		return this.modelMapper.map(createPost, PostDTO.class);
		
	}
	
	//------------------Update the data by id-------------------------------
	@PutMapping("/put/{id}")
	public PostDTO UpdatePost(@Valid @PathVariable long id,@RequestBody PostDTO postdto)
	{
		//convert DTO to Entity
		Post convertEntity = modelMapper.map(postdto, Post.class);
		Post updatePost = postService.updatePost(id, convertEntity);
		
		//convert Entity to DTO
		return this.modelMapper.map(updatePost, PostDTO.class);
		
	}
	
	//--------------------Delete the data with id -----------------------------------------
	@DeleteMapping("/delete/{id}")
	public String DeletePostById(@PathVariable(name="id") Long id )
	{
		String deletePostById = postService.DeletePostById(id);
		return "Deleted Successfully";
		
	}

	

}

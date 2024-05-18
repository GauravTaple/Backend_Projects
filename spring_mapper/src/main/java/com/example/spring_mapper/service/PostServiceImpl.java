package com.example.spring_mapper.service;
	
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring_mapper.DTO.PostDTO;
import com.example.spring_mapper.entities.Post;
import com.example.spring_mapper.exceptions.ResourceNotFoundException;
import com.example.spring_mapper.repository.PostRepository;

@Service
public class PostServiceImpl implements PostService {

	@Autowired
	private final PostRepository postRepository;
	
	@Autowired
	private ModelMapper modelMapper;

	public PostServiceImpl(PostRepository postRepository) {
		super();
		this.postRepository = postRepository;
	}

	@Override
	public List<Post> getAllPosts() {
		return postRepository.findAll();
	}

	@Override
	public  Post getPostById(long id) {
		 Post GetById = postRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Post", "Id", id));
		 return GetById;
		
	}

	@Override
	public Post CreatePost(Post post) {
		return postRepository.save(post);
	}
	
//-----------------Update method withoud using posttodto method--------------------------------------------------------
	@Override
	public Post updatePost(long id, Post postRequest) {
		Post update = postRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Post", "id", id));
		update.setId(postRequest.getId());
		update.setTitle(postRequest.getTitle());
		update.setDescription(postRequest.getDescription());
		update.setContent(postRequest.getContent());
//    return update ;
		return postRepository.save(update);
//	}
	
	
//--------------------Update method using Posttodto method----------------------------------------------------------------
//	@Override
//	public Post updatePost(long id, Post postdto) {
//	Post post=this.postRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Post","id",id));
//	
//	post.setId(postdto.getId());
//	post.setTitle(postdto.getTitle());
//	post.setDescription(postdto.getDescription());
//	
//	return postRepository.save(post);
//	PostDTO posttoDTO = this.PosttoDTO(save);
//	return posttoDTO;
	}
	
//----------------------------------------------------------------------------------------------------------
	@Override
	public String DeletePostById(long id) {
		Post d = postRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Post","id", id));
		postRepository.delete(d);
		return "deleted";

	}
	

	
//---------------------------------------------------------------------------------------------------------------------------------
	//--------------Convert DTO to Entity using getters,setters-------------------
	public Post DTOtoPost(PostDTO postdto)
	{
		Post post=this.modelMapper.map(postdto, Post.class);
		return post;
				
//		Post post=new Post();
//		post.setId(postdto.getId());
//		post.setTitle(postdto.getTitle());
//		post.setDescription(postdto.getDescription());
//		post.setContent(postdto.getDescription());
//		return post;
	}
	
	//---------------Convert Entity To DTO using getters,setters---------------------
	public PostDTO PosttoDTO(Post post)
	{
		PostDTO postdto = this.modelMapper.map(post, PostDTO.class);
		return postdto;
		
		
//		PostDTO postdtop=new PostDTO();
//		postdtop.setId(post.getId());
//		postdtop.setTitle(post.getTitle());
//		postdtop.setDescription(post.getDescription());
//		return postdtop;
	}
}

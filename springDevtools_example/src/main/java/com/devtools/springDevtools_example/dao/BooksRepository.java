package com.devtools.springDevtools_example.dao;

import org.springframework.data.repository.CrudRepository;

import com.devtools.springDevtools_example.entities.Books;

public interface BooksRepository extends CrudRepository<Books, Integer> {
	
	public Books findById(int id);

}

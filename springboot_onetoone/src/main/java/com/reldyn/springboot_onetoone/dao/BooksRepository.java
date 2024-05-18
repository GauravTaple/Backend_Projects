package com.reldyn.springboot_onetoone.dao;

import org.springframework.data.repository.CrudRepository;
import com.reldyn.springboot_onetoone.entities.Books;

public interface BooksRepository extends CrudRepository<Books, Integer> {

	public Books findById(int id);
}

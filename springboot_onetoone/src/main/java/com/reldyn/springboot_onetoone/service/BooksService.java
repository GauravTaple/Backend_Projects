package com.reldyn.springboot_onetoone.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.reldyn.springboot_onetoone.dao.BooksRepository;
import com.reldyn.springboot_onetoone.entities.Books;
@Component
public class BooksService {

	@Autowired
	private BooksRepository bookrepository;

	// get all books
	public List<Books> getAllBooks() {
		List<Books> findAll = (List<Books>) this.bookrepository.findAll();
		return findAll;

	}

	// get single book
	public Books getSingleBook(int id) {
		Books book = null;
		try {

			book = this.bookrepository.findById(id);

		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		return book;

	}

	// add the book
	public Books addBook(Books b) {
		Books add = bookrepository.save(b);
		return add;

	}

	// delete book
	public void deletedBooks(int idd) {
		bookrepository.deleteById(idd);

	}

	// Update Book
	public void updatedBooks(Books bbb, int idd) {
		bbb.setId(idd);
		bookrepository.save(bbb);
	}

	//Delete All Books
	public void deletedAllBooks() {
		this.bookrepository.deleteAll();
		
	}

}

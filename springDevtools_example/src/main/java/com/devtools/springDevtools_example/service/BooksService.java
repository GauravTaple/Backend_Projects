package com.devtools.springDevtools_example.service;

import java.util.ArrayList;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.devtools.springDevtools_example.dao.BooksRepository;
import com.devtools.springDevtools_example.entities.Books;

@Component
public class BooksService {
	
	@Autowired
	private BooksRepository bookrepository;

//	private static List<Books> list = new ArrayList<>();
//
//	static {
//		list.add(new Books(10, "Java For Learning", "Grashoff"));
//		list.add(new Books(20, "Advance Java", "ABC"));
//		list.add(new Books(30, "Python", "LMN"));
//	}

	// get all books
	public List<Books> getAllBooks() {
//		return list;
		List<Books> findAll =(List<Books>)this.bookrepository.findAll();
		return findAll;
		
	}

	// get single book
	public Books getSingleBook(int id) {
		Books book=null;
		try {
//		book = list.stream().filter(j -> j.getId() == id).findFirst().get();
			
			book=this.bookrepository.findById(id);
			
		}catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		return book ;

	}

	// add the book
	public Books addBook(Books b) {
//		list.add(b);
//		return b;
		Books add=bookrepository.save(b);
		return add;

	}

	// delete book
	public void deletedBooks(int idd) {
//		list = list.stream().filter(book -> book.getId() != idd).collect(Collectors.toList());
	    bookrepository.deleteById(idd);
	
	}

	// Update Book
	public void updatedBooks(Books bbb, int idd) {
//		list=list.stream().map(b -> {
//			if (b.getId() == idd) {
//				b.setName(bbb.getName());
//				b.setAuthor(bbb.getAuthor());
//			}
//			return b;
//		}).collect(Collectors.toList());

		bbb.setId(idd);
		bookrepository.save(bbb);
	}

}

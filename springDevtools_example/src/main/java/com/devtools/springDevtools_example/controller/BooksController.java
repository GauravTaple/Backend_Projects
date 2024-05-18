package com.devtools.springDevtools_example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.devtools.springDevtools_example.entities.Books;
import com.devtools.springDevtools_example.service.BooksService;

@RestController
public class BooksController {

	@Autowired
	private BooksService service;

//-------------------------READ/GET------------------------------------------	
	// Get All Books
	
	@GetMapping("/books")
	public ResponseEntity<List<Books>> GetALLBooks() {
		List<Books> list = service.getAllBooks();
		if (list.size() <= 0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.status(HttpStatus.CREATED).body(list);

	}

	// Get Single Book using id")
	@GetMapping("/books/{id}")
	public ResponseEntity<Books> getbooks(@PathVariable("id") int idd) {
		Books b = service.getSingleBook(idd);
		if (b == null) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
		return ResponseEntity.of(Optional.of(b));

	}

//------------------------ADD/CREATE--------------------------------------------------
	// Adding the book
	
	@PostMapping("/books")
	public ResponseEntity<Books> addBooks(@RequestBody Books book) {
		Books b = null;
		try {
			b = this.service.addBook(book);
			System.out.println(b);
			return ResponseEntity.of(Optional.of(b));
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

	}

//---------------------------DELETE------------------------------------------
	// Delete The book
	
	@DeleteMapping("/books/{id}")
	public ResponseEntity<Object> deleteBooks(@PathVariable("id") int idd) {
		try {
			this.service.deletedBooks(idd);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(idd);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

	}

//---------------------------UPDATE------------------------------------------
	// Update the book
	
	@PutMapping("/books/{id}")
	public ResponseEntity<Books> updateBooks(@RequestBody Books bbb, @PathVariable("id") int idd) {
		try {
			this.service.updatedBooks(bbb, idd);
			return ResponseEntity.ok().body(bbb);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

	}

}

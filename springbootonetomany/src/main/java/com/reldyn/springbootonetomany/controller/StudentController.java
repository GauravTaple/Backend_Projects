package com.reldyn.springbootonetomany.controller;

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

import com.reldyn.springbootonetomany.entities.Student;
import com.reldyn.springbootonetomany.service.StudentService;

@RestController 
public class StudentController {

	@Autowired
	private StudentService service;

//-------------------------READ/GET------------------------------------------	
	// Get All Books

	@GetMapping("/book")
	public ResponseEntity<List<Student>> GetALLBooks() {
		List<Student> list = service.getAllBooks();
		if (list.size() <= 0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.status(HttpStatus.CREATED).body(list);

	}

	// Get Single Book using id")
	@GetMapping("/book/{id}")
	public ResponseEntity<Optional<Student>> getbooks(@PathVariable("id") int idd) {
		Optional<Student> b = Optional.ofNullable(service.getSingleBook(idd));
		if (b == null) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
		return ResponseEntity.of(Optional.of(b));

	}

//------------------------ADD/CREATE--------------------------------------------------
	// Adding the book

	@PostMapping("/book")
	public ResponseEntity<Student> addBooks(@RequestBody Student book) {
		Student b = null;
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
	// Delete The single book

	@DeleteMapping("/book/{id}")
	public ResponseEntity<Object> deleteBooks(@PathVariable("id") int idd) {
		try {
			this.service.deletedBooks(idd);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(idd);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

	}

	// Delete All the book
	@DeleteMapping("/book")
	public ResponseEntity<Object> deleteAllBooks() {
		try {
			this.service.deletedAllBooks();
			return ResponseEntity.status(HttpStatus.GONE).build();

		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

	}

//---------------------------UPDATE------------------------------------------
	// Update the book

	@PutMapping("/book/{id}")
	public ResponseEntity<Student> updateBooks(@RequestBody Student bbb, @PathVariable("id") int idd) {
		try {
			this.service.updatedBooks(bbb, idd);
			return ResponseEntity.ok().body(bbb);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

	}

}

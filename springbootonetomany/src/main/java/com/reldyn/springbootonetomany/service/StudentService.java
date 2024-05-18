package com.reldyn.springbootonetomany.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.reldyn.springbootonetomany.dao.StudentRepository;
import com.reldyn.springbootonetomany.entities.Student;

@Service
public class StudentService{
	
	@Autowired
	private StudentRepository studentRepository;

	// get all books
	public List<Student> getAllBooks() {
		List<Student> findAll = (List<Student>) this.studentRepository.findAll();
		return findAll;

	}

	// get single book
	public Student getSingleBook(int id) {
		Student book = null;
		try {

			book = this.studentRepository.findById(id);

		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		return book;

	}

	// add the book
	public Student addBook(Student b) {
		Student add = studentRepository.save(b);
		return add;

	}

	// delete book
	public void deletedBooks(int idd) {
		studentRepository.deleteById(idd);

	}

	// Update Book
	public void updatedBooks(Student bbb, int idd) {
		bbb.setId(idd);
		studentRepository.save(bbb);
	}

	//delete All the book
	public void deletedAllBooks() {
		this.studentRepository.deleteAll();
		
	}

}

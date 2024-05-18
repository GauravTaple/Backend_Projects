package com.spring.orm.dao;

import java.util.List;

import javax.sql.DataSource;
import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entities.Student;

public class StudentDao {
	private HibernateTemplate ht;

	public HibernateTemplate getHt() {
		return ht;
	}

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}
    
	//create operation
	@Transactional
	public int insert(Student student)
	{
		Integer save =(Integer)this.ht.save(student);
		return save;
	}
	
	//get/Read the single data
	public Student getStudent(int id) {
		Student student = this.ht.get(Student.class,id);
		return student;
	}
	
	//get/Read the All data(all rows)
	public List<Student> getAllsStudents(){
		List<Student> loadAll = this.ht.loadAll(Student.class);
		return loadAll;
	}
	
	//updating the data
	@Transactional
		public void updateStudent(Student student)
		{
			this.ht.update(student);
		}
	
	//deleting the data
	@Transactional
	public void deleteStudent(int id)
	{
		Student student = this.ht.get(Student.class, id);
		this.ht.delete(student);
	}
	
	
	
}

package com.reldyn.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.reldyn.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	//----------------Custom Finder Methods-----------------------------------------------
		public List<User> findByName(String name);
		
		public List<User> findByNameAndCity(String name, String city);
		
		public List<User> findByNameStartingWith(String Prefix);
		
		public List<User> findByIdLessThan(int id);
		
		@Query("select u from User u")
		public List<User> getAllUsers();
		
		@Query("select k from User k where k.name=:c and k.city=:p")
		public List<User> getUserByName(@Param("c") String name,@Param("p") String city);

//		@Query(value = "select * from User",nativeQuery = true)
//		public List<User> getUsers();



}

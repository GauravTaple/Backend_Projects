package com.reldyn;


import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.reldyn.dao.UserRepository;
import com.reldyn.entities.User;

@SpringBootApplication
public class SpringbootJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringbootJpaApplication.class, args);
		UserRepository userRepo = context.getBean(UserRepository.class);
		
		
//----------------------------CREATE-----------------------------------------------------
//-----------------Create The Object---------------------------------------------
				//1st object creation
				User user=new User();
				user.setName("Jubin"); 
				user.setCity("Mumbai");
				user.setStatus("Singer");
				
				//2nd object creation
				User user2=new User();
				user2.setName("shaharukh");
				user2.setCity("Navi Mumbai");
				user2.setStatus("Actor");	

//------------------------------SAVE--------------------------------------------
//-----------------save only one object----------------------------------------------
				
				User save = userRepo.save(user2);
				System.out.println(save);
				
////-----------------save all objects--------------------------------------------------
//				
//				List<User> of = List.of(user, user2);
//				Iterable<User> saveall=userRepo.saveAll(of);
				

//-------------------------------READ--------------------------------------------------		
//------------------find/get All Objects using lambda expression---------------------------------------------------
//				Iterable<User> findAll = userRepo.findAll();
//				findAll.forEach(t->System.out.println(t));
				
//------------------find the object by using id----------------------------------------------------
				
//				Optional<User> findById = userRepo.findById(1);
//				System.out.println(findById);
				
				
//-----------------------------UPDATE------------------------------------------------------		
//------------------update the object----------------------------------------------------
//				Optional<User> findById = userRepo.findById(8);
//				User user3 = findById.get();
//				user3.setName("Ritik Roshan");
//				user3.setStatus("Actor/Dancer");
//				user3.setCity("New Mumbai");
//				userRepo.save(user3);
//				System.out.println(user3);
				
				
//------------------------------DELETE-------------------------------------------------------	
//-------------------Delete the user element---------------------------------------------
//				userRepo.deleteById(1);
//				System.out.println("Deleted");
				
//--------------------Delete the All element-----------------------------
//				Iterable<User> findAll = userRepo.findAll();
//				findAll.forEach(j->System.out.println(j));
//				userRepo.deleteAll(findAll);
				
		       
//-------------------------------Custom Finder Methods-----------------------------------------
//				List<User> findByName = userRepo.findByName("Jubin");
//				findByName.forEach(t->System.out.println(t));
				
				
//				List<User> findByNameAndCity = userRepo.findByNameAndCity("Ritik Roshan", "New Mumbai");
//				findByNameAndCity.forEach(t->System.out.println(t));
				
//				List<User> findByNameStartingWith = userRepo.findByNameStartingWith("s");
//				findByNameStartingWith.forEach(j->System.out.println(j));
				
				
//				List<User> findByIdLessThan = userRepo.findByIdLessThan(10);
//				findByIdLessThan.forEach(j->System.out.println(j));
				
				
//--------------------------------JPQL Queries----------------------------------------------
//				List<User> allUsers = userRepo.getAllUsers();
//				allUsers.forEach(k->System.out.println(k));
				
				
//				List<User> userByName = userRepo.getUserByName("Jubin","Mumbai");
//				userByName.forEach(l->System.out.println(l));
				
//--------------------------------Native Queries-----------------------------------------------
				
//Note:-Native Queries is not running in spring boot version 2.7.9 then we need use
//spring boot version greater than 3.
				
//				userRepo.getUsers().forEach(k->System.out.println(k));
				
			}
	
	

	
	}


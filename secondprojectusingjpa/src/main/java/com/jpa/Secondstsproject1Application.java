package com.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.dao.UserRepository;
import com.jpa.entities.Users;

@SpringBootApplication
public class Secondstsproject1Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Secondstsproject1Application.class, args);
	
		UserRepository userRepository= context.getBean(UserRepository.class);
		
		// Create single user
//		Users users = new Users();
//		
//		users.setName("Mohit Jindal");
//		users.setCity("New Delhi");
//		users.setStatus("Java Programmer");
//		
//		Users user = userRepository.save(users);
//		
//		System.out.println(user);
		
		//Create multiple users
//		Users user1 = new Users();
//		
//		user1.setName("Mohit");
//		user1.setCity("Delhi");
//		user1.setStatus("Python Programmer");
//		
//        Users user2 = new Users();
//		
//		user2.setName("Shobhit");
//		user2.setCity("Delhi");
//		user2.setStatus("Java Programmer");
//		
//		//save multiples objects
//		List<Users> allUsers= List.of(user1, user2);
//		Iterable<Users> resultUsers= userRepository.saveAll(allUsers);
//		
//		resultUsers.forEach(Users -> {
//			System.out.println(Users);
//		});
//		
//		System.out.println("saved multiple users");
		
		
		// update - the user by id
//		Optional<Users> optional = userRepository.findById(52);
//		
//		Users users = optional.get();
//		users.setName("Rohan Sharma");
//		
//		Users update = userRepository.save(users);
//		System.out.println(update);
		
		
		// Get(read) - how to get the data by id and other methods
		// findById()-return optional containing your data
//		Optional<Users> optional = userRepository.findById(52);
//		
//		Users users = optional.get();
		
		// findAll()- return/iterate all data which is present in database.
//		Iterable<Users> itr = userRepository.findAll();
//		
//		itr.forEach(users ->{
//			System.out.println(users);
//		});
		
		
		
		// Delete - the user by id
		
//		userRepository.deleteById(53);
//		System.out.println("Deleted");
		
		// DeleteAll- Using Iterable
		
//		Iterable<Users> allUsers = userRepository.findAll();
//		
//		allUsers.forEach(users->{
//			System.out.println(users);
//		});
//	
//		userRepository.deleteAll(allUsers);
//		System.out.println(" Deleted");
		
		
		//Custome Finder methods/Derived Query methods
		
//		List<Users> users = userRepository.findByName("Mohit");		
//		users.forEach(e -> System.out.println(e));
		
//		List<Users> users = userRepository.findByNameAndCity("Mohit", "Delhi");
//		users.forEach(e -> System.out.println(e));
		
//		List<Users> allUsers = userRepository.getAllUsers();
//		allUsers.forEach(e -> System.out.println(e));
		
//		List<Users> user = userRepository.getUserByName("Shobhit");
//		user.forEach(e -> System.out.println(user));
//		
//		List<Users> userByNameAndCity = userRepository.getUserByNameAndCity("Mohit", "Delhi");
//		userByNameAndCity.forEach(e-> System.out.println(e));
		
		userRepository.getUsers().forEach(e-> System.out.println(e));
	}

}

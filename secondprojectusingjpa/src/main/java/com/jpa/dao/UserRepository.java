package com.jpa.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.jpa.entities.Users;

import java.util.List;

public interface UserRepository extends CrudRepository<Users, Integer>{

	public List<Users> findByName (String name);
	
	public List<Users> findByNameAndCity (String name, String city);
	
	
	//JPQL (Java Persistence Query Language)
	
	@Query("select u FROM Users u")
	public List<Users> getAllUsers();
	
	@Query("select u FROM Users u WHERE u.name =:n")
	public List<Users> getUserByName(@Param("n") String name);
	
	@Query("select u FROM Users u where u.name =:n and u.city =:c")
	public List<Users> getUserByNameAndCity(@Param("n") String name, @Param("c") String city);
	
	
	//Native Query
	
	@Query(value="select * from Users", nativeQuery = true)
	public List<Users> getUsers();
}

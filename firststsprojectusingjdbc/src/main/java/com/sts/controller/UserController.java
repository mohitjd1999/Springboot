package com.sts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserController {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	// create the table..
	public void createTable() {
		var query = "CREATE TABLE users(id SERIAL PRIMARY KEY, name varchar(255) NOT NULL, city VARCHAR(255))";
	    int update = this.jdbcTemplate.update(query);
	    System.out.println(update);
	}
	
	// inserting data 
	public void insertData(String name, String city) {
		String q = "insert into users(name, city) values(?,?)";
		int insert = this.jdbcTemplate.update(q, name, city);
		System.out.println(insert + " rows added");
	}
	
	// updating data 
	public void updateData(String name, String city, int id) {
		String q = "update users set name=?, city=? where id=?";
		int update = this.jdbcTemplate.update(q, name, city, id);
		System.out.println(update + " rows updated");
	}
	
	// deleting data
	public void deleteData(int id) {
		String q="delete from users where id=?";
		int delete = this.jdbcTemplate.update(q, id);
		System.out.println(delete + " rows deleted");
	}
	
	// delete table
	public void deleteTable() {
		var query = "DROP TABLE student";
	    int delete = this.jdbcTemplate.update(query);
	    System.out.println(delete);
	}
	
	

}

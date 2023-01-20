package com.sts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.sts.controller.UserController;

@SpringBootApplication
public class FirststsprojectApplication implements CommandLineRunner{
	
	@Autowired
	private UserController usercontroller;

	public static void main(String[] args) {
		SpringApplication.run(FirststsprojectApplication.class, args);		
	
	}

	@Override
	public void run(String... args) throws Exception {
		// createTable
//		this.usercontroller.createTable();
		
		// insertData
//		this.usercontroller.insertData("Mohit Jindal", "Delhi");
		
		// updateData
//		this.usercontroller.updateData("Akhil Jindal", "New Delhi" , 2);
		
		// deleteData
//		this.usercontroller.deleteData(2);

		// deleteTable
//		this.usercontroller.deleteTable();		
		
	}

}

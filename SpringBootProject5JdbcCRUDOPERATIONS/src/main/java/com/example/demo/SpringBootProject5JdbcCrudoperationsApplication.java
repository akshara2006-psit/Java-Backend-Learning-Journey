package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;

@SpringBootApplication
   class SpringBootProject5JdbcCrudoperationsApplication implements CommandLineRunner{
@Autowired
	private UserDao userDao;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootProject5JdbcCrudoperationsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User user1=new User();
		user1.setName("Akshara");
		user1.setEmail("gakshara21@gmail.com");
		user1.setGender("Female");
		
		boolean status=userDao.insertUser(user1);
		if(status) {
			System.out.println("User registered successfully");
		}
		else {
			System.out.println("OOPS! user not registered");
		}
		
	}

}

package com.example.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory; 
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.User;
//import com.sun.tools.javac.parser.Scanner;

@SpringBootApplication
public class SpringBootProjectHibernateCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProjectHibernateCrudApplication.class, args);
		Configuration cfg=new Configuration();
		cfg.configure("in/sp/config/HibernateConfig.xml");
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session=sessionFactory.openSession();
//		Transaction transaction=session.beginTransaction();


//		User user = new User();
//		user.setId(1L);
//		user.setName("Akshara Gupta");
//		user.setEmail("gakshu23@gmail.com");
//		user.setPassword("Akshu123");
//		user.setGender("Female");
//	user.setCity("Unnao");
//	
//
//		Transaction transaction = session.beginTransaction();
//
//		session.save(user);
//
//		transaction.commit();
//
//		System.out.println("Data Saved Successfully.");
//
//		session.close();
//		sessionFactory.close();
	
		try {
			User user=session.get(User.class, 1L);
			if(user!=null) {
			System.out.println(user.getName());
			System.out.println(user.getEmail());
		}
			else{
				System.out.println("User not found");
			}

	}
		catch(Exception e) {
	e.printStackTrace();
			}
		}

			
		}

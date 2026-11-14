package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.beans.Student;

@SpringBootApplication
public class SpringBootProject3Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProject3Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		stdId().display();
		
	}
	public Student stdId() {
		return new Student("Akshara",125,99.5f);
	}

}

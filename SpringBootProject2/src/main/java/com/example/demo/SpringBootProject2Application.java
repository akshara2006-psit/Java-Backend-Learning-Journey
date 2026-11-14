package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootProject2Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProject2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	myclass().printMessage("Akshara");
		
	}
	@Bean 
	public MyClass myclass() {
		return new MyClass();
		
	}

}

package com.example.demo.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.beans.Student;

@Configuration
public class AppConfig {
	@Bean
	public CommandLineRunner cmdLineRunner() {
		return new CommandLineRunner() {
			public void run(String ...args) throws Exception{
				sdt().display();
			}
		};
		
	}
	@Bean
public Student sdt() {
	return new Student("Akshara",125,99.5f);
}


}

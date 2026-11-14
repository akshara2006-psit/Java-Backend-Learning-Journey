 package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Student;

@Configuration
public class SpringConfigfile {
@Bean
public Student std1() {
	Student std=new Student();
	std.setName("Akshara");
	std.setEmail("akshu12@gmail.com");
	std.setRollno(125) ;
	return std;
	
}
}

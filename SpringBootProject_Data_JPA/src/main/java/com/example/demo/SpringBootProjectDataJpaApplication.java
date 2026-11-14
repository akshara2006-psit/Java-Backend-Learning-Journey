package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.entity.Student;
import com.example.demo.service.*;
import com.example.demo.service.StudentServiceImpl;
@SpringBootApplication
public class SpringBootProjectDataJpaApplication {

	public static void main(String[] args) {
	ApplicationContext context=SpringApplication.run(SpringBootProjectDataJpaApplication.class, args);
		StudentService stdService=context.getBean(StudentServiceImpl.class);	
//--------------------insert operation--------------
		
		//Student std=new Student();
//std.setName("Akshara");
//std.setRollno(125);
//std.setMarks(96);
//	boolean status=	stdService.addStudentDetails(std);
//	if(status) {
//		System.out.println("Student inserted successfully");
//	}
//	else {
//		System.out.println("Student not inserted due to some error");
//	}
	
		//-------------select opeartion1-------------
//		List<Student> stdList=stdService.getAllStdDetails();
//		for(Student std:stdList) {
//			System.out.println("id: "+std.getId());
//			System.out.println("Name: "+std.getName());
//			System.out.println("Roll no: "+std.getRollno());
//			System.out.println("Marks: "+std.getMarks());
//			System.out.println("----------------------------------");
//		}
//		----------------update-----
		boolean status=stdService.updateStdDetails(1L, 99);
		if(status) {
			System.out.println("Updated successfully");
		}
		else {
			System.out.println("not updated");
		}
	}

}

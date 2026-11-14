package in.sp.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sp.beans.Student;
import in.sp.resources.SpringConfigfile;

import org.springframework.context.ApplicationContext;
public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfigfile.class);
Student std=(Student)context.getBean("std1");
std.display();
	}

}

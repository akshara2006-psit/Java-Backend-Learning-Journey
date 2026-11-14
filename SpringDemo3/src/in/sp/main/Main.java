package in.sp.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

import org.springframework.context.ApplicationContext;
public class Main {

	public static void main(String[] args) {
		String resource_file_path="in/sp/resources/applicationcontext.xml";
		ApplicationContext context=new ClassPathXmlApplicationContext(resource_file_path);
		Student std=(Student)context.getBean("student");
std.display();
	}

}

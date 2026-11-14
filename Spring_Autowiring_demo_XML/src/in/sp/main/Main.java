package in.sp.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

import org.springframework.context.ApplicationContext;
public class Main {
public static void main(String[] args) {
String configPath="in/sp/resources/applicationcontext.xml";
ApplicationContext context=new ClassPathXmlApplicationContext(configPath);
Student std=(Student)context.getBean("stdId");
std.display();
}
}

package in.sp.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sp.beans.Student;
import in.sp.resources.SpringconfigFile;

import org.springframework.context.ApplicationContext;
public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(SpringconfigFile.class);
		Student st=(Student)context.getBean("stdId");
		st.display();
		

	}

}

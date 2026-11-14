package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

public class Main {

	public static void main(String[] args) {
		String res_path="in/sp/resources/applicationcontext.xml";
		ApplicationContext context=new ClassPathXmlApplicationContext(res_path);
		Student st=(Student)context.getBean("stdId");
		st.display();
	}
 
}

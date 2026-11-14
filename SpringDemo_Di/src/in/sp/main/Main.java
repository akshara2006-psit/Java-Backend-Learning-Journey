package in.sp.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

import org.springframework.context.ApplicationContext;
public class Main {

	public static void main(String[] args) {
		String resourc_path="in/sp/resources/applicationcontext.xml";
	ApplicationContext context=new ClassPathXmlApplicationContext(resourc_path);
	Student st=(Student)context.getBean("stdId");
st.display();
	}

}

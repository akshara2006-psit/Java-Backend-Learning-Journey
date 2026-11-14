package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;

@Configuration
public class SpringconfigFile {
@Bean
public  Address addrid() {
	Address ad=new Address();
	ad.setHouseno(15);
	ad.setCity("unnao");
	ad.setPincode(209859);
	return ad;
}
@Bean
public Student stdId() {
	Student st=new Student();
	st.setName("Akshara");
	st.setRollno(125);
	st.setAddress(addrid());
	return st;
}
}

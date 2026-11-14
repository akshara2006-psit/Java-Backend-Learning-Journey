package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;

@Configuration
public class SpringConfigFile {
	@Bean
public Address createAddrObj() {
	Address addr=new Address();
	addr.setHouseno(164);
	addr.setCity("unnao");
	addr.setPincode(209859);
	return addr;
}
	@Bean
	public Student createStdObj() {
		Student std=new Student();
		std.setName("Akshara");
		std.setRollno(125);
//		std.setAddress(createAddrObj()); //manually dependency injection
		return std;
	}
}

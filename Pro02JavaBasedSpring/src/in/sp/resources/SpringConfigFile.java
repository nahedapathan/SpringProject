package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Student;

@Configuration
public class SpringConfigFile {
   
	@Bean("beanName")
	public Student createStdBeanObj()
	{
		Student std=new Student();
		std.setName("Kamal");
		std.setRollno(103);
		std.setEmail("Kamal@gmail.com");
		return std;
	}
}

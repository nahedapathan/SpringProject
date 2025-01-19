package in.sp.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;
import in.sp.beans.Subjects;

@Configuration
public class SpringConfigFile {

	@Bean
	public Address createAddrObj1()
	{
		Address addr=new Address();
		
		addr.setHouseno(100);
		addr.setCity("Delhi");
		addr.setPincode(12345);
		
		return addr;
	}
	
	@Bean
	public Address createAddrObj2()
	{
		Address addr=new Address();
		
		addr.setHouseno(103);
		addr.setCity("Latur");
		addr.setPincode(12333);
		
		return addr;
	}
	
	@Bean
	public Subjects createSubObj()
	{
		Subjects sub=new Subjects();
		
		List<String> sub_list=new ArrayList<String>();
		sub_list.add("Java");
		sub_list.add("Python");
		sub_list.add("C++");
		
		sub.setSubjects(sub_list);
		
		return sub;
	}
	
	@Bean
	public Student createStdObj()
	{
		Student std=new Student();
		std.setRollno(101);
		std.setName("Deepak");
		std.setAddress(createAddrObj1());
		
		return std;
	}
}

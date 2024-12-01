package com.tka;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable
public class StudentConfig {

	@Bean(name="s1")
	public Student getStudent()
	{
		return new Student(100,"prathemesh","pune");
	}
	
	@Bean(name="s2")
	public Student getStudent2()
	{
		return new Student(200,"Priya","Mumbai");
	}
}

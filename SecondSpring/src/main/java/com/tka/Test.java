package com.tka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(StudentConfig.class);
		
		Student std=context.getBean("s1",Student.class);
		System.out.println(std);
		
		Student std2=context.getBean("s2",Student.class);
		System.out.println(std2);
	}
}

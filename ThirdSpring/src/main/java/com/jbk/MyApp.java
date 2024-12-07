package com.jbk;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		
		//Book b1=context.getBean("book1",Book.class);
		//System.out.println(b1);
		
		//Library l1=context.getBean(Library.class);
		//System.out.println(l1);
		
		Library2 l2=context.getBean(Library2.class);
		System.out.println(l2);
	}
}

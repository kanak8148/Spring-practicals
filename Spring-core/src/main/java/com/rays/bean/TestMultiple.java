package com.rays.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMultiple {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Multiple.xml");
		UserBean user = (UserBean)context.getBean("user");
		Person person = (Person)context.getBean("person");
		
		
		System.out.println("user Name :"+user.getLogin());
		System.out.println("user password:"+user.getPassword());
		System.out.println("Person Name"+person.getName());
		
	}

}

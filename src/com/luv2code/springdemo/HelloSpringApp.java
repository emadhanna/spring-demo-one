package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// Load the Spring Configuration File
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve Bean from Spring Container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		// Call Methods on the Bean
		System.out.println(theCoach.getDailyWorkout());
		
		// Close the Context
		context.close();
	}

}

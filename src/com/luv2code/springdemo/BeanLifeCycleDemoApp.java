package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {

		//Load Spring Configuration File
		ClassPathXmlApplicationContext myContext = 
				new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		//Retrieve Bean from Spring Container
		Coach theCoach = myContext.getBean("myCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		//Close the Context
		myContext.close();
	}

}

package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {

		//Load Spring Configuration File
		ClassPathXmlApplicationContext myContext = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//Retrieve Bean from Spring Container
		Coach theCoach = myContext.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = myContext.getBean("myCoach", Coach.class);
		
		//Check if those are the same Beans
		boolean result = (theCoach == alphaCoach);
		
		//Print out the result
		System.out.println("\nPointing to thr same object " + result);
		System.out.println("\nThe memory location for theCoach " + theCoach);
		System.out.println("\nThe memory location for alphaCoach " + alphaCoach);
		
		//Close the Context
		myContext.close();
	}

}

package com.luv2code.springdemo;

public class BaseballCoach implements Coach{

	//Define a private field
	private FortuneService fortuneService;
	
	public BaseballCoach() {
		super();
	}

	//Define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		
		this.fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		
		//Use my FortuneService to get a fortune
		return fortuneService.getFortune();
	}
}

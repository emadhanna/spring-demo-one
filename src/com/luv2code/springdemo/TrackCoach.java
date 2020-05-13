package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	//Define a private field
	private FortuneService fortuneService;
	
	public TrackCoach() {
		super();
	}

	//Define a constructor for dependency injection
	public TrackCoach(FortuneService theFortuneService) {
		
		this.fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		
		//Use my FortuneService to get a fortune
		return "Just do it: " + fortuneService.getFortune();
	}
	
	//Add an init method
	public void doMyStartupStuff() {
		
		System.out.println("TrackCoach: inside method doMyStartupStuff()");
	}
	
	//Add a destroy method
	public void doMyCleanupStuffYoYo() {
		
		System.out.println("TrackCoach: inside method doMyCleanupStuffYoYo()");
	}
}

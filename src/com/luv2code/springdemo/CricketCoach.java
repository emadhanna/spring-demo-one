package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	public CricketCoach() {
		super();
		System.out.println("CricketCoach: inside no args constructor");
	
	}

	public void setFortuneService(FortuneService fortuneService) {
		
		System.out.println("CricketCoach: inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	
	}

	public void setEmailAddress(String emailAddress) {
		
		System.out.println("CricketCoach: inside setter method - setEmailAdress");
		this.emailAddress = emailAddress;
	
	}

	public void setTeam(String team) {
		
		System.out.println("CricketCoach: inside setter method - setTeam");
		this.team = team;
	
	}
	
	public String getEmailAddress() {

		return emailAddress;
	
	}

	public String getTeam() {

		return team;
	
	}
	
	public FortuneService getFortuneService() {

		return fortuneService;
	
	}

	@Override
	public String getDailyWorkout() {

		return "Practice fast balling for 15 minutes";
	
	}

	@Override
	public String getDailyFortune() {
	
		return fortuneService.getFortune();
	
	}
}

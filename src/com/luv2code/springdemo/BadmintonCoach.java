package com.luv2code.springdemo;

public class BadmintonCoach implements Coach {
	
	private FortuneService seeStar;
	
	

	public BadmintonCoach(FortuneService seeStar) {
		this.seeStar = seeStar;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Hit the ball like vocano";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return seeStar.getFortune();
	}

}








package com.luv2code.springdemo;

public class StarFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		String[] fortune = {"BIGGEST","SMALL","NO"};
		int o = (int)(Math.random()*fortune.length);
		return "You got a " + fortune[o] + " star";
	}

}

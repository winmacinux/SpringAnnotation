package com.codes;

import org.springframework.stereotype.Component;

//@Component for Default Bean Id
//TennisCoach --> bean-id: tennisCoach

//@Component("thatSillyCoach")
@Component
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Do daily workout";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "You are doing well.";
	}

}

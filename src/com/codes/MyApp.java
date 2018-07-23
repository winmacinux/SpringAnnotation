package com.codes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/cf/applicationConfiguration.xml");
		
//		Coach theCoach = context.getBean("thatSillyCoach", Coach.class);
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		System.out.println(theCoach.getDailyWorkout());
		context.close();
		
	}

}

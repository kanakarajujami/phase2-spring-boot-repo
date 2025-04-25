package com.nt.service;

import org.springframework.stereotype.Component;

@Component
public class InteractiveQuiz implements LearningMode {

	@Override
	public void startSession() {
	
		System.out.println("Session starts at 2PM by InteractiveQuiz");
		
	}

	@Override
	public void endSession() {

		System.out.println("Session starts at 4PM ");
	}

	@Override
	public void calculateCompletionPercentage(int lessonsCompleted) {

		double per=(lessonsCompleted/LearningMode.totalSessions)*100;
		 System.out.println("Session completion percentage:"+per);

		
	}

}

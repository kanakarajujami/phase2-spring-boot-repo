package com.nt.service;

import org.springframework.stereotype.Component;

@Component
public class LiveSession implements LearningMode {

	@Override
	public void startSession() {
        System.out.println("Session starts at 11AM by LiveSession");
	}

	@Override
	public void endSession() {
     
		System.out.println("Session ends at 1PM ");
	}

	@Override
	public void calculateCompletionPercentage(int lessonsCompleted) {
	
		double per=(lessonsCompleted/LearningMode.totalSessions)*100;
		 System.out.println("Session completion percentage:"+per);

	}

}

package com.nt.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Video implements LearningMode {

	@Override
	public void startSession() {
	   
		  System.out.println("Session starts at 9:00AM through Video");
	}

	@Override
	public void endSession() {
	
        System.out.println("Session ends at 11:00AM  ");
	}

	@Override
	public void calculateCompletionPercentage(int lessonsCompleted) {
	
		       double per=lessonsCompleted/LearningMode.totalSessions*100;
		   System.out.println("Session complete percentage:"+per);
	}

}

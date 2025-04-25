package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.nt.service.LearningMode;

@Component
public class ELearningPlatform {

	@Autowired
   @Qualifier("liveSession")
	private LearningMode mode;
	
	public void learningPlatform() {
		System.out.println("We are providing Online and Offline along with QuizInteraction");
		mode.startSession();
		mode.endSession();
		mode.calculateCompletionPercentage(55);
	}
}

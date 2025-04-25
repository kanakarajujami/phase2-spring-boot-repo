package com.nt.service;

public interface LearningMode {
     public static final  double totalSessions=60;
	 public void startSession();
	 public void endSession();
	public void calculateCompletionPercentage(int lessonsCompleted);
}

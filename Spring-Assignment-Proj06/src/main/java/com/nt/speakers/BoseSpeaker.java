package com.nt.speakers;

import org.springframework.stereotype.Component;

@Component("boseSpeaker")
public class BoseSpeaker implements Speakers {

	@Override
	public void makeSound() {

		System.out.println("Bose speaker is giving good premium experience..");

	}

}

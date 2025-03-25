package com.nt.speakers;

import org.springframework.stereotype.Component;

@Component("sonySpeaker")
public class SonySpeaker implements Speakers {

	@Override
	public void makeSound() {
	
		System.out.println("Sony speaker playing music very nice");

	}

}

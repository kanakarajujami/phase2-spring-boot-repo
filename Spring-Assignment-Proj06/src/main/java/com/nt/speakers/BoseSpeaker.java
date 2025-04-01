package com.nt.speakers;

import org.springframework.stereotype.Component;

@Component("boseSpeaker")
public class BoseSpeaker implements Speakers {

	@Override
	public String makeSound(Song song) {
		
		return "playing song with "+song.getTitle()+" singer name:"+song.getSinger();
	}

}

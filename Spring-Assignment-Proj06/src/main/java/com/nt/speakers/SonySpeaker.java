package com.nt.speakers;

import org.springframework.stereotype.Component;

import com.nt.service.Song;

@Component("sonySpeaker")
public class SonySpeaker implements Speakers {
	
	 

	@Override
	public String makeSound(Song song) {
	
		return "Song title: "+song.getTitle()+" ----singer name:"+song.getSinger();
		
	}

}

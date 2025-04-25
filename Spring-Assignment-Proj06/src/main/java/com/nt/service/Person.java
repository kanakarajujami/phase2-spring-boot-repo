package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

	  @Autowired
	  public Vehicle vehicle;

	  @Autowired
	  private Song song;
	  
	 
	  public void trip() {
			/*
			 * Song song =new Song(); song.setTitle("Are You Entertained");
			 * song.setSinger("Ed sheeran");
			 */
		  System.out.println("Person going to trip....");
		  System.out.println(song.getSinger());
		  String sng= vehicle.playMusic(true,song);
	      System.out.println(sng);
		  System.out.println("Person visiting the bengulure");
		  
	  }
	  
	 
}

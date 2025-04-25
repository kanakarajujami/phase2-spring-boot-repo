package com.nt.service;

import org.springframework.stereotype.Component;

@Component("musicPlayer")
public class MusicPlayer {

	  public void playMusic() {
		  
       System.out.println("Playing music...");
       try {
    	   Thread.sleep(5000);
       }catch (InterruptedException e) {
		   e.printStackTrace();
	   }
    }
}
package com.nt.service;

import org.springframework.stereotype.Component;

public class Song {

	 private String title;
	 private String singer;
	 
	 
	public Song(String title, String singer) {
		super();
		this.title = title;
		this.singer = singer;
	}
	
	

	public void setTitle(String title) {
		this.title = title;
	}



	public void setSinger(String singer) {
		this.singer = singer;
	}



	public String getTitle() {
		return title;
	}
	
	public String getSinger() {
		return singer;
	}
	
	 
	 
}

package com.nt.model;

import java.io.Serializable;

public class Actor implements Serializable {
	String name;
	String addr;
	String movie;
	public Actor(String name, String addr, String movie) {
		super();
		this.name = name;
		this.addr = addr;
		this.movie = movie;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getMovie() {
		return movie;
	}
	public void setMovie(String movie) {
		this.movie = movie;
	}
	
	
}

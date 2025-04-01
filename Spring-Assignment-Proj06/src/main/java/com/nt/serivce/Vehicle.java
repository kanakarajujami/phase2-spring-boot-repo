package com.nt.serivce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nt.speakers.Song;

@Component
public class Vehicle {

	 @Autowired
	 private VehicleService service;
	 
	 @Autowired
	  Song song;
	 
	 public void vehicleDrive() {
		 System.out.println("Vehicle is started....");
		 service.getTyres().rotate();
		System.out.println( service.getSpeakers().makeSound(song));
		 System.out.println("Vehicle is going on....");
	 }
}

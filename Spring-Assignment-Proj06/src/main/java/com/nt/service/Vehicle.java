package com.nt.service;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Vehicle {

	Logger logger=Logger.getLogger(Vehicle.class.getName());
	 @Autowired
	 private VehicleService service;
 
	 // Song song=new Song();
	  
	 
	 public String playMusic(boolean isVehicleStarted, Song song ) {
		 
		 
		 String music=null;
		 if(isVehicleStarted) {
			 music=service.getSpeakers().makeSound(song);
			
		     System.out.println(music);
		 }else {
			logger.info("Vehicle is not started");
		 }
		 
		 
		 return music;
			/*
			 * System.out.println("Vehicle is started...."); service.getTyres().rotate();
			 * System.out.println( service.getSpeakers().makeSound(true,song));
			 * System.out.println("Vehicle is going on....");
			 */
		 
		
	 }
}

package com.nt.serivce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {

	 @Autowired
	 private VehicleService service;
	 
	 public void vehicleDrive() {
		 System.out.println("Vehicle is started....");
		 service.getTyres().rotate();
		 service.getSpeakers().makeSound();
		 System.out.println("Vehicle is going on....");
	 }
}

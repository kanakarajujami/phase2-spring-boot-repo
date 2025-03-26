package com.nt.serivce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

	  @Autowired
	  public Vehicle vehicle;
	  
	  public void trip() {
		  System.out.println("Person going to trip....");
		  vehicle.vehicleDrive();
		  
		  System.out.println("Person visiting the bengulure");
	  }
	 
}

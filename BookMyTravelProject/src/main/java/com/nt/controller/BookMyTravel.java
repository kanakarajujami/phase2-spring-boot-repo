package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.nt.service.TransportMode;

@Component
public class BookMyTravel {
      @Autowired
    @Qualifier("taxi")
      //@Qualifier("train")
	  TransportMode mode;
	 public void bookTravel() {
		 System.out.println("We are providing different type of  booking travels like Bus,Train,Taxi ");
		 mode.startTransport();
		 mode.stopTransport();
		System.out.println( "Distance is:"+mode.calculateFare(900));
	 }
}

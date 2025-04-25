package com.nt.service;

import org.springframework.stereotype.Component;

@Component
public class Taxi implements TransportMode {

	@Override
	public void startTransport() {
	
		System.out.println("Departure from Vizayawada by Taxi");

	}

	@Override
	public void stopTransport() {
	    System.out.println("Arrival in  Tirupathi");
	}

	@Override
	public double calculateFare(Integer distance) {
		// TODO Auto-generated method stub
		return distance;
	}

}

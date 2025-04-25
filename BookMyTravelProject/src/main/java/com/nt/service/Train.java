package com.nt.service;

import org.springframework.stereotype.Component;

@Component
public class Train implements TransportMode {

	@Override
	public void startTransport() {
	
		System.out.println("Departure from Benguluru by Train");
		}

	@Override
	public void stopTransport() {
		
		System.out.println("Arrival in Visakhpattanam");
	}

	@Override
	public double calculateFare(Integer distance) {
	
		return distance;
	}

}

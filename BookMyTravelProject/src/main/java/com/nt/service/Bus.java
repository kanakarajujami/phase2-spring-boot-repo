package com.nt.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class Bus implements TransportMode {

	@Override
	public void startTransport() {
	    System.out.println("Departure from Visakhapattam by bus");
	}

	@Override
	public void stopTransport() {
             System.out.println("Arrival in Hyderabad");
	}

	@Override
	public double calculateFare(Integer distance) {
	
		return distance;
	}

}

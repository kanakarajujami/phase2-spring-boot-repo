package com.nt.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("electric")
public class ElectricEngine implements Engine {
    @Value("${engine.type}")
	private String engine;
	@Override
	public void start() {
	 
		 System.out.println(engine+" is attaged to vehicle and started..");
	}

	@Override
	public void stop() {
	
		 System.out.println("Vehicle is stopped");

	}

}

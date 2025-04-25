package com.nt.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("diesel")
public class DIeselEngine implements Engine {

	@Value("${engine.type}")
	private String engine;
	@Override
	public void start() {
		
		System.out.println(engine+" is attached to vehicle and started");

	}

	@Override
	public void stop() {
          System.out.println("Engine is stopped...");
	}

}

package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.Car;

@Component
public class CarRunner implements CommandLineRunner {

	@Autowired
	private Car car;
	@Override
	public void run(String... args) throws Exception {
	
		car.start(false);
		
	}

}

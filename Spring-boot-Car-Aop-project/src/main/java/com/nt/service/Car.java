package com.nt.service;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.nt.tyres.Tyres;

@Component
public class Car {
//car class
	private Logger logger=Logger.getLogger(Car.class.getName());
	@Autowired
	private MusicPlayer musicPlayer;
	@Autowired
	@Qualifier("mRFTyre")
	private Tyres tyres;
	public void start(Boolean isKey) {
		if(isKey) {
			System.out.println("Car is started");
			tyres.rotate();
			musicPlayer.playMusic();
			
		}else {
		//	logger.info("Car is not started");
			throw new RuntimeException("Car is not started");
		}
		
	}
	}

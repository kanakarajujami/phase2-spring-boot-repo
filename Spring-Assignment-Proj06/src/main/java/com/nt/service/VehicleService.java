
package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.nt.speakers.Speakers;
import com.nt.tyres.Tyres;

@Component("vehicleService")
public class VehicleService {

	@Autowired
@Qualifier("boseSpeaker")
	private Speakers speakers;
	
	@Autowired
	@Qualifier("brideStoneTyres")
	private Tyres tyres;

	public Speakers getSpeakers() {
		return speakers;
	}

	public Tyres getTyres() {
		return tyres;
	}

	
	
}

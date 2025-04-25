package com.nt.tyres;

import org.springframework.stereotype.Component;

@Component("mRFTyre")
public class MRFTyre implements Tyres {

	@Override
	public void rotate() {
	
		System.out.println("MRF tyres are rotating  with excelllent grip");

	}

}

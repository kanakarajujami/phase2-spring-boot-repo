package com.nt.beans;

import org.springframework.stereotype.Component;

@Component("hyundai")
public class Hyundai implements Car {

	@Override
	public void price() {
	
		 System.out.println("Hyundai price starts on 15.6 lakhs");
	}

}
